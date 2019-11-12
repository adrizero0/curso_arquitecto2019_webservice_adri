package service;

import java.util.List;

import model.Contacto;

public interface ServiceContacto {
	List<Contacto> recuperarcontactos();
	Contacto buscarPorEmail(String email);
	boolean eliminarPorId(int idContacto);
	boolean altaContacto(Contacto contacto);
}
