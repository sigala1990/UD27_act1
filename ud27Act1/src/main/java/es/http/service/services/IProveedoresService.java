package es.http.service.services;

import java.util.List;

import es.http.service.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda un Proveedores CREATE
	
	public Proveedores proveedoresXID(String id); //Leer datos de un Proveedores READ
	
	public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos del Proveedores UPDATE
	
	public void eliminarProveedores(String id);// Elimina el Proveedores DELETE

}
