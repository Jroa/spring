package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.AvioDao;
import pe.com.siraywasi.dao.MoldeDao;
import pe.com.siraywasi.dao.MoldeMedidaTallaDao;
import pe.com.siraywasi.dao.MoldeOperacionDao;
import pe.com.siraywasi.model.Avio;
import pe.com.siraywasi.model.Molde;
import pe.com.siraywasi.model.MoldeAvio;
import pe.com.siraywasi.model.MoldeConfeccion;
import pe.com.siraywasi.model.MoldeMedida;
import pe.com.siraywasi.model.MoldeMedidaTalla;
import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.MoldeMedidaTallaDTO;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;
import pe.com.siraywasi.service.MoldeService;

@Service
public class MoldeServiceImpl implements MoldeService {

	@Autowired
	private MoldeOperacionDao moldeOperacionDao;
	
	@Autowired
	private MoldeDao moldeDao;
	
	@Autowired
	private MoldeMedidaTallaDao moldeMedidaTallaDao;
	
	@Autowired
	private AvioDao avioDao;
	
	@Override
	public List<MoldeOperacionDTO> listadoMoldeOperacion(int idMolde) {
		List<MoldeOperacionDTO> listadoMoldeOperacion = moldeOperacionDao.listadoMoldeOperacion(idMolde);
		return listadoMoldeOperacion;
	}

	@Override
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda() {
		List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda = moldeDao.listadoMoldeEspecificacionPrenda();
		return listadoMoldeEspecificacionPrenda;
	}

	@Override
	public List<MoldeMedidaTallaDTO> listadoMoldeMedidaTalla(int idMolde,
			String tipoTalla) {
		
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTalla = moldeMedidaTallaDao.listadoMoldeMedidaTalla(idMolde, tipoTalla);
		return listadoMoldeMedidaTalla;
	}

	@Override
	public List<Avio> listadoAvio() {
		List<Avio> listadoAvio = avioDao.listadoAvio(); 
		return listadoAvio;
	}

	@Override
	public int registrarMolde(Molde molde) {
		int idMolde = moldeDao.registrarMolde(molde);
		return idMolde;
	}

	@Override
	public int registrarMoldeAvio(int idMolde, MoldeAvio moldeAvio) {
		int idMoldeAvio = moldeDao.registrarMoldeAvio(idMolde, moldeAvio);
		return idMoldeAvio;
	}

	@Override
	public int registrarMoldeMedida(int idMolde, MoldeMedida moldeMedida) {
		int idMoldeMedida = moldeDao.registrarMoldeMedida(idMolde, moldeMedida);
		return idMoldeMedida;
	}

	@Override
	public int registrarMoldeMedidaTalla(int idMoldeMedida,
			MoldeMedidaTalla moldeMedidaTalla) {

		int idMoldeMedidaTalla = moldeDao.registrarMoldeMedidaTalla(idMoldeMedida, moldeMedidaTalla);
		return idMoldeMedidaTalla;
	}

	@Override
	public int registrarMoldeConfeccion(int idMolde,
			MoldeConfeccion moldeConfeccion) {

		int idMoldeConfeccion = moldeDao.registrarMoldeConfeccion(idMolde, moldeConfeccion);
		return idMoldeConfeccion;
	}

}
