package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MateriaPrimaDao;
import pe.com.siraywasi.model.MateriaPrima;
import pe.com.siraywasi.model.dto.MateriaPrimaDTO;

@Repository
public class MateriaPrimaDaoImpl extends SimpleJdbcDaoSupport implements MateriaPrimaDao {

	@Autowired
	public MateriaPrimaDaoImpl(DataSource dataSource){
		this.setDataSource(dataSource);
	}	
	
	@Override
	public List<MateriaPrimaDTO> listadoMateriaPrima() {
		String sql = "" +
				"select MP.idMateriaPrima, MP.nombreMateriaPrima, MP.cantidad, UM.nombreUnidadMedida, MP.costo, PV.nombreProveedor " + 
				"from MateriaPrima MP, " +
				"UnidadMedida UM, " + 
				"Proveedor PV " +
				"where MP.idUnidadMedida = UM.idUnidadMedida " +
				"and MP.idProveedor = PV.idProveedor";
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<MateriaPrimaDTO> listadoMateriaPrima = new ArrayList<MateriaPrimaDTO>();
		MateriaPrimaDTO item = null;
		
		for(Map<String, Object> row: rows){
			item = new MateriaPrimaDTO();
			item.setIdMateriaPrima((Integer)row.get("idMateriaPrima"));
			item.setNombreMateriaPrima((String)row.get("nombreMateriaPrima"));
			item.setCantidad((Integer)row.get("cantidad"));
			item.setNombreUnidadMedida((String)row.get("nombreUnidadMedida"));
			item.setUltimoCosto(Double.parseDouble(row.get("costo").toString()));
			item.setNombreProveedor((String)row.get("nombreProveedor"));			
			listadoMateriaPrima.add(item);
		}
		
		return listadoMateriaPrima;
	}

	@Override
	public boolean registrarMateriaPrima(MateriaPrima materiaPrima) {

		try{
			String sql ="" +
                    "insert into MateriaPrima (nombreMateriaPrima, idMarca, cantidad, idProveedor, idTipoMateriaPrima," +
                    "idTipoCompra, idUnidadMedida, costo, detalle) " +
                    "values (?,?,?,?,?,?,?,?,?)";
			
			this.getSimpleJdbcTemplate().update(sql, 
					materiaPrima.getNombreMateriaPrima(),
					materiaPrima.getIdMarca(),
					materiaPrima.getCantidad(),
					materiaPrima.getIdProveedor(),
					materiaPrima.getIdTipoMateriaPrima(),
					materiaPrima.getIdTipoCompra(),
					materiaPrima.getIdUnidadMedida(),
					materiaPrima.getCosto(),
					materiaPrima.getDetalle());
			
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public boolean eliminarMateriaPrima(int idMateriaPrima) {
		try{
			String sql = "Delete from MateriaPrima where idMateriaPrima = ?"; 
			this.getSimpleJdbcTemplate().update(sql, idMateriaPrima);
			return true;
		}catch(Exception ex){
			return false;
		}
	}

}
