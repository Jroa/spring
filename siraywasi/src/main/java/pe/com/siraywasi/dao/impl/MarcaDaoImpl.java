package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MarcaDao;
import pe.com.siraywasi.model.Marca;

@Repository
public class MarcaDaoImpl extends SimpleJdbcDaoSupport implements MarcaDao {

	@Autowired
	public MarcaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<Marca> listadoMarca() {
		String sql = "select idMarca, nombreMarca from Marca";		
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<Marca> listadoMarca = new ArrayList<Marca>();
		
		Marca marca = null;
		for(Map<String, Object> row: rows){
			marca = new Marca();
			marca.setIdMarca((Integer)row.get("idMarca"));
			marca.setNombreMarca((String)row.get("nombreMarca"));
			listadoMarca.add(marca);
		}
		return listadoMarca;
	}
}
