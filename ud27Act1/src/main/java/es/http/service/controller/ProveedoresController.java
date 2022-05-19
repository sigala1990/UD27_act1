package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Proveedores;
import es.http.service.services.ProveedoresServiceImpl;
@RestController
@RequestMapping("/api")
public class ProveedoresController {


	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarCproveedoress(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		
		return proveedoresServiceImpl.guardarProveedores(proveedores);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedoresXID(@PathVariable(name="id") String id) {
		
		Proveedores Proveedores_xid= new Proveedores();
		
		Proveedores_xid=proveedoresServiceImpl.proveedoresXID(id);
		
		//System.out.println("Proveedores XID: "+Proveedores_xid);
		
		return Proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")String id,@RequestBody Proveedores proveedores) {
		
		Proveedores Proveedores_seleccionado= new Proveedores();
		Proveedores Proveedores_actualizado= new Proveedores();
		
		Proveedores_seleccionado= proveedoresServiceImpl.proveedoresXID(id);
		
		Proveedores_seleccionado.setNombre(proveedores.getNombre());
		
		Proveedores_actualizado = proveedoresServiceImpl.actualizarProveedores(Proveedores_seleccionado);
		
		//System.out.println("El Proveedores actualizado es: "+ Proveedores_actualizado);
		
		return Proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eleiminarProveedores(@PathVariable(name="id")String id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
	
}
