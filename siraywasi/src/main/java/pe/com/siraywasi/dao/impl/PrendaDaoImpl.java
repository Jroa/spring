package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PrendaDao;
import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.dto.PrendaMantenimientoDTO;

@Repository
public class PrendaDaoImpl implements PrendaDao {

	@Override
	public List<Prenda> listadoPrenda() {
		List<Prenda> listadoPrenda = new ArrayList<Prenda>();
		Prenda prenda = null;
		prenda = new Prenda(1,"Casaca",0,0,0,"");
		listadoPrenda.add(prenda);
		prenda = new Prenda(2,"Camisa",0,0,0,"");
		listadoPrenda.add(prenda);
		prenda = new Prenda(3,"Short",0,0,0,"");
		listadoPrenda.add(prenda);
		
		return listadoPrenda;
	}

	@Override
	public List<PrendaMantenimientoDTO> listadoMantenimientoPrenda() {
		List<PrendaMantenimientoDTO> listadoMantenimientoPrenda = new ArrayList<PrendaMantenimientoDTO>();
		
		PrendaMantenimientoDTO prendaMantenimientoDTO = null;
		prendaMantenimientoDTO = new PrendaMantenimientoDTO(1,"Polo Cuello V", "Algodon");
		listadoMantenimientoPrenda.add(prendaMantenimientoDTO);
		prendaMantenimientoDTO = new PrendaMantenimientoDTO(2,"Polo Cuello Redondo", "Algodon");
		listadoMantenimientoPrenda.add(prendaMantenimientoDTO);
		prendaMantenimientoDTO = new PrendaMantenimientoDTO(3,"Casaca Cuello Alto", "Polar");
		listadoMantenimientoPrenda.add(prendaMantenimientoDTO);
		prendaMantenimientoDTO = new PrendaMantenimientoDTO(4,"Blusa Pliegues V", "Seda");
		listadoMantenimientoPrenda.add(prendaMantenimientoDTO);
		
		return listadoMantenimientoPrenda;
	}

}
