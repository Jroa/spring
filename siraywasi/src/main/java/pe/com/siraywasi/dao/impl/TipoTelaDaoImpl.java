package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TipoTelaDao;
import pe.com.siraywasi.model.TipoTela;

@Repository
public class TipoTelaDaoImpl implements TipoTelaDao{

	@Override
	public List<TipoTela> listadoTipoTela() {
		List<TipoTela> listaTipoTela = new ArrayList<TipoTela>();
		TipoTela tipoTela = null;
		tipoTela = new TipoTela(1,"Polar");
		listaTipoTela.add(tipoTela);
		tipoTela = new TipoTela(2,"Algodon");
		listaTipoTela.add(tipoTela);
		tipoTela = new TipoTela(3,"Drill");
		listaTipoTela.add(tipoTela);
		
		return listaTipoTela;
	}

}
