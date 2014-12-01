package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.ColorDao;
import pe.com.siraywasi.model.Color;

@Repository
public class ColorDaoImpl extends SimpleJdbcDaoSupport implements ColorDao{

	@Autowired
	public ColorDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<Color> listadoColor() {
		List<Color> listadoColor = new ArrayList<Color>();
		Color item = null;
		item = new Color (1, "Blanco");
		listadoColor.add(item);
		item = new Color (2, "Azul");
		listadoColor.add(item);
		item = new Color (3, "Verde");
		listadoColor.add(item);
		item = new Color (4, "Rosado");
		listadoColor.add(item);
		
		return listadoColor;
	}

}
