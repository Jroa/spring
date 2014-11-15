package pe.com.siraywasi.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/planproduccion")
public class PlanProduccionController {
	
	private Logger log = Logger.getLogger(PlanProduccionController.class);
	
	@RequestMapping(value="/registrarplanproduccion", method = RequestMethod.GET)
	public String registrarPlanProduccion(Model model){
		return "planproduccion/registrarplanproduccion";
	}
}
