package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PlanProduccionTallerDao;
import pe.com.siraywasi.model.dto.PlanProduccionTallerResumenDTO;

@Repository
public class PlanProduccionTallerDaoImpl extends SimpleJdbcDaoSupport implements PlanProduccionTallerDao {

	@Autowired
	public PlanProduccionTallerDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	
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
