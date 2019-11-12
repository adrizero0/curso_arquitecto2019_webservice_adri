package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import daos.DaoContactos;
import model.Contacto;

@Service("sCajero")
public class ServiceContactoImpl implements ServiceContacto {
	@Autowired
	DaoContactos daoContactos;
	
	@Override
	public List<Contacto> recuperarcontactos() {
		return daoContactos.findAll();
	}

	@Override
	public Contacto buscarPorEmail(String email) {
		return daoContactos.findContactoByEmail(email);
	}
	
	@Transactional
	@Override
	public boolean eliminarPorId(int idContacto) {
		if(daoContactos.existsById(idContacto)) {
		daoContactos.deleteById(idContacto);
		return true;
		}else {
		return false;
		}
	}

	@Transactional
	@Override
	public boolean altaContacto(Contacto contacto) {
		if(!daoContactos.existsById(contacto.getIdContacto())) {
			daoContactos.save(contacto);
			return true;
		}else {
			return false;
		}
	}

}
