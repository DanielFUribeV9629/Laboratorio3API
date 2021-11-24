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

import com.api.semaforo.modelo.SemaforoActualizado;
import com.api.semaforo.servicio.ApiSemaforoActualizadoServicio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/semaforoAct")
public class ApiSemaforoActualizadoControlador {

	@Autowired
	ApiSemaforoActualizadoServicio apiSemaforoActualizadoServicio;
	
	@GetMapping("/prueba")
	public String prueba() {
		return apiSemaforoActualizadoServicio.prueba();
	}
	
	@GetMapping("/get/{llave}")
	public Optional<SemaforoActualizado> findById(@PathVariable("llave") int id) {
		return apiSemaforoActualizadoServicio.findById(id);
	}
	
	@GetMapping("/get/all")
	public List<SemaforoActualizado> getAll() {
		return apiSemaforoActualizadoServicio.getAll();
	}
	
	@GetMapping("/get/server/{server_id}")
	public List<SemaforoActualizado> findByServer_id(@PathVariable("server_id") int id) {
		return apiSemaforoActualizadoServicio.findByServer_id(id);
	}
	
	@PostMapping("/create_request")
	public String add(@RequestBody List<SemaforoActualizado> semaf){
		return apiSemaforoActualizadoServicio.add(semaf);
	}	
	
	@PutMapping("/edit")
	public String edit(@RequestBody List<SemaforoActualizado> semaf){
		return apiSemaforoActualizadoServicio.edit(semaf);
	}		
	
}
