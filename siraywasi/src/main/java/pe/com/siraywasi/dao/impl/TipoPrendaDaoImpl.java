package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoPrendaDao;
import pe.com.siraywasi.model.TipoPrenda;

@Repository
public class TipoPrendaDaoImpl extends SimpleJdbcDaoSupport implements TipoPrendaDao {

	@Autowired
	public TipoPrendaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<TipoPrenda> listadoTipoPrenda() {
		List<TipoPrenda> listadoTipoPrenda = new ArrayList<TipoPrenda>();
		
		TipoPrenda tipoPrenda = null;
		tipoPrenda = new TipoPrenda(1,"Cuello Alto");
		listadoTipoPrenda.add(tipoPrenda);

		tipoPrenda = new TipoPrenda(2,"Cuello Bajo");
		listadoTipoPrenda.add(tipoPrenda);
		
		return listadoTipoPrenda;
	}

}
