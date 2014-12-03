package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		String sql = "select idTipoCompra, nombreTipoCompra from Tipocompra";
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<TipoCompra> listadoTipoCompra = new ArrayList<TipoCompra>();
		
		TipoCompra tipoCompra = null;
		for(Map<String, Object> row: rows){
			tipoCompra = new TipoCompra();
			tipoCompra.setIdTipoCompra((Integer)row.get("idTipoCompra"));
			tipoCompra.setNombreTipoCompra((String)row.get("nombreTipoCompra"));
			listadoTipoCompra.add(tipoCompra);
		}
		
		return listadoTipoCompra;
	}

}
