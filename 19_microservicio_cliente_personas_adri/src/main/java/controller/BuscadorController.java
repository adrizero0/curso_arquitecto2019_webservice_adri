package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Persona;

@RestController
public class BuscadorController {
	@GetMapping(value= "/buscar/{email}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Persona buscarPersona(@PathVariable("email") String email) {
		return null;
	}
	
}
