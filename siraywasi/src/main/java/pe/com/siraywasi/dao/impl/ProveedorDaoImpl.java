package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		String sql = "select idProveedor, nombreProveedor from proveedor";		
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<Proveedor> listadoProveedor = new ArrayList<Proveedor>();
		
		Proveedor proveedor = null;
		for(Map<String, Object> row: rows){
			proveedor = new Proveedor();
			proveedor.setIdProveedor((Integer)row.get("idProveedor"));
			proveedor.setNombreProveedor((String)row.get("nombreProveedor"));
			listadoProveedor.add(proveedor);
		}
				
		return listadoProveedor;
	}

}
