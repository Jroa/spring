package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.dto.PlanProduccionTallaResumenDTO;
import pe.com.siraywasi.model.dto.PlanProduccionTallerResumenDTO;

public interface PlanProduccionService {
	public List<PlanProduccionTallaResumenDTO> listadoPlanProduccionTallasResumen();
	public List<PlanProduccionTallerResumenDTO> listadoTalleresResumen();
}
