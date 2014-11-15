package pe.com.siraywasi.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.dto.PresupuestoMateriaPrimaTallaDTO;
import pe.com.siraywasi.model.dto.PresupuestoTotalDTO;
import pe.com.siraywasi.service.PresupuestoService;
import pe.com.siraywasi.web.form.PresupuestoForm;

@Controller
@RequestMapping("/presupuesto")
public class PresupuestoController {
	
	@Autowired
	private PresupuestoService presupuestoService;
	
	private Logger log = Logger.getLogger(PresupuestoController.class);
	
	@RequestMapping(value="/registrarpresupuesto", method = RequestMethod.GET)
	public String registrarPresupuesto(Model model){
		log.debug("GET: presupuesto Controller");
		
		PresupuestoForm presupuestoForm = new PresupuestoForm();
		model.addAttribute("presupuestoForm", presupuestoForm);
		
		List<PresupuestoMateriaPrimaTallaDTO> listadoMateriaPrimaTallaS = presupuestoService.listadoPresupuestoMateriaPrimaTalla(1, "S");
		List<PresupuestoMateriaPrimaTallaDTO> listadoMateriaPrimaTallaM = presupuestoService.listadoPresupuestoMateriaPrimaTalla(1, "M");
		List<PresupuestoMateriaPrimaTallaDTO> listadoMateriaPrimaTallaL = presupuestoService.listadoPresupuestoMateriaPrimaTalla(1, "L");
		List<PresupuestoMateriaPrimaTallaDTO> listadoMateriaPrimaTallaXL = presupuestoService.listadoPresupuestoMateriaPrimaTalla(1, "XL");
		List<PresupuestoMateriaPrimaTallaDTO> listadoMateriaPrimaResumen = presupuestoService.listadoPresupuestoMateriaPrimaTalla(1, "T");
		
		model.addAttribute("listadoMateriaPrimaTallaS", listadoMateriaPrimaTallaS);
		model.addAttribute("listadoMateriaPrimaTallaM", listadoMateriaPrimaTallaM);
		model.addAttribute("listadoMateriaPrimaTallaL", listadoMateriaPrimaTallaL);
		model.addAttribute("listadoMateriaPrimaTallaXL", listadoMateriaPrimaTallaXL);
		model.addAttribute("listadoMateriaPrimaResumen", listadoMateriaPrimaResumen);
		
		List<PresupuestoTotalDTO> listadoResumenTotal = presupuestoService.listadoResumenTotal(1);
		model.addAttribute("listadoResumenTotal", listadoResumenTotal);
		
		log.debug("total items M" + listadoMateriaPrimaTallaM.size());
		
		return "presupuesto/registrarpresupuesto";
	}
}
