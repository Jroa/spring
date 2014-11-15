package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.dto.PresupuestoTotalDTO;

public interface PresupuestoDao {
	public List<PresupuestoTotalDTO> listadoResumenTotal(int idPresupuesto);
}
