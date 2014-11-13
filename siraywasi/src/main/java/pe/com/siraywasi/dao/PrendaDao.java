package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.dto.PrendaMantenimientoDTO;

public interface PrendaDao {
	public List<Prenda> listadoPrenda();
	public List<PrendaMantenimientoDTO> listadoMantenimientoPrenda();
}
