package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

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
		List<Marca> listadoMarca = new ArrayList<Marca>();
		Marca marca = null;
		
		marca = new Marca(1,"Rey");
		listadoMarca.add(marca);
		marca = new Marca(2,"Marca 2");
		listadoMarca.add(marca);
	
		return listadoMarca;
	}

}
