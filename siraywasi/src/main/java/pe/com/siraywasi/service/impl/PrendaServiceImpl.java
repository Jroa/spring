package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.PrendaDao;
import pe.com.siraywasi.dao.TipoPrendaDao;
import pe.com.siraywasi.dao.TipoTejidoDao;
import pe.com.siraywasi.dao.TipoTelaDao;
import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTejido;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.PrendaMantenimientoDTO;
import pe.com.siraywasi.service.PrendaService;

@Service
public class PrendaServiceImpl implements PrendaService {

	@Autowired
	PrendaDao prendaDao;
	
	@Autowired
	private TipoTelaDao tipoTelaDao;
	
	@Autowired
	private TipoPrendaDao tipoPrendaDao;
	
	@Autowired
	private TipoTejidoDao tipoTejidoDao;
	
	@Override
	public List<Prenda> listadoPrenda() {
		List<Prenda> listadoPrenda = prendaDao.listadoPrenda();
		return listadoPrenda;
	}

	@Override
	public List<PrendaMantenimientoDTO> listadoMantenimientoPrenda() {
		List<PrendaMantenimientoDTO> listadoMantenimientoPrenda = prendaDao.listadoMantenimientoPrenda();
		return listadoMantenimientoPrenda;
	}

	@Override
	public List<TipoTela> listadoTipoTela() {
		List<TipoTela> listadoTipoTela = tipoTelaDao.listadoTipoTela(); 
		return listadoTipoTela;
	}

	@Override
	public List<TipoPrenda> listadoTipoPrenda() {
		List<TipoPrenda> listadoTipoPrenda = tipoPrendaDao.listadoTipoPrenda();
		return listadoTipoPrenda;
	}

	@Override
	public List<TipoTejido> listadoTipoTejido() {
		List<TipoTejido> listadoTipoTejido = tipoTejidoDao.listadoTipoTejido();
		return listadoTipoTejido;
	}
}
