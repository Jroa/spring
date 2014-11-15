package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PresupuestoDao;
import pe.com.siraywasi.model.dto.PresupuestoTotalDTO;

@Repository
public class PresupuestoDaoImpl implements PresupuestoDao {

	@Override
	public List<PresupuestoTotalDTO> listadoResumenTotal(int idPresupuesto) {
		List<PresupuestoTotalDTO> listadoResumenTotal = new ArrayList<PresupuestoTotalDTO>();
		PresupuestoTotalDTO item = null;
		
		item = new PresupuestoTotalDTO();
		item.setConcepto("COSTO TOTAL CON IGV");
		item.setPorcentaje("");
		item.setTotal(5637.73);
		listadoResumenTotal.add(item);

		item = new PresupuestoTotalDTO();
		item.setConcepto("COSTO TOTAL SIN IGV");
		item.setPorcentaje("");
		item.setTotal(4777.74);
		listadoResumenTotal.add(item);

		item = new PresupuestoTotalDTO();
		item.setConcepto("COSTO PRODUCCION Y ADMINISTRATIVO");
		item.setPorcentaje("10");
		item.setTotal(453.88);
		listadoResumenTotal.add(item);
		
		item = new PresupuestoTotalDTO();
		item.setConcepto("UTILIDAD");
		item.setPorcentaje("10");
		item.setTotal(477.7);
		listadoResumenTotal.add(item);

		item = new PresupuestoTotalDTO();
		item.setConcepto("Precio de Venta Unitaria Costo MP + Costo Produc + Utilidad");
		item.setPorcentaje("");
		item.setTotal(5709.39);
		listadoResumenTotal.add(item);

		item = new PresupuestoTotalDTO();
		item.setConcepto("Precio de Venta Final = PVU + 18% IGV");
		item.setPorcentaje("");
		item.setTotal(6737.09);
		listadoResumenTotal.add(item);		
		
		return listadoResumenTotal;
	}

}
