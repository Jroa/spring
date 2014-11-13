package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTejido;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.PrendaMantenimientoDTO;

public interface PrendaService {
	public List<Prenda> listadoPrenda();
	public List<TipoTela> listadoTipoTela();
	public List<TipoPrenda> listadoTipoPrenda();
	public List<TipoTejido> listadoTipoTejido();
	public List<PrendaMantenimientoDTO> listadoMantenimientoPrenda();	
}
