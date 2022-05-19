package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String> {

}
