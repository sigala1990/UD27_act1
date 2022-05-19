package es.http.service.services;

import java.util.List;

import es.http.service.dto.Piezas;

public interface IPiezasService {

	//Metodos del CRUD
	public List<Piezas> listarPiezas(); //Listar All 
	
	public Piezas guardarPiezas(Piezas piezas);	//Guarda un Piezas CREATE
	
	public Piezas piezasXID(int id); //Leer datos de un Piezas READ
	
	public Piezas actualizarPiezas(Piezas piezas); //Actualiza datos del Piezas UPDATE
	
	public void eliminarPiezas(int id);// Elimina el Piezas DELETE

}

