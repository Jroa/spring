package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.PlanProduccionTallaDao;
import pe.com.siraywasi.dao.PlanProduccionTallerDao;
import pe.com.siraywasi.model.dto.PlanProduccionTallaResumenDTO;
import pe.com.siraywasi.model.dto.PlanProduccionTallerResumenDTO;
import pe.com.siraywasi.service.PlanProduccionService;

@Service
public class PlanProduccionServiceImpl implements PlanProduccionService {

	@Autowired
	private PlanProduccionTallaDao planProduccionTallaDao;
	
	@Autowired
	private PlanProduccionTallerDao planProduccionTallerDao;
	
	@Override
	public List<PlanProduccionTallaResumenDTO> listadoPlanProduccionTallasResumen() {
		List<PlanProduccionTallaResumenDTO> listadoPlanProduccionTallasResumen = planProduccionTallaDao.listadoPlanProduccionTallasResumen();
		return listadoPlanProduccionTallasResumen;
	}

	@Override
	public List<PlanProduccionTallerResumenDTO> listadoTalleresResumen() {
		List<PlanProduccionTallerResumenDTO> listadoTalleresResumen = planProduccionTallerDao.listadoTalleresResumen();
		return listadoTalleresResumen;
	}

}
