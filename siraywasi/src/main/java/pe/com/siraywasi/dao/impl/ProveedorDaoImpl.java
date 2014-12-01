package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.ProveedorDao;
import pe.com.siraywasi.model.Proveedor;

@Repository
public class ProveedorDaoImpl extends SimpleJdbcDaoSupport implements ProveedorDao {

	@Autowired
	public ProveedorDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<Proveedor> listadoProveedor() {
		List<Proveedor> listadoProveedor = new ArrayList<Proveedor>();
		Proveedor proveedor = null;
		proveedor = new Proveedor(1,"Proveedor 1");
		listadoProveedor.add(proveedor);
		proveedor = new Proveedor(2,"Proveedor 2");
		listadoProveedor.add(proveedor);
		
		return listadoProveedor;
	}

}
