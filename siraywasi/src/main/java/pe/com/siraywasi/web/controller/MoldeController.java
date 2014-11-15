package pe.com.siraywasi.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.MoldeMedidaTallaDTO;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;
import pe.com.siraywasi.service.MoldeService;
import pe.com.siraywasi.web.form.MoldeAvioListaForm;
import pe.com.siraywasi.web.form.MoldeConfeccionListaForm;
import pe.com.siraywasi.web.form.MoldeForm;
import pe.com.siraywasi.web.form.MoldeOperacionForm;

@Controller
@RequestMapping("/molde")
public class MoldeController {

	@Autowired
	private MoldeService moldeService;
	
	private Logger log = Logger.getLogger(MoldeController.class);
	
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
	
	@RequestMapping(value="/registrarmolde", method = RequestMethod.GET)
	private String registrarMolde(Model model){
		log.info("GET: registrar molde");
		
		MoldeForm moldeForm = new MoldeForm();
		model.addAttribute("moldeForm", moldeForm);

		List<MoldeAvioListaForm> listaAvioDisponible = listaAvioDisponible();
		model.addAttribute("listaAvioDisponible",listaAvioDisponible);
		List<MoldeAvioListaForm> listaAvioAsignado = listaAvioAsignado();
		model.addAttribute("listaAvioAsignado",listaAvioAsignado);
		
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS = moldeService.listadoMoldeMedidaTalla(1, "S"); 
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM = moldeService.listadoMoldeMedidaTalla(1, "M");
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL = moldeService.listadoMoldeMedidaTalla(1, "L");
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL = moldeService.listadoMoldeMedidaTalla(1, "XL");
		
		model.addAttribute("listadoMoldeMedidaTallaS", listadoMoldeMedidaTallaS);
		model.addAttribute("listadoMoldeMedidaTallaM", listadoMoldeMedidaTallaM);
		model.addAttribute("listadoMoldeMedidaTallaL", listadoMoldeMedidaTallaL);
		model.addAttribute("listadoMoldeMedidaTallaXL", listadoMoldeMedidaTallaXL);
		
		
		List<MoldeConfeccionListaForm> listaConfeccion = listaConfeccion();
		model.addAttribute("listaConfeccion", listaConfeccion);
		
		return "molde/registrarmolde";
	}
	
	private List<MoldeAvioListaForm> listaAvioDisponible(){
		List<MoldeAvioListaForm> listaAvioDisponible = new ArrayList<MoldeAvioListaForm>();
		MoldeAvioListaForm item = null;
		item = new MoldeAvioListaForm(1,"Cierre","D");
		listaAvioDisponible.add(item);
		item = new MoldeAvioListaForm(2,"Cuello","D");
		listaAvioDisponible.add(item);
		item = new MoldeAvioListaForm(3,"Estampado","D");
		listaAvioDisponible.add(item);
		
		return listaAvioDisponible;
	}
	
	private List<MoldeAvioListaForm> listaAvioAsignado(){
		List<MoldeAvioListaForm> listaAvioAsignado = new ArrayList<MoldeAvioListaForm>();
		MoldeAvioListaForm item = null;
		item = new MoldeAvioListaForm(4,"Bordado","A");
		listaAvioAsignado.add(item);
		item = new MoldeAvioListaForm(5,"Forro de popelina","A");
		listaAvioAsignado.add(item);
		item = new MoldeAvioListaForm(6,"Elastico","A");
		listaAvioAsignado.add(item);
		item = new MoldeAvioListaForm(7,"Cola de rata en la cintura","A");
		listaAvioAsignado.add(item);
		
		return listaAvioAsignado;
	}	
	
	private List<MoldeConfeccionListaForm> listaConfeccion(){
		List<MoldeConfeccionListaForm> listaConfeccion = new ArrayList<MoldeConfeccionListaForm>();
		MoldeConfeccionListaForm item = null;
		item = new MoldeConfeccionListaForm(1,"Bragueta","Orillado con remate simple (1 aguja) con doble pespunte en costura a 11 puntadas por pulgada");
		listaConfeccion.add(item);
		item = new MoldeConfeccionListaForm(1,"Bolsillo Delantero","Embolsado con remalle simple y recubierto de dos agujas con sep de 1/4\" a 11 puntadas por pulgada ");
		listaConfeccion.add(item);

		return listaConfeccion;
	}
}
