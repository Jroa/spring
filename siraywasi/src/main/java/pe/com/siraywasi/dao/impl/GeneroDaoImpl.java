package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.GeneroDao;
import pe.com.siraywasi.model.Genero;

@Repository
public class GeneroDaoImpl extends SimpleJdbcDaoSupport implements GeneroDao {

	@Autowired
	public GeneroDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<Genero> listaGenero() {
		List<Genero> listaGenero = new ArrayList<Genero>();
		Genero genero = null;
		genero = new Genero(1,"Hombre");
		listaGenero.add(genero);
		genero = new Genero(2,"Mujer");
		listaGenero.add(genero);
		
		return listaGenero;
		
	}
}
