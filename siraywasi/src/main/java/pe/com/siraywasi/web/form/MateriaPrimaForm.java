package pe.com.siraywasi.web.form;

import pe.com.siraywasi.model.Marca;
import pe.com.siraywasi.model.Proveedor;
import pe.com.siraywasi.model.TipoCompra;
import pe.com.siraywasi.model.TipoMateriaPrima;
import pe.com.siraywasi.model.UnidadMedida;

public class MateriaPrimaForm {
	private int idMateriaPrima;
	private String nombreMateriaPrima;
	private Marca marca;
	private int cantidad;
	private Proveedor proveedor;
	private String detalle;
	private TipoMateriaPrima tipoMateriaPrima;
	private TipoCompra tipoCompra;
	private UnidadMedida unidadMedida;
	private double costo;
	
	
	
	public TipoMateriaPrima getTipoMateriaPrima() {
		return tipoMateriaPrima;
	}
	public void setTipoMateriaPrima(TipoMateriaPrima tipoMateriaPrima) {
		this.tipoMateriaPrima = tipoMateriaPrima;
	}
	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}
	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	public String getNombreMateriaPrima() {
		return nombreMateriaPrima;
	}
	public void setNombreMateriaPrima(String nombreMateriaPrima) {
		this.nombreMateriaPrima = nombreMateriaPrima;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public TipoCompra getTipoCompra() {
		return tipoCompra;
	}
	public void setTipoCompra(TipoCompra tipoCompra) {
		this.tipoCompra = tipoCompra;
	}
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
}
