package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PlanProduccionTallaDao;
import pe.com.siraywasi.model.dto.PlanProduccionTallaResumenDTO;

@Repository
public class PlanProduccionTallaDaoImpl extends SimpleJdbcDaoSupport implements PlanProduccionTallaDao{

	@Autowired
	public PlanProduccionTallaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<PlanProduccionTallaResumenDTO> listadoPlanProduccionTallasResumen() {
		List<PlanProduccionTallaResumenDTO> listadoPlanProduccionTallasResumen = new ArrayList<PlanProduccionTallaResumenDTO>(); 
		
		PlanProduccionTallaResumenDTO resumenTalla = null;
		resumenTalla = new PlanProduccionTallaResumenDTO(1,"S",100);
		listadoPlanProduccionTallasResumen.add(resumenTalla);

		resumenTalla = new PlanProduccionTallaResumenDTO(1,"M",200);
		listadoPlanProduccionTallasResumen.add(resumenTalla);

		resumenTalla = new PlanProduccionTallaResumenDTO(1,"L",700);
		listadoPlanProduccionTallasResumen.add(resumenTalla);
		
		
		return listadoPlanProduccionTallasResumen;
	}

}
