package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.AvioDao;
import pe.com.siraywasi.model.Avio;

@Repository
public class AvioDaoImpl extends SimpleJdbcDaoSupport implements AvioDao {

	@Autowired
	public AvioDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<Avio> listadoAvio() {
		String sql = "select idAvio, nombreAvio from Avio";		
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<Avio> listadoAvio = new ArrayList<Avio>();
		
		Avio avio = null;
		for(Map<String, Object> row: rows){
			avio = new Avio();
			avio.setIdAvio((Integer)row.get("idAvio"));
			avio.setNombreAvio((String)row.get("nombreAvio"));
			listadoAvio.add(avio);
		}
		return listadoAvio;
	}

}
