package pe.com.siraywasi.dao.impl;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.TallaDao;

@Repository
public class TallaDaoImpl implements TallaDao {

	@Override
	public String[] listadoTallas() {
		String[] tallas = new String[]{"XS","S","M","L","XL","2XL"};
		return tallas;
	}
}
