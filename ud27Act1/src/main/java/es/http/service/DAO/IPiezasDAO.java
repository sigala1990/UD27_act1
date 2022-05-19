package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Integer>{

}
