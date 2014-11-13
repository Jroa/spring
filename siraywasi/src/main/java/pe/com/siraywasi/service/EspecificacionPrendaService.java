package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.Color;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.EspecificacionPrendaResumenDTO;

public interface EspecificacionPrendaService {
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda();
	public String[] listadoTallas();
	public List<EspecificacionPrendaResumenDTO> listadoEspecificacionPrendaResumen();
	public List<Color> listadoColor();
}
