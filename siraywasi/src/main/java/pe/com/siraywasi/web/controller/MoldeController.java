package pe.com.siraywasi.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
import pe.com.siraywasi.web.form.MoldeConfeccionListaForm;
import pe.com.siraywasi.web.form.MoldeForm;
import pe.com.siraywasi.web.form.MoldeOperacionForm;

@Controller
@RequestMapping("/molde")
@SessionAttributes({"listaAvioDisponible","listaAvioAsignado",
	"listadoMoldeMedidaTallaS","listadoMoldeMedidaTallaM","listadoMoldeMedidaTallaL","listadoMoldeMedidaTallaXL",
	"listaConfeccion"})
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


		
		//eliminar MoldeAvioListaForm
		
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS = new ArrayList<MoldeMedidaTallaDTO>(); //moldeService.listadoMoldeMedidaTalla(1, "S"); 
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM = new ArrayList<MoldeMedidaTallaDTO>(); //moldeService.listadoMoldeMedidaTalla(1, "M");
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL = new ArrayList<MoldeMedidaTallaDTO>(); //moldeService.listadoMoldeMedidaTalla(1, "L");
		List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL = new ArrayList<MoldeMedidaTallaDTO>(); //moldeService.listadoMoldeMedidaTalla(1, "XL");
		
		model.addAttribute("listadoMoldeMedidaTallaS", listadoMoldeMedidaTallaS);
		model.addAttribute("listadoMoldeMedidaTallaM", listadoMoldeMedidaTallaM);
		model.addAttribute("listadoMoldeMedidaTallaL", listadoMoldeMedidaTallaL);
		model.addAttribute("listadoMoldeMedidaTallaXL", listadoMoldeMedidaTallaXL);
		
		
		List<MoldeConfeccionListaForm> listaConfeccion = new ArrayList<MoldeConfeccionListaForm>();//listaConfeccion();
		model.addAttribute("listaConfeccion", listaConfeccion);
		
		return "molde/registrarmolde";
	}
	
	@RequestMapping(value="/registrarmolde", method = RequestMethod.POST)
	private String registrarMolde(@ModelAttribute("moldeForm") MoldeForm moldeForm,
								@ModelAttribute("listaAvioAsignado") List<Avio> listaAvioAsignado,
								@ModelAttribute("listadoMoldeMedidaTallaS") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS,
								@ModelAttribute("listadoMoldeMedidaTallaM") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM,
								@ModelAttribute("listadoMoldeMedidaTallaL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL,
								@ModelAttribute("listadoMoldeMedidaTallaXL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL,
								@ModelAttribute("listaConfeccion") List<MoldeConfeccionListaForm> listaConfeccion,
								BindingResult result, Model model){
		
		Molde molde = new Molde();
		molde.setNombreMolde(moldeForm.getNombreMolde());
		molde.setPrenda(moldeForm.getNombrePrenda());
		molde.setDetalle(moldeForm.getDetalle());
		
		//registrar el molde
		int idMolde = moldeService.registrarMolde(molde);
		//registrar el molde Avio
		int idMoldeAvio = 0;
		MoldeAvio moldeAvio = null;
		for(Avio avio: listaAvioAsignado){
			moldeAvio = new MoldeAvio(0,idMolde, avio.getIdAvio());
			idMoldeAvio = moldeService.registrarMoldeAvio(idMolde, moldeAvio);
			log.debug(idMoldeAvio);
		}
		//registrar el molde medida
		int idMoldeMedida = 0;
		MoldeMedida moldeMedida = null;
		
		for(MoldeMedidaTallaDTO item : listadoMoldeMedidaTallaS){
			moldeMedida = new MoldeMedida(0,idMolde,item.getNombreMoldeMedida());
			idMoldeMedida = moldeService.registrarMoldeMedida(idMolde, moldeMedida);
			
			//registrar el molde medida talla
			registrarMoldeMedidaTalla(listadoMoldeMedidaTallaS, idMoldeMedida);
			registrarMoldeMedidaTalla(listadoMoldeMedidaTallaM, idMoldeMedida);
			registrarMoldeMedidaTalla(listadoMoldeMedidaTallaL, idMoldeMedida);
			registrarMoldeMedidaTalla(listadoMoldeMedidaTallaXL, idMoldeMedida);
		}
		
		//registrar molde confecciones
		int idMoldeConfeccion = 0;
		MoldeConfeccion moldeConfeccion = null;
		for(MoldeConfeccionListaForm item : listaConfeccion){
			moldeConfeccion = new MoldeConfeccion(0, idMolde, item.getNombreConfeccion(), item.getDetalleConfeccion());
			idMoldeConfeccion = moldeService.registrarMoldeConfeccion(idMolde, moldeConfeccion);
			log.debug(idMoldeConfeccion);
		}
		
		moldeForm = new MoldeForm();
		moldeForm.setResultadoGrabar("OK");
		model.addAttribute("moldeForm", moldeForm);
		
		return "molde/registrarmolde";
	}
	
	private boolean registrarMoldeMedidaTalla(List<MoldeMedidaTallaDTO> listaTallas, int idMoldeMedida){
		try{
			MoldeMedidaTalla moldeMedidaTalla = null;
			int idMoldeMedidaTalla = 0;
			
			for(MoldeMedidaTallaDTO talla : listaTallas){
				moldeMedidaTalla = new MoldeMedidaTalla(0,idMoldeMedida, talla.getTipoTalla(), talla.getCorte(), talla.getPrendaFinal());
				idMoldeMedidaTalla = moldeService.registrarMoldeMedidaTalla(idMoldeMedida, moldeMedidaTalla);
				log.debug(idMoldeMedidaTalla);
			}		 
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	
	
	@RequestMapping(value="/agregaravio", method = RequestMethod.POST)
	private String agregarAvio(@RequestParam("idAvio") int idAvio, Model model,
			@ModelAttribute("listaAvioDisponible") List<Avio> listaAvioDisponible,
			@ModelAttribute("listaAvioAsignado") List<Avio> listaAvioAsignado
			){
		
		for(Avio avio : listaAvioDisponible){
			if(avio.getIdAvio()==idAvio){
				listaAvioAsignado.add(avio);
				listaAvioDisponible.remove(avio);
				break;
			}
		}
		
		model.addAttribute("listaAvioDisponible", listaAvioDisponible);
		model.addAttribute("listaAvioAsignado", listaAvioAsignado);
		
		return "molde/moldeavios";
	}
	
	@RequestMapping(value="/eliminaravio", method = RequestMethod.POST)
	private String eliminarAvio(@RequestParam("idAvio") int idAvio, Model model,
			@ModelAttribute("listaAvioDisponible") List<Avio> listaAvioDisponible,
			@ModelAttribute("listaAvioAsignado") List<Avio> listaAvioAsignado
			){
		
		for(Avio avio: listaAvioAsignado){
			if(avio.getIdAvio()==idAvio){
				listaAvioDisponible.add(avio);
				listaAvioAsignado.remove(avio);
				break;
			}
		}
		model.addAttribute("listaAvioDisponible", listaAvioDisponible);
		model.addAttribute("listaAvioAsignado", listaAvioAsignado);
		
		return "molde/moldeavios";
	}
	
	@RequestMapping(value="/agregarmedida", method = RequestMethod.POST)
	private String agregarMedida(@RequestParam("medida") String medida,
			@RequestParam("corteS") String corteS, @RequestParam("prendaFinalS") String prendaFinalS,
			@RequestParam("corteM") String corteM, @RequestParam("prendaFinalM") String prendaFinalM,
			@RequestParam("corteL") String corteL, @RequestParam("prendaFinalL") String prendaFinalL,
			@RequestParam("corteXL") String corteXL, @RequestParam("prendaFinalXL") String prendaFinalXL,
			@ModelAttribute("listadoMoldeMedidaTallaS") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS,
			@ModelAttribute("listadoMoldeMedidaTallaM") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM,
			@ModelAttribute("listadoMoldeMedidaTallaL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL,
			@ModelAttribute("listadoMoldeMedidaTallaXL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL){
		
			
		agregarTalla(listadoMoldeMedidaTallaS, "S",medida,corteS,prendaFinalS);
		agregarTalla(listadoMoldeMedidaTallaM, "M",medida,corteM,prendaFinalM);
		agregarTalla(listadoMoldeMedidaTallaL, "M",medida,corteL,prendaFinalL);
		agregarTalla(listadoMoldeMedidaTallaXL,"XL",medida,corteXL,prendaFinalXL);
			
			
		return "molde/moldemedidas";
	}
	
	@RequestMapping(value="/agregarconfeccion", method = RequestMethod.POST)
	private String agregarConfeccion(@RequestParam("nombreConfeccion") String nombreConfeccion,
			@RequestParam("detalleConfeccion") String detalleConfeccion,
			@ModelAttribute("listaConfeccion") List<MoldeConfeccionListaForm> listaConfeccion){
		
		MoldeConfeccionListaForm item = new MoldeConfeccionListaForm();
		item.setIdMolde(0);
		item.setNombreConfeccion(nombreConfeccion);
		item.setDetalleConfeccion(detalleConfeccion);
		

		int mayor = 0;
		for(MoldeConfeccionListaForm itemBusqueda : listaConfeccion)
		{
			if(itemBusqueda.getIdMoldeConfeccion() > mayor){
				mayor = itemBusqueda.getIdMoldeConfeccion();
			}
		}
		mayor++;		
		item.setIdMoldeConfeccion(mayor);
		
		listaConfeccion.add(item);
		
		return "molde/moldeconfecciones";
	}
	
	private void agregarTalla(List<MoldeMedidaTallaDTO> listaTallas, String tipoTalla, String medida, String corte, String prendaFinal){
		MoldeMedidaTallaDTO talla = new MoldeMedidaTallaDTO();
		talla.setIdMolde(0);
		talla.setIdMoldeMedida(0);
		//talla.setIdMoldeMedidaTalla(0); //aqui colocar un correlativo
		talla.setNombreMoldeMedida(medida);
		talla.setCorte(corte);
		talla.setPrendaFinal(prendaFinal);
		talla.setTipoTalla(tipoTalla);
		
		int mayor = 0;
		for(MoldeMedidaTallaDTO item : listaTallas)
		{
			if(item.getIdMoldeMedidaTalla() > mayor){
				mayor = item.getIdMoldeMedidaTalla();
			}
		}
		mayor++;
		talla.setIdMoldeMedidaTalla(mayor);
		
		//log.debug(talla.getIdMoldeMedidaTalla());
		
		listaTallas.add(talla);
		
	}
	
	@RequestMapping(value="/eliminarmedida", method = RequestMethod.POST)
	private String eliminarMedidas(@RequestParam("idMoldeMedidaTalla") int idMoldeMedidaTalla,
			@ModelAttribute("listadoMoldeMedidaTallaS") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaS,
			@ModelAttribute("listadoMoldeMedidaTallaM") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaM,
			@ModelAttribute("listadoMoldeMedidaTallaL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaL,
			@ModelAttribute("listadoMoldeMedidaTallaXL") List<MoldeMedidaTallaDTO> listadoMoldeMedidaTallaXL){
		
		eliminarTalla(idMoldeMedidaTalla, listadoMoldeMedidaTallaS);
		eliminarTalla(idMoldeMedidaTalla, listadoMoldeMedidaTallaM);
		eliminarTalla(idMoldeMedidaTalla, listadoMoldeMedidaTallaL);
		eliminarTalla(idMoldeMedidaTalla, listadoMoldeMedidaTallaXL);
			
		
		return "molde/moldemedidas";
	}
	
	
	private void eliminarTalla(int idMoldeMedidaTalla, List<MoldeMedidaTallaDTO> listadoTallas){
		
		for(MoldeMedidaTallaDTO medida : listadoTallas){
			if(medida.getIdMoldeMedidaTalla()==idMoldeMedidaTalla){
				listadoTallas.remove(medida);
				break;
			}
		}		
	}
	
	@RequestMapping(value="/eliminarconfeccion", method = RequestMethod.POST)
	private String eliminarConfeccion(@RequestParam("idMoldeConfeccion") int idMoldeConfeccion,
			@ModelAttribute("listaConfeccion") List<MoldeConfeccionListaForm> listaConfeccion){
		
		for(MoldeConfeccionListaForm item : listaConfeccion){
			if(item.getIdMoldeConfeccion()==idMoldeConfeccion){
				listaConfeccion.remove(item);
				break;
			}
		}
		
		return "molde/moldeconfecciones";
	}
	
	@RequestMapping(value="/moldeavios", method = RequestMethod.POST)
	private String moldeAvios(Model model){
		
		List<Avio> listaAvioDisponible = moldeService.listadoAvio(); 
		model.addAttribute("listaAvioDisponible",listaAvioDisponible);
		List<Avio> listaAvioAsignado = new ArrayList<Avio>();
		model.addAttribute("listaAvioAsignado",listaAvioAsignado);		
		
		return "molde/moldeavios";
	}	
}
