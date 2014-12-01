package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MoldeOperacionDao;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;

@Repository
public class MoldeOperacionDaoImpl extends SimpleJdbcDaoSupport implements MoldeOperacionDao {

	@Autowired
	public MoldeOperacionDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<MoldeOperacionDTO> listadoMoldeOperacion(int idMolde) {
		List<MoldeOperacionDTO> listadoMoldeOperacion = new ArrayList<MoldeOperacionDTO>();
		MoldeOperacionDTO moldeOperacionDTO = null;
		moldeOperacionDTO = new MoldeOperacionDTO(1,1, "Hombros");
		listadoMoldeOperacion.add(moldeOperacionDTO);
		moldeOperacionDTO = new MoldeOperacionDTO(1,1, "Basta");
		listadoMoldeOperacion.add(moldeOperacionDTO);
		moldeOperacionDTO = new MoldeOperacionDTO(1,1, "Puños");
		listadoMoldeOperacion.add(moldeOperacionDTO);
		
		return listadoMoldeOperacion;
	}

}
