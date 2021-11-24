package com.api.semaforo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.semaforo.modelo.SemaforoActualizado;

@Repository
public interface ApiSemaforoActualizadoRepositorio extends JpaRepository<SemaforoActualizado, Integer>{
	
	public List<SemaforoActualizado> findByServerId(int id);
	
}
