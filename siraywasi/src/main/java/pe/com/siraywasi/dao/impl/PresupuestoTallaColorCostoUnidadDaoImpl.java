package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PresupuestoTallaColorCostoUnidadDao;
import pe.com.siraywasi.model.dto.PresupuestoMateriaPrimaTallaDTO;

@Repository
public class PresupuestoTallaColorCostoUnidadDaoImpl extends SimpleJdbcDaoSupport implements
		PresupuestoTallaColorCostoUnidadDao {

	@Autowired
	public PresupuestoTallaColorCostoUnidadDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<PresupuestoMateriaPrimaTallaDTO> listadoPresupuestoMateriaPrimaTalla(
			int idPresupuesto, String tipoTalla) {
		
		List<PresupuestoMateriaPrimaTallaDTO> listado = new ArrayList<PresupuestoMateriaPrimaTallaDTO>();
		PresupuestoMateriaPrimaTallaDTO item = null;
		
		if (tipoTalla =="S"){

			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Polar Azul Marino Flecee", 256, 16.64, 1468.09, "S");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Popelina", 256, 16.64, 1468.09, "S");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Bordado", 256, 16.64, 1468.09, "S");
			listado.add(item);
			
			return listado;			
		}

		if (tipoTalla =="M"){
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Polar Azul Marino Flecee", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Popelina", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Bordado", 256, 16.64, 1468.09, "M");
			listado.add(item);
			
			return listado;		
		}		

		if (tipoTalla =="L"){
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Polar Azul Marino Flecee", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Popelina", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Bordado", 256, 16.64, 1468.09, "M");
			listado.add(item);
			
			return listado;					
		}		
	
		if (tipoTalla =="XL"){
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Polar Azul Marino Flecee", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Popelina", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Bordado", 256, 16.64, 1468.09, "M");
			listado.add(item);
			
			return listado;					
		}		
		
		if (tipoTalla =="T"){
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Polar Azul Marino Flecee", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Popelina", 256, 16.64, 1468.09, "M");
			listado.add(item);
			item = new PresupuestoMateriaPrimaTallaDTO("1", "Directo", "Bordado", 256, 16.64, 1468.09, "M");
			listado.add(item);
			
			return listado;					
		}		
		
		return null;
	}

}
