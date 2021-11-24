package com.api.semaforo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEMAFOROS")
public class SemaforoInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int llave;
	private int client_id;
	private int cant_semaforos;
	private int luz_red_broken;
	private int luz_yellow_broken;
	private int luz_green_broken;	
	private int group_id;	
	private int serverId;
		
	public SemaforoInfo() {
		
	}
	
	public SemaforoInfo(int cant_semaforos, int luz_red_broken, int luz_yellow_broken, int luz_green_broken,
			int client_id, int group_id, int serverId, int llave) {
		super();
		this.cant_semaforos = cant_semaforos;
		this.luz_red_broken = luz_red_broken;
		this.luz_yellow_broken = luz_yellow_broken;
		this.luz_green_broken = luz_green_broken;
		this.client_id = client_id;
		this.group_id = group_id;
		this.serverId = serverId;
		this.llave = llave;
	}
	
	public int getLlave() {
		return llave;
	}
	public void setLlave(int llave) {
		this.llave = llave;
	}
	public int getCant_semaforos() {
		return cant_semaforos;
	}
	public void setCant_semaforos(int cant_semaforos) {
		this.cant_semaforos = cant_semaforos;
	}
	public int getLuz_red_broken() {
		return luz_red_broken;
	}
	public void setLuz_red_broken(int luz_red_broken) {
		this.luz_red_broken = luz_red_broken;
	}
	public int getLuz_yellow_broken() {
		return luz_yellow_broken;
	}
	public void setLuz_yellow_broken(int luz_yellow_broken) {
		this.luz_yellow_broken = luz_yellow_broken;
	}
	public int getLuz_green_broken() {
		return luz_green_broken;
	}
	public void setLuz_green_broken(int luz_green_broken) {
		this.luz_green_broken = luz_green_broken;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}	
	
}
