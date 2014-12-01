package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoTejidoDao;
import pe.com.siraywasi.model.TipoTejido;

@Repository
public class TipoTejidoDaoImpl extends SimpleJdbcDaoSupport implements TipoTejidoDao {

	@Autowired
	public TipoTejidoDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<TipoTejido> listadoTipoTejido() {
		List<TipoTejido> listadoTipoTejido = new ArrayList<TipoTejido>();
		TipoTejido tipoTejido = null;
		
		tipoTejido = new TipoTejido(1,"Doble Punto");
		listadoTipoTejido.add(tipoTejido);
		tipoTejido = new TipoTejido(2,"Crouche");
		listadoTipoTejido.add(tipoTejido);		
		
		return listadoTipoTejido;
	}

}
