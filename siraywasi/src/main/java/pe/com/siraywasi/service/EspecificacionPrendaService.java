package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;

public interface EspecificacionPrendaService {
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda();
	public List<TipoTela> listadoTipoTela();
	public List<Prenda> listadoPrenda();
	public List<TipoPrenda> listadoTipoPrenda();
}
