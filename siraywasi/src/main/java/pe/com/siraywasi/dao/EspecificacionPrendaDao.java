package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.EspecificacionPrendaResumenDTO;

public interface EspecificacionPrendaDao {
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda();
	public List<EspecificacionPrendaResumenDTO> listadoEspecificacionPrendaResumen();
}
