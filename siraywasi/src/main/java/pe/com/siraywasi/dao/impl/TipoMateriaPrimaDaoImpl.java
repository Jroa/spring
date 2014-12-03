package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoMateriaPrimaDao;
import pe.com.siraywasi.model.TipoMateriaPrima;

@Repository
public class TipoMateriaPrimaDaoImpl extends SimpleJdbcDaoSupport  implements TipoMateriaPrimaDao{

	@Autowired
	public TipoMateriaPrimaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<TipoMateriaPrima> listadoTipoMateriaPrima() {
		String sql = "select idTipoMateriaPrima, nombreTipoMateriaPrima from TipoMateriaPrima";
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<TipoMateriaPrima> listadoTipoMateriaPrima = new ArrayList<TipoMateriaPrima>();
		
		TipoMateriaPrima tipoMateriaPrima = null;
		for(Map<String, Object> row: rows){
			tipoMateriaPrima = new TipoMateriaPrima();
			tipoMateriaPrima.setIdTipoMateriaPrima((Integer)row.get("idTipoMateriaPrima"));
			tipoMateriaPrima.setNombreTipoMateriaPrima((String)row.get("nombreTipoMateriaPrima"));
			listadoTipoMateriaPrima.add(tipoMateriaPrima);
		}
		
		return listadoTipoMateriaPrima;
	}

}
