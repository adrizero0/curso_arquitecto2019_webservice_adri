package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import daos.DaoVuelos;
import model.Vuelo;

@Service("sVuelos")
public class ServiceVuelosImpl implements ServiceVuelos {
	@Autowired
	DaoVuelos daoVuelos;

	@Override
	public List<Vuelo> getVuelosDisponibles(int plazas) {
		return daoVuelos.findVuelosByDisponibilidad(plazas);
	}

	@Transactional
	@Override
	public void actualizarVuelo(int idVuelo, int plazas) {
		if(daoVuelos.existsById(idVuelo)) {
			List<Vuelo> vuelosDisp= getVuelosDisponibles(plazas);
			for(Vuelo v:vuelosDisp) {
				if(v.getIdvuelo()==idVuelo) {
					v.setPlazas(v.getPlazas()-plazas);
					daoVuelos.flush();
				}
			}
		}
	}
}
