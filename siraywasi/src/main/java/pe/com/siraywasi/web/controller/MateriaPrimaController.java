package pe.com.siraywasi.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.siraywasi.model.Marca;
import pe.com.siraywasi.model.MateriaPrima;
import pe.com.siraywasi.model.Proveedor;
import pe.com.siraywasi.model.TipoCompra;
import pe.com.siraywasi.model.TipoMateriaPrima;
import pe.com.siraywasi.model.UnidadMedida;
import pe.com.siraywasi.model.dto.MateriaPrimaDTO;
import pe.com.siraywasi.service.MateriaPrimaService;
import pe.com.siraywasi.web.form.MateriaPrimaForm;

@Controller
@RequestMapping("/materiaprima")
public class MateriaPrimaController {

	@Autowired
	private MateriaPrimaService materiaPrimaService;
	
	private Logger log = Logger.getLogger(MateriaPrimaService.class);
	
	@RequestMapping(value="/listado", method= RequestMethod.GET)
	private String listado(Model model){
		log.info("GET: listado de MateriaPrima");
		
		List<MateriaPrimaDTO> listadoMateriaPrima = materiaPrimaService.listadoMateriaPrima();
		model.addAttribute("listadoMateriaPrima", listadoMateriaPrima);
		
		log.debug(materiaPrimaService.listadoMateriaPrima().size());
		
		return "materiaprima/listado";
	}
	
	@RequestMapping(value="/inventario", method= RequestMethod.GET)
	private String inventario(Model model){
		log.info("GET: listado de MateriaPrima");
		
		MateriaPrimaForm materiaPrimaForm = new MateriaPrimaForm();
		model.addAttribute("materiaPrimaForm", materiaPrimaForm);
		
		return "materiaprima/inventario";
	}
	
	@RequestMapping(value="/inventario", method= RequestMethod.POST)
	private String inventario(@ModelAttribute("materiaPrimaForm") MateriaPrimaForm form, 
											BindingResult result, Model model){

		MateriaPrima materiaPrima = new MateriaPrima();
		materiaPrima.setNombreMateriaPrima(form.getNombreMateriaPrima());
		materiaPrima.setIdMarca(form.getMarca().getIdMarca());
		materiaPrima.setCantidad(form.getCantidad());
		materiaPrima.setIdProveedor(form.getProveedor().getIdProveedor());
		materiaPrima.setIdTipoMateriaPrima(form.getTipoMateriaPrima().getIdTipoMateriaPrima());
		materiaPrima.setIdTipoCompra(form.getTipoCompra().getIdTipoCompra());
		materiaPrima.setCosto(form.getCosto());
		materiaPrima.setDetalle(form.getDetalle());
		
		materiaPrimaService.registrarMateriaPrima(materiaPrima);
		
		return "materiaprima/inventario";
	}
	
	@ModelAttribute("listaMarcas")
	private List<Marca> listaMarca(){
		List<Marca> listaMarca = materiaPrimaService.listadoMarca();
		return listaMarca;
	}
	
	@ModelAttribute("listaProveedores")
	private List<Proveedor> listaProveedor(){
		List<Proveedor> listaProveedor = materiaPrimaService.listadoProveedor();
		return listaProveedor;
	}
	
	@ModelAttribute("listaTipoCompras")
	private List<TipoCompra> listaTipoCompra(){
		List<TipoCompra> listaTipoCompra = materiaPrimaService.listadoTipoCompra();
		return listaTipoCompra;
	}
	
	@ModelAttribute("listaUnidadMedidas")
	private List<UnidadMedida> listaUnidadMedida(){
		List<UnidadMedida> listaUnidadMedida = materiaPrimaService.listadoUnidadMedida();
		return listaUnidadMedida;
	}
	
	@ModelAttribute("listaTipoMateriaPrimas")
	private List<TipoMateriaPrima> listaTipoMateriaPrima(){
		List<TipoMateriaPrima> listaTipoMateriaPrima = materiaPrimaService.listadoTipoMateriaPrima();
		return listaTipoMateriaPrima;
	}
	
}
