package com.api.semaforo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.semaforo.modelo.SemaforoActualizado;
import com.api.semaforo.repositorio.ApiSemaforoActualizadoRepositorio;

@Service
public class ApiSemaforoActualizadoServicio {
	
	@Autowired
	ApiSemaforoActualizadoRepositorio apiSemaforoActualizadoRepositorio;

	public String prueba() {
		return "Hola";
	}
	
	public List<SemaforoActualizado> getAll() {
		return (List<SemaforoActualizado>) apiSemaforoActualizadoRepositorio.findAll();
	}
	
	public Optional<SemaforoActualizado> findById(int id) {
		return apiSemaforoActualizadoRepositorio.findById(id);
	}
	
	public List<SemaforoActualizado> findByServer_id(int id) {
		return apiSemaforoActualizadoRepositorio.findByServerId(id);
	}
	
	public String add(List<SemaforoActualizado> semaf) {
		String response;
		if (apiSemaforoActualizadoRepositorio.saveAll(semaf) != null)
			response = "Succesfully added";
		else
			response = "Not added";
		return response;
	}

	public String edit(List<SemaforoActualizado> semaf) {
		String response;		
		if (apiSemaforoActualizadoRepositorio.saveAll(semaf) != null)
			response = "Succesfully updated";
		else
			response = "Not updated";
		return response;
	}
	
}
