package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.UnidadMedidaDao;
import pe.com.siraywasi.model.UnidadMedida;

@Repository
public class UnidadMedidaDaoImpl extends SimpleJdbcDaoSupport implements UnidadMedidaDao {

	@Autowired
	public UnidadMedidaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}		
	
	@Override
	public List<UnidadMedida> listadoUnidadMedida() {
		String sql = "select idUnidadMedida, nombreUnidadMedida from UnidadMedida";
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);		
		List<UnidadMedida> listadoUnidadMedida = new ArrayList<UnidadMedida>();
		
		UnidadMedida unidadMedida = null;
		
		for(Map<String, Object> row: rows){
			unidadMedida = new UnidadMedida();
			unidadMedida.setIdUnidadMedida((Integer)row.get("idUnidadMedida"));
			unidadMedida.setNombreUnidadMedida((String)row.get("nombreUnidadMedida"));
			listadoUnidadMedida.add(unidadMedida);
		}
		
		return listadoUnidadMedida;
	}

}
