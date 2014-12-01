package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

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
		List<UnidadMedida> listadoUnidadMedida = new ArrayList<UnidadMedida>();
		UnidadMedida unidadMedida = null;
		unidadMedida = new UnidadMedida(1,"Unidad");
		listadoUnidadMedida.add(unidadMedida);
		unidadMedida = new UnidadMedida(2,"Metro");
		listadoUnidadMedida.add(unidadMedida);

		return listadoUnidadMedida;
	}

}
