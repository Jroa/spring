package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MoldeDao;
import pe.com.siraywasi.model.Molde;
import pe.com.siraywasi.model.MoldeAvio;
import pe.com.siraywasi.model.MoldeConfeccion;
import pe.com.siraywasi.model.MoldeMedida;
import pe.com.siraywasi.model.MoldeMedidaTalla;
import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.web.controller.EspecificacionPrendaController;

@Repository
public class MoldeDaoImpl extends SimpleJdbcDaoSupport implements MoldeDao {

	private Logger log = Logger.getLogger(EspecificacionPrendaController.class);
	
	@Autowired
	public MoldeDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda() {
		String sql = "select ep.idEspecificacionPrenda, " +
						"cp.nombreCatalogoPrenda, " +
						"cl.nombreCliente, " +
						"ep.indicadorMolde, " +
						"ep.indicadorPlanProduccion, " +
						"ep.indicadorPresupuesto, " +
						"ifNull(mo.idMolde,0) idMolde, " +
						"case ifNull(mo.idMolde,0) " +
						"  when 0 then 'CREAR' " +
						"  else 'MODIFICAR' " +
						"end  indicadorMantenimiento, " +
						"'AM' indicadorMateriaPrima " +
						"from especificacionprenda ep " +
						"inner join catalogoprenda cp on (ep.idcatalogoprenda = cp.idcatalogoprenda) " +
						"inner join cliente cl on (ep.idcliente = cl.idcliente) " +
						"left join molde mo on (ep.idEspecificacionPrenda = mo.idEspecificacionPrenda) ";

		
		List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda = new ArrayList<MoldeEspecificacionPrendaDTO>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		MoldeEspecificacionPrendaDTO item = null;

		for(Map<String, Object> row: rows){
			item = new MoldeEspecificacionPrendaDTO();
			item.setIdEspecificacionPrenda((Integer)row.get("idEspecificacionPrenda"));
			item.setNombreCatalogoPrenda((String)row.get("nombreCatalogoPrenda"));
			item.setNombreCliente((String)row.get("nombreCliente"));
			item.setIndicadorMolde((String)row.get("indicadorMolde"));
			item.setIndicadorProduccion((String)row.get("indicadorPlanProduccion"));
			item.setIndicadorPresupuesto((String)row.get("indicadorPresupuesto"));
			item.setIdMolde(Integer.parseInt(row.get("idMolde").toString()));
			item.setIndicadorMantenimiento((String)row.get("indicadorMantenimiento"));
			item.setIndicadorMateriaPrima((String)row.get("indicadorMateriaPrima"));
			listadoMoldeEspecificacionPrenda.add(item);
		}
		
		log.debug("Ejecutado correctamente");
		
		return listadoMoldeEspecificacionPrenda;
	}

	@Override
	public int registrarMolde(Molde molde) {
		try{
			String sql = "insert into Molde(nombreMolde, prenda, detalle, estado) values(?,?,?,'PE')";
			this.getJdbcTemplate().update(sql, 
								molde.getNombreMolde(), 
								molde.getPrenda(),
								molde.getDetalle());
			int idMolde = 0;
			//sql = "SELECT LAST_INSERT_ID()";
			sql = "select max(IdMolde) from Molde";
			idMolde = this.getJdbcTemplate().queryForInt(sql);
			
			return idMolde;
		}catch(Exception ex){
			return -1;
		}

	}

	@Override
	public int registrarMoldeAvio(int idMolde, MoldeAvio moldeAvio) {
		
		try{
			String sql = "insert into MoldeAvio(idMolde, idAvio) value(?,?)";
			this.getJdbcTemplate().update(sql,
										idMolde,
										moldeAvio.getIdAvio());
			
			int idMoldeAvio = 0;
			//sql = "SELECT LAST_INSERT_ID()";
			sql = "select max(IdMoldeAvio) from MoldeAvio";
			idMoldeAvio = this.getJdbcTemplate().queryForInt(sql);
			
			return idMoldeAvio;			
		}catch(Exception ex){
			return -1;
		}
	}

	@Override
	public int registrarMoldeMedida(int idMolde, MoldeMedida moldeMedida) {
		try{
			String sql = "insert into MoldeMedida(idMolde, nombreMoldeMedida) value(?,?)";
			this.getJdbcTemplate().update(sql,idMolde, moldeMedida.getNombreMoldeMedida());
			
			int idMoldeMedida = 0;
			//sql = "SELECT LAST_INSERT_ID()";
			sql = "select max(IdMoldeMedida) from MoldeMedida";
			idMoldeMedida = this.getSimpleJdbcTemplate().queryForInt(sql);
			
			return idMoldeMedida;			
		}catch(Exception ex){
			return -1;
		}
	}

	@Override
	public int registrarMoldeMedidaTalla(int idMoldeMedida,
			MoldeMedidaTalla moldeMedidaTalla) {

		try{
			String sql = "insert into MoldeMedidaTalla(idMoldeMedida, tipoTalla, corte, prendaFinal) values(?,?,?,?)";
			this.getJdbcTemplate().update(sql, 
											idMoldeMedida,
											moldeMedidaTalla.getTipoTalla(),
											moldeMedidaTalla.getCorte(),
											moldeMedidaTalla.getPrendaFinal());
			int idMoldeMedidaTalla =0;
			//sql = "SELECT LAST_INSERT_ID()";
			sql = "select max(IdMoldeMedidaTalla) from MoldeMedidaTalla";
			idMoldeMedidaTalla = this.getSimpleJdbcTemplate().queryForInt(sql);
			
			return idMoldeMedidaTalla;			
		}catch(Exception ex){
			return -1;
		}
	}

	@Override
	public int registrarMoldeConfeccion(int idMolde,
			MoldeConfeccion moldeConfeccion) {
		
		try{
			String sql = "insert into MoldeConfeccion (idMolde, nombreConfeccion, detalleConfeccion) values(?, ?, ?)";
			this.getJdbcTemplate().update(sql, 
											idMolde,
											moldeConfeccion.getNombreConfeccion(),
											moldeConfeccion.getDetalleConfeccion());
			
			int idMoldeConfeccion =0;
			//sql = "SELECT LAST_INSERT_ID()";
			sql = "select max(IdMoldeConfeccion) from MoldeConfeccion";
			idMoldeConfeccion = this.getSimpleJdbcTemplate().queryForInt(sql);
			
			return idMoldeConfeccion;			
		}catch(Exception ex){
			return -1;
		}

	}

}
