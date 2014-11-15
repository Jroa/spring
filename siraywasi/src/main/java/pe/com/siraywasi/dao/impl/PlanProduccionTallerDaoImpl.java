package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PlanProduccionTallerDao;
import pe.com.siraywasi.model.dto.PlanProduccionTallerResumenDTO;

@Repository
public class PlanProduccionTallerDaoImpl implements PlanProduccionTallerDao {

	@Override
	public List<PlanProduccionTallerResumenDTO> listadoTalleresResumen() {
		List<PlanProduccionTallerResumenDTO> listadoResumen = new ArrayList<PlanProduccionTallerResumenDTO>();
		PlanProduccionTallerResumenDTO item = null;

		item = new PlanProduccionTallerResumenDTO("Azul", "S", 300, "Bordado", "Modarna", "20/10/2014");
		listadoResumen.add(item);

		item = new PlanProduccionTallerResumenDTO("Blanco", "M", 700, "Costura", "Acupunto", "25/10/2014");
		listadoResumen.add(item);

		item = new PlanProduccionTallerResumenDTO("Rojo", "M", 700, "Costura", "Acupunto", "25/10/2014");
		listadoResumen.add(item);
		
		return listadoResumen;
	}
}
