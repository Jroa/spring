package pe.com.siraywasi.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TallaDao;

@Repository
public class TallaDaoImpl extends SimpleJdbcDaoSupport implements TallaDao {

	@Autowired
	public TallaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public String[] listadoTallas() {
		String[] tallas = new String[]{"XS","S","M","L","XL","2XL"};
		return tallas;
	}
}
