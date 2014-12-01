package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoCompraDao;
import pe.com.siraywasi.model.TipoCompra;

@Repository
public class TipoCompraDaoImpl extends SimpleJdbcDaoSupport implements TipoCompraDao{

	@Autowired
	public TipoCompraDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<TipoCompra> listadoTipoCompra() {
		List<TipoCompra> listadoTipoCompra = new ArrayList<TipoCompra>();
		TipoCompra tipoCompra = null;
		tipoCompra = new TipoCompra(1,"Directa");
		listadoTipoCompra.add(tipoCompra);
		tipoCompra = new TipoCompra(2,"InDirecta");
		listadoTipoCompra.add(tipoCompra);
		
		return listadoTipoCompra;
	}

}
