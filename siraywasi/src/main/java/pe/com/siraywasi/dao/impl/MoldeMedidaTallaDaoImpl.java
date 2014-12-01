package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MoldeMedidaTallaDao;
import pe.com.siraywasi.model.dto.MoldeMedidaTallaDTO;

@Repository
public class MoldeMedidaTallaDaoImpl extends SimpleJdbcDaoSupport implements MoldeMedidaTallaDao {

	@Autowired
	public MoldeMedidaTallaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}		
	
	@Override
	public List<MoldeMedidaTallaDTO> listadoMoldeMedidaTalla(int idMolde, String tipoTalla) {
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS = new ArrayList<MoldeMedidaTallaDTO>(); 
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM = new ArrayList<MoldeMedidaTallaDTO>();
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL = new ArrayList<MoldeMedidaTallaDTO>();
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL = new ArrayList<MoldeMedidaTallaDTO>();
		MoldeMedidaTallaDTO moldeMedidaTallaDTO = null;
		
		if (tipoTalla == "S"){
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Largo del frente total", "13", "12 1/8", "S");
			listadoMoldeMedidaTallaS.add(moldeMedidaTallaDTO);
			
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Tiro Frente", "13", "12 1/8", "S");
			listadoMoldeMedidaTallaS.add(moldeMedidaTallaDTO);	
			
			return listadoMoldeMedidaTallaS;
		}
		
	
		if (tipoTalla == "M"){
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Largo del frente total", "13", "12 3/4", "M");
			listadoMoldeMedidaTallaM.add(moldeMedidaTallaDTO);

			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Tiro Frente", "13", "12 1/8", "M");
			listadoMoldeMedidaTallaM.add(moldeMedidaTallaDTO);				
			
			return listadoMoldeMedidaTallaM;
		}
	
		
		if (tipoTalla == "L"){
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Largo del frente total", "14", "13 3/4", "L");
			listadoMoldeMedidaTallaL.add(moldeMedidaTallaDTO);
	
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Tiro Frente", "13", "12 1/8", "L");
			listadoMoldeMedidaTallaL.add(moldeMedidaTallaDTO);
			
			return listadoMoldeMedidaTallaL;
		}
		
		
		if (tipoTalla == "XL"){
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Largo del frente total", "15", "14", "XL");
			listadoMoldeMedidaTallaXL.add(moldeMedidaTallaDTO);
			
			moldeMedidaTallaDTO = new MoldeMedidaTallaDTO(1, 1, 1, "Tiro Frente", "13", "12 1/8", "XL");
			listadoMoldeMedidaTallaXL.add(moldeMedidaTallaDTO);
			
			return listadoMoldeMedidaTallaXL;
		}
		
		return null;
	}

}
