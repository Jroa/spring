package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoTejidoDao;
import pe.com.siraywasi.model.TipoTejido;

@Repository
public class TipoTejidoDaoImpl implements TipoTejidoDao {

	@Override
	public List<TipoTejido> listadoTipoTejido() {
		List<TipoTejido> listadoTipoTejido = new ArrayList<TipoTejido>();
		TipoTejido tipoTejido = null;
		
		tipoTejido = new TipoTejido(1,"Doble Punto");
		listadoTipoTejido.add(tipoTejido);
		tipoTejido = new TipoTejido(2,"Crouche");
		listadoTipoTejido.add(tipoTejido);		
		
		return listadoTipoTejido;
	}

}
