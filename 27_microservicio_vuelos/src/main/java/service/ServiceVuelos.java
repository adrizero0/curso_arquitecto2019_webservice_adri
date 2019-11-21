package service;

import java.util.List;

import model.Vuelo;

public interface ServiceVuelos {
	List<Vuelo> getVuelosDisponibles(int plazas);
	void actualizarVuelo(int idVuelo, int plazas);
}