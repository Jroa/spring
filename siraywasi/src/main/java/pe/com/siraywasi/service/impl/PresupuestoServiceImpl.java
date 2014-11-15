package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.PresupuestoDao;
import pe.com.siraywasi.dao.PresupuestoTallaColorCostoUnidadDao;
import pe.com.siraywasi.model.dto.PresupuestoMateriaPrimaTallaDTO;
import pe.com.siraywasi.model.dto.PresupuestoTotalDTO;
import pe.com.siraywasi.service.PresupuestoService;

@Service
public class PresupuestoServiceImpl implements PresupuestoService {

	@Autowired
	PresupuestoTallaColorCostoUnidadDao presupuestoTallaColorCostoUnidadDao; 
	
	@Autowired
	PresupuestoDao presupuestoDao;
	
	@Override
	public List<PresupuestoMateriaPrimaTallaDTO> listadoPresupuestoMateriaPrimaTalla(
			int idPresupuesto, String tipoTalla) {
		
		List<PresupuestoMateriaPrimaTallaDTO> listadoPresupuestoMateriaPrimaTalla =  presupuestoTallaColorCostoUnidadDao.listadoPresupuestoMateriaPrimaTalla(idPresupuesto, tipoTalla);
		
		return listadoPresupuestoMateriaPrimaTalla;
	}

	@Override
	public List<PresupuestoTotalDTO> listadoResumenTotal(int idPresupuesto) {
		List<PresupuestoTotalDTO> listadoResumenTotal = presupuestoDao.listadoResumenTotal(idPresupuesto);
		return listadoResumenTotal;
	}

}
