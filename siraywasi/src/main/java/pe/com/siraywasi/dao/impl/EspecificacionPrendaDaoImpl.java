package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.EspecificacionPrendaDao;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.util.DateUtil;

@Repository
public class EspecificacionPrendaDaoImpl implements EspecificacionPrendaDao{

	@Override
	public List<EspecificacionPrendaDTO> listadoEspecificacionPrenda() {
		List<EspecificacionPrendaDTO> listadoEspecificacionPrenda = new ArrayList<EspecificacionPrendaDTO>();
		
		EspecificacionPrendaDTO item = null;
		
		item = new EspecificacionPrendaDTO();
		item.setIdEspecificacionPrenda(1);
		item.setNombrePrenda("Casaca Polar TS");
		item.setFechaEntrega(DateUtil.getDateFromString("15/10/2014"));
		item.setFechaProbable(DateUtil.getDateFromString("22/10/2014"));
		item.setNombreCliente("Plaza Vea");
		item.setIndicadorMolde("C");
		item.setIndicadorPresupuesto("P");
		item.setIndicadorPlanProduccion("C");

		listadoEspecificacionPrenda.add(item);
		
		item = new EspecificacionPrendaDTO();
		item.setIdEspecificacionPrenda(2);
		item.setNombrePrenda("Pantalon Kids");
		item.setFechaEntrega(DateUtil.getDateFromString("17/10/2014"));
		item.setFechaProbable(DateUtil.getDateFromString("22/10/2014"));
		item.setNombreCliente("Plaza Vea");
		item.setIndicadorMolde("C");
		item.setIndicadorPresupuesto("P");
		item.setIndicadorPlanProduccion("C");
		
		listadoEspecificacionPrenda.add(item);
		
		
		return listadoEspecificacionPrenda;
	}

}