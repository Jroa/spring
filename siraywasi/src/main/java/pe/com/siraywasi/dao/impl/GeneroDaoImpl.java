package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.GeneroDao;
import pe.com.siraywasi.model.Genero;

@Repository
public class GeneroDaoImpl implements GeneroDao {

	@Override
	public List<Genero> listaGenero() {
		List<Genero> listaGenero = new ArrayList<Genero>();
		Genero genero = null;
		genero = new Genero(1,"Hombre");
		listaGenero.add(genero);
		genero = new Genero(2,"Mujer");
		listaGenero.add(genero);
		
		return listaGenero;
		
	}
}
