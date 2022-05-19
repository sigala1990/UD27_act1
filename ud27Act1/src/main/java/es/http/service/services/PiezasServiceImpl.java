package es.http.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.DAO.IPiezasDAO;
import es.http.service.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {

	@Autowired
	IPiezasDAO iPiezasDAO;

	@Override
	public List<Piezas> listarPiezas() {
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas guardarPiezas(Piezas piezas) {
		return iPiezasDAO.save(piezas);
	}

	@Override
	public Piezas piezasXID(int id) {
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarPiezas(Piezas piezas) {
		return iPiezasDAO.save(piezas);
	}

	@Override
	public void eliminarPiezas(int id) {
		iPiezasDAO.deleteById(id);
	}
}
