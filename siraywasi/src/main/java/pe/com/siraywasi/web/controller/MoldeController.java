package pe.com.siraywasi.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;
import pe.com.siraywasi.service.MoldeService;
import pe.com.siraywasi.web.form.MoldeOperacionForm;

@Controller
@RequestMapping("/molde")
public class MoldeController {

	@Autowired
	private MoldeService moldeService;
	
	private Logger log = Logger.getLogger(EspecificacionPrendaController.class);
	
	@RequestMapping(value="/registraroperacionmolde", method = RequestMethod.GET)
	private String registrarOperacionMolde(Model model){
		log.info("GET: listado de MateriaPrima");
		
		MoldeOperacionForm moldeOperacionForm = new MoldeOperacionForm();
		model.addAttribute("moldeOperacionForm", moldeOperacionForm);
		List<MoldeOperacionDTO> listaOperaciones = moldeService.listadoMoldeOperacion(1);
		model.addAttribute("listaOperaciones", listaOperaciones);
		
		log.debug("cantidad de items: " + listaOperaciones.size());
		
		return "molde/registraroperacionmolde";
	}
	
	@RequestMapping(value="/listadomoldeespecificacionprenda", method = RequestMethod.GET)
	private String listadoMoldeEspecificacionPrenda(Model model){
		log.info("GET: listadomoldeespecificacionprenda");
		
		List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda = moldeService.listadoMoldeEspecificacionPrenda();
		model.addAttribute("listadoMoldeEspecificacionPrenda",listadoMoldeEspecificacionPrenda);
		
		return "molde/listadomoldeespecificacionprenda";
	}
}
