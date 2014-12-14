package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.EspecificacionPrendaDao;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.EspecificacionPrendaResumenDTO;

@Repository
public class EspecificacionPrendaDaoImpl extends SimpleJdbcDaoSupport implements EspecificacionPrendaDao{

	@Autowired
	public EspecificacionPrendaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda() {
		String sql = "select ep.idEspecificacionPrenda, " +
				"cp.nombreCatalogoPrenda, " +
				"ep.fechaProbable, " + 
				"ep.fechaEntrega, " +
				"cl.nombreCliente, " +
				"ep.indicadorMolde, " +
				"ep.indicadorPlanProduccion, " +
				"ep.indicadorPresupuesto " +
				"from especificacionprenda ep, " +
				"catalogoprenda cp, " +
				"cliente cl " +
				"where ep.idcatalogoprenda = cp.idcatalogoprenda " +
				"and ep.idcliente = cl.idcliente ";
		
		List<EspecificacionPrendaDTO> listadoEspecificacionPrenda = new ArrayList<EspecificacionPrendaDTO>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		EspecificacionPrendaDTO item = null;
		
		for(Map<String, Object> row: rows){
			item = new EspecificacionPrendaDTO();
			item.setIdEspecificacionPrenda((Integer)row.get("idEspecificacionPrenda"));
			item.setNombrePrenda((String)row.get("nombreCatalogoPrenda"));
			item.setFechaEntrega((Date)row.get("fechaEntrega"));
			item.setFechaProbable((Date)row.get("fechaProbable"));
			item.setNombreCliente((String)row.get("nombreCliente"));
			item.setIndicadorMolde((String)row.get("indicadorMolde"));
			item.setIndicadorPresupuesto((String)row.get("indicadorPlanProduccion"));
			item.setIndicadorPlanProduccion((String)row.get("indicadorPresupuesto"));

			listadoEspecificacionPrenda.add(item);
		}
		
		return listadoEspecificacionPrenda;
	}

	@Override
	public List<EspecificacionPrendaResumenDTO> listadoEspecificacionPrendaResumen() {
		List<EspecificacionPrendaResumenDTO> resumen = new ArrayList<EspecificacionPrendaResumenDTO>();
		EspecificacionPrendaResumenDTO item = null;
		
		item = new EspecificacionPrendaResumenDTO();
		item.setTalla("S");
		item.setTipo("Hombre");
		item.setColor("Blanco");
		item.setCantidad(700);
		resumen.add(item);
		
		item = new EspecificacionPrendaResumenDTO();
		item.setTalla("S");
		item.setTipo("Hombre");
		item.setColor("Blanco");
		item.setCantidad(300);
		resumen.add(item);

		item = new EspecificacionPrendaResumenDTO();
		item.setTalla("M");
		item.setTipo("Hombre");
		item.setColor("Blanco");
		item.setCantidad(600);
		resumen.add(item);		

		item = new EspecificacionPrendaResumenDTO();
		item.setTalla("M");
		item.setTipo("Mujer");
		item.setColor("Verde");
		item.setCantidad(200);
		resumen.add(item);		

		item = new EspecificacionPrendaResumenDTO();
		item.setTalla("M");
		item.setTipo("Hombre");
		item.setColor("Rosado");
		item.setCantidad(200);
		resumen.add(item);		
		
		return resumen;
	}

}
