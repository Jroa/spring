package pe.com.siraywasi.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.Color;
import pe.com.siraywasi.model.dto.PlanProduccionTallaResumenDTO;
import pe.com.siraywasi.model.dto.PlanProduccionTallerResumenDTO;
import pe.com.siraywasi.service.EspecificacionPrendaService;
import pe.com.siraywasi.service.PlanProduccionService;
import pe.com.siraywasi.web.form.PlanProduccionForm;
import pe.com.siraywasi.web.form.PlanProduccionTallerForm;

@Controller
@RequestMapping("/planproduccion")
public class PlanProduccionController {
	
	@Autowired
	private PlanProduccionService planProduccionService;
	
	@Autowired
	private EspecificacionPrendaService especificacionPrendaService;
	
	private Logger log = Logger.getLogger(PlanProduccionController.class);
	
	@RequestMapping(value="/registrarplanproduccion", method = RequestMethod.GET)
	public String registrarPlanProduccion(Model model){
		log.info("GET: crear plan de produccion");
		
		PlanProduccionForm planProduccionForm = new PlanProduccionForm();
		model.addAttribute("planProduccionForm", planProduccionForm);
		List<PlanProduccionTallaResumenDTO> resumenTallas = planProduccionService.listadoPlanProduccionTallasResumen();
		model.addAttribute("resumenTallas", resumenTallas);
		
		List<PlanProduccionTallerForm> talleresDisponibles = listadoTalleresDisponibles();
		model.addAttribute("talleresDisponibles", talleresDisponibles);

		List<PlanProduccionTallerForm> talleresAsignados = listadoTalleresAsignados();
		model.addAttribute("talleresAsignados", talleresAsignados);		
		
		List<PlanProduccionTallerResumenDTO> resumenTalleresAsignados = planProduccionService.listadoTalleresResumen();
		model.addAttribute("resumenTalleresAsignados", resumenTalleresAsignados);
		
		log.debug("cantidad resumen taller" + resumenTalleresAsignados.size());
		
		return "planproduccion/registrarplanproduccion";
	}
	
	private List<PlanProduccionTallerForm> listadoTalleresDisponibles(){
		List<PlanProduccionTallerForm> listadoTalleresDisponibles = new ArrayList<PlanProduccionTallerForm>();
		PlanProduccionTallerForm item = null;
		
		item = new PlanProduccionTallerForm();
		item.setTipoTaller("Bordado");
		item.setNombre("Taller Fernanda SAC");
		item.setDisponibilidad("Disponible");
		item.setProximaDisponibilidad("");
		item.setAvance("");
		
		listadoTalleresDisponibles.add(item);

		item = new PlanProduccionTallerForm();
		item.setTipoTaller("Estampado");
		item.setNombre("Ropa & Moda");
		item.setDisponibilidad("Disponible");
		item.setProximaDisponibilidad("");
		item.setAvance("");
		
		listadoTalleresDisponibles.add(item);		

		item = new PlanProduccionTallerForm();
		item.setTipoTaller("Costura");
		item.setNombre("Ricardo Salti");
		item.setDisponibilidad("Ocupado");
		item.setProximaDisponibilidad("10/10/2014");
		item.setAvance("70%");
		
		listadoTalleresDisponibles.add(item);		
		
		return listadoTalleresDisponibles;
	}
	
	private List<PlanProduccionTallerForm> listadoTalleresAsignados(){
		List<PlanProduccionTallerForm> listadoTalleresAsignados = new ArrayList<PlanProduccionTallerForm>();
		PlanProduccionTallerForm item = null;
		
		item = new PlanProduccionTallerForm();
		item.setNombre("Taller Fernanda SAC");
		item.setCantidad(300);
		item.setFechaEntrega("20/10/2014");
		
		listadoTalleresAsignados.add(item);

		item = new PlanProduccionTallerForm();
		item.setNombre("Acupunto SAC");
		item.setCantidad(0);
		item.setFechaEntrega("");
		
		listadoTalleresAsignados.add(item);	

		item = new PlanProduccionTallerForm();
		item.setNombre("Omega Tree & Seis");
		item.setCantidad(0);
		item.setFechaEntrega("");
		
		listadoTalleresAsignados.add(item);	
		
		return listadoTalleresAsignados;
	}
	
	@ModelAttribute("listaColor")
	public List<Color> listaColor(){
		List<Color> listaColor = especificacionPrendaService.listadoColor();
		return listaColor;
	}	
}
