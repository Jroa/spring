package pe.com.siraywasi.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTejido;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.PrendaMantenimientoDTO;
import pe.com.siraywasi.service.PrendaService;
import pe.com.siraywasi.web.form.PrendaForm;

@Controller
@RequestMapping("/prenda")
public class PrendaController {

	@Autowired
	private PrendaService prendaService;
	
	private Logger log = Logger.getLogger(PrendaController.class);
	
	@RequestMapping(value="/listadocatalogo", method = RequestMethod.GET)
	public String listadoCatalogo(Model model){
		log.info("GET: listado de MateriaPrima");
		
		List<PrendaMantenimientoDTO> listadoPrendas = prendaService.listadoMantenimientoPrenda();
		model.addAttribute("listadoPrendas",listadoPrendas);
		
		return "prenda/listadocatalogo";
	}
	
	@RequestMapping(value="/registrarprenda", method = RequestMethod.GET)
	public String registrarPrenda(Model model){
		log.info("GET: Registrar Prenda");
		
		PrendaForm prendaForm = new PrendaForm();
		model.addAttribute("prendaForm", prendaForm);
		
		return "prenda/registrarprenda";
	}

	@ModelAttribute("listaTipoPrendas")
	public List<TipoPrenda> listaTipoPrenda(){
		List<TipoPrenda> listaTipoPrendas = prendaService.listadoTipoPrenda();
		return listaTipoPrendas;
	}
	
	@ModelAttribute("listaTipoTelas")
	public List<TipoTela> listaTipoTela(){
		List<TipoTela> listaTipoTelas = prendaService.listadoTipoTela();
		return listaTipoTelas;
	}
	
	@ModelAttribute("listaTipoTejidos")
	public List<TipoTejido> listaTipoTejido(){
		List<TipoTejido> listaTipoTejidos = prendaService.listadoTipoTejido();
		return listaTipoTejidos;
	}	
}
