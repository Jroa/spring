package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.dto.PresupuestoMateriaPrimaTallaDTO;
import pe.com.siraywasi.model.dto.PresupuestoTotalDTO;

public interface PresupuestoService {
	public List<PresupuestoMateriaPrimaTallaDTO> listadoPresupuestoMateriaPrimaTalla(int idPresupuesto, String tipoTalla) ;
	public List<PresupuestoTotalDTO> listadoResumenTotal(int idPresupuesto);
}
