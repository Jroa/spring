package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.EspecificacionPrendaDao;
import pe.com.siraywasi.dao.PrendaDao;
import pe.com.siraywasi.dao.TipoPrendaDao;
import pe.com.siraywasi.dao.TipoTelaDao;
import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.service.EspecificacionPrendaService;

@Service
public class EspecificacionPrendaServiceImpl implements EspecificacionPrendaService{

	@Autowired
	private EspecificacionPrendaDao especificacionPrendaDao; 
	
	@Autowired
	private TipoTelaDao tipoTelaDao;
	
	@Autowired
	private PrendaDao prendaDao;
	
	@Autowired
	private TipoPrendaDao tipoPrendaDao;
	
	@Override
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda() {
		List<EspecificacionPrendaDTO> listadoEspecficacionPrenda = especificacionPrendaDao.listadoEspecificacionPrenda();
		return listadoEspecficacionPrenda;
	}

	@Override
	public List<TipoTela> listadoTipoTela() {
		List<TipoTela> listadoTipoTela = tipoTelaDao.listadoTipoTela(); 
		return listadoTipoTela;
	}

	@Override
	public List<Prenda> listadoPrenda() {
		List<Prenda> listadoPrenda = prendaDao.listadoPrenda();
		return listadoPrenda;
	}

	@Override
	public List<TipoPrenda> listadoTipoPrenda() {
		List<TipoPrenda> listadoTipoPrenda = tipoPrendaDao.listadoTipoPrenda();
		return listadoTipoPrenda;
	}
}
