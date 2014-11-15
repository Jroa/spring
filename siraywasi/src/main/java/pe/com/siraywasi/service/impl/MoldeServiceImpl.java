package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.MoldeDao;
import pe.com.siraywasi.dao.MoldeMedidaTallaDao;
import pe.com.siraywasi.dao.MoldeOperacionDao;
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

}
