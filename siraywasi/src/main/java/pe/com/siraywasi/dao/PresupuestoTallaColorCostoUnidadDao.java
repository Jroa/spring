package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.dto.PresupuestoMateriaPrimaTallaDTO;

public interface PresupuestoTallaColorCostoUnidadDao {
	public List<PresupuestoMateriaPrimaTallaDTO> listadoPresupuestoMateriaPrimaTalla(int idPresupuesto, String tipoTalla);
}
