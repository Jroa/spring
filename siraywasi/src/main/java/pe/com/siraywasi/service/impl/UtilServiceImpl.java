package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.GeneroDao;
import pe.com.siraywasi.model.Genero;
import pe.com.siraywasi.service.UtilService;

@Service
public class UtilServiceImpl implements UtilService{

	@Autowired
	private GeneroDao generoDao;
	
	@Override
	public List<Genero> listaGenero() {
		List<Genero> listaGenero = generoDao.listaGenero();
		return listaGenero;
	}

}
