package pe.com.siraywasi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/taller")
public class TallerController {
	
	@RequestMapping(value="/registrareficienciataller", method = RequestMethod.GET)
	public String registrarEficienciaTaller(Model model){
		return "taller/registrareficienciataller";
	}
}
