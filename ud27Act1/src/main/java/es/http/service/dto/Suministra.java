package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "suministra")
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "codigopieza")
	Piezas piezas;
	
	@ManyToOne
	@JoinColumn(name = "idproveedor")
	Proveedores proveedores;
	
	@Column(name = "precio")
	private int  precio;

	public Suministra() {
		
	}
	
	public Suministra(int id, Piezas piezas, Proveedores proveedores, int precio) {
		super();
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piezas getPiezas() {
		return piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
