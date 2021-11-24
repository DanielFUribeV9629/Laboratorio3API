package com.api.semaforo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.semaforo.modelo.SemaforoInfo;
import com.api.semaforo.servicio.ApiSemaforoServicio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/semaforo")
public class ApiSemaforoControlador {

	@Autowired
	ApiSemaforoServicio apiSemaforoServicio;
	
	@GetMapping("/prueba")
	public String prueba() {
		return apiSemaforoServicio.prueba();
	}
	
	@GetMapping("/get/{llave}")
	public Optional<SemaforoInfo> findById(@PathVariable("llave") int id) {
		return apiSemaforoServicio.findById(id);
	}
	
	@GetMapping("/get/all")
	public List<SemaforoInfo> getAll() {
		return apiSemaforoServicio.getAll();
	}
	
	@GetMapping("/get/server/{server_id}")
	public List<SemaforoInfo> findByServer_id(@PathVariable("server_id") int id) {
		return apiSemaforoServicio.findByServer_id(id);
	}
	
	@PostMapping("/create_request")
	public String add(@RequestBody List<SemaforoInfo> semaf){
		return apiSemaforoServicio.add(semaf);
	}	
	
	@PutMapping("/edit")
	public String edit(@RequestBody List<SemaforoInfo> semaf){
		return apiSemaforoServicio.edit(semaf);
	}		
	
}
