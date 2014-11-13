package pe.com.siraywasi.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.Color;
import pe.com.siraywasi.model.Genero;
import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTela;
import pe.com.siraywasi.model.dto.EspecificacionPrendaDTO;
import pe.com.siraywasi.service.EspecificacionPrendaService;
import pe.com.siraywasi.service.PrendaService;
import pe.com.siraywasi.service.UtilService;
import pe.com.siraywasi.web.form.EspecificacionPrendaForm;

@Controller
@RequestMapping("/especificacionprenda")
public class EspecificacionPrendaController {

	private Logger log = Logger.getLogger(EspecificacionPrendaController.class);
	
	@Autowired
	private EspecificacionPrendaService especificacionPrendaService;
	
	@Autowired
	private PrendaService prendaService;
	
	@Autowired
	private UtilService utilService;
	
	@RequestMapping(value="/listado", method=RequestMethod.GET)
	public String Listado(Model model){
		log.info("GET: listado de Especificion Prenda");
		
		List<EspecificacionPrendaDTO> listaEspecificacionPrenda = especificacionPrendaService.listadoEspecificacionPrenda();
		model.addAttribute("listaEspecificacionPrenda", listaEspecificacionPrenda);
		log.debug("Cantidad de registros recuperados: " + listaEspecificacionPrenda.size());
		
		return "especificacionprenda/listado";
	}
	
	@RequestMapping(value="/registrarespecificacion", method= RequestMethod.GET)
	public String EspecificacionPrendaView(Model model){
		log.info("GET: registro de nuevas especificaciones");
		EspecificacionPrendaForm especificacionPrendaForm = new EspecificacionPrendaForm();
		
		model.addAttribute("especificacionPrendaForm", especificacionPrendaForm);
		model.addAttribute("resumen", especificacionPrendaService.listadoEspecificacionPrendaResumen());
		
		return "especificacionprenda/registrarespecificacion";
	}
	
	@ModelAttribute("listaTipoTelas")
	public List<TipoTela> listaTipoTela(){
		List<TipoTela> listaTipoTelas = prendaService.listadoTipoTela();
		return listaTipoTelas;
	}
	
	@ModelAttribute("listaPrendas")
	public List<Prenda> listaPrenda(){
		List<Prenda> listaPrendas = prendaService.listadoPrenda();
		return listaPrendas;
	}
	
	@ModelAttribute("listaTipoPrendas")
	public List<TipoPrenda> listaTipoPrenda(){
		List<TipoPrenda> listaTipoPrendas = prendaService.listadoTipoPrenda();
		return listaTipoPrendas;
	}
	
	@ModelAttribute("listaTallas")
	public String[] listaTallas(){
		String[] listaTallas = especificacionPrendaService.listadoTallas();
		return listaTallas;
	}
	
	@ModelAttribute("listaColor")
	public List<Color> listaColor(){
		List<Color> listaColor = especificacionPrendaService.listadoColor();
		return listaColor;
	}
	
	@ModelAttribute("listaGenero")
	public List<Genero> listaGenero(){
		List<Genero> listaGenero = utilService.listaGenero(); 
		return listaGenero;
	}
	
}
