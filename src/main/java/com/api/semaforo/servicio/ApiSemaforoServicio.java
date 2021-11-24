package com.api.semaforo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.semaforo.modelo.SemaforoInfo;
import com.api.semaforo.repositorio.ApiSemaforoRepositorio;

@Service
public class ApiSemaforoServicio {
	
	@Autowired
	ApiSemaforoRepositorio apiSemaforoRepositorio;

	public String prueba() {
		return "Hola";
	}
	
	public List<SemaforoInfo> getAll() {
		return (List<SemaforoInfo>) apiSemaforoRepositorio.findAll();
	}
	
	public Optional<SemaforoInfo> findById(int id) {
		return apiSemaforoRepositorio.findById(id);
	}
	
	public List<SemaforoInfo> findByServer_id(int id) {
		return apiSemaforoRepositorio.findByServerId(id);
	}
	
	public String add(List<SemaforoInfo> semaf) {
		String response;
		if (apiSemaforoRepositorio.saveAll(semaf) != null)
			response = "Succesfully added";
		else
			response = "Not added";
		return response;
	}

	public String edit(List<SemaforoInfo> semaf) {
		String response;		
		if (apiSemaforoRepositorio.saveAll(semaf) != null)
			response = "Succesfully updated";
		else
			response = "Not updated";
		return response;
	}
	
}
