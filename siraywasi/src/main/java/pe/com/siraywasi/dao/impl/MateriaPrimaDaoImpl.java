package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

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
		
		List<MateriaPrimaDTO> listadoMateriaPrima = new ArrayList<MateriaPrimaDTO>();
		MateriaPrimaDTO item = null;
		
		item = new MateriaPrimaDTO();
		item.setIdMateriaPrima(1);
		item.setNombreMateriaPrima("Hilo Rojo 3 puntos");
		item.setCantidad(200);
		item.setNombreUnidadMedida("Unidad");
		item.setUltimoCosto(1.93);
		item.setNombreProveedor("Prima");
		listadoMateriaPrima.add(item);
		
		item = new MateriaPrimaDTO();
		item.setIdMateriaPrima(2);
		item.setNombreMateriaPrima("Cierre pantalon 25cm");
		item.setCantidad(500);
		item.setNombreUnidadMedida("Unidad");
		item.setUltimoCosto(1.93);
		item.setNombreProveedor("Prima");
		listadoMateriaPrima.add(item);		

		item = new MateriaPrimaDTO();
		item.setIdMateriaPrima(3);
		item.setNombreMateriaPrima("Boton ancho");
		item.setCantidad(1000);
		item.setNombreUnidadMedida("Unidad");
		item.setUltimoCosto(1.93);
		item.setNombreProveedor("Prima");
		listadoMateriaPrima.add(item);		
		
		item = new MateriaPrimaDTO();
		item.setIdMateriaPrima(4);
		item.setNombreMateriaPrima("Hojalillo");
		item.setCantidad(700);
		item.setNombreUnidadMedida("Unidad");
		item.setUltimoCosto(1.93);
		item.setNombreProveedor("Prima");
		listadoMateriaPrima.add(item);		
		
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

}
