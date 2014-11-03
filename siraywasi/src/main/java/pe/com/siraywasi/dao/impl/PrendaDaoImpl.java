package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.PrendaDao;
import pe.com.siraywasi.model.Prenda;

@Repository
public class PrendaDaoImpl implements PrendaDao {

	@Override
	public List<Prenda> listadoPrenda() {
		List<Prenda> listadoPrenda = new ArrayList<Prenda>();
		Prenda prenda = null;
		prenda = new Prenda(1,"Casaca");
		listadoPrenda.add(prenda);
		prenda = new Prenda(2,"Camisa");
		listadoPrenda.add(prenda);
		prenda = new Prenda(3,"Short");
		listadoPrenda.add(prenda);
		
		return listadoPrenda;
	}

}
