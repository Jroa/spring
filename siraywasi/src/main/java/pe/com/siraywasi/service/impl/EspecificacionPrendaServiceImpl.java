package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.ColorDao;
import pe.com.siraywasi.dao.EspecificacionPrendaDao;
import pe.com.siraywasi.dao.TallaDao;
import pe.com.siraywasi.model.Color;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.EspecificacionPrendaResumenDTO;
import pe.com.siraywasi.service.EspecificacionPrendaService;

@Service
public class EspecificacionPrendaServiceImpl implements EspecificacionPrendaService{

	@Autowired
	private EspecificacionPrendaDao especificacionPrendaDao; 
	
	@Autowired
	private TallaDao tallaDao;
	
	@Autowired
	private ColorDao colorDao;
	
	@Override
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda() {
		List<EspecificacionPrendaDTO> listadoEspecficacionPrenda = especificacionPrendaDao.listadoEspecificacionPrenda();
		return listadoEspecficacionPrenda;
	}

	@Override
	public String[] listadoTallas() {
		String listadoTallas[] = tallaDao.listadoTallas();
 		return listadoTallas;
	}

	@Override
	public List<EspecificacionPrendaResumenDTO> listadoEspecificacionPrendaResumen() {
		List<EspecificacionPrendaResumenDTO> listadoEspecificacionPrendaResumen = especificacionPrendaDao.listadoEspecificacionPrendaResumen();
		return listadoEspecificacionPrendaResumen;
	}

	@Override
	public List<Color> listadoColor() {
		List<Color> listadoColor = colorDao.listadoColor();
		return listadoColor;
	}
}
