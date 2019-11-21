package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Vuelo;
import service.ServiceVuelos;

@RestController
public class VueloController {
	@Autowired
	ServiceVuelos sVuelos;
	
	@GetMapping (value = "/vuelos/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> autenticar(@PathVariable("plazas") int plazas) {
		return sVuelos.getVuelosDisponibles(plazas);
	}
	
	@PutMapping (value = "/vuelos/{idVuelo}/{plazas}")
	public void actualizar(@PathVariable("idVuelo") int idVuelo,
							@PathVariable("plazas") int plazas) {
		sVuelos.actualizarVuelo(idVuelo, plazas);
	}
}
