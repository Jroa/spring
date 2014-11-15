package pe.com.siraywasi.model.dto;

public class PresupuestoMateriaPrimaTallaDTO {
	private String idPresupuesto;
	private String tipoCosto;
	private String concepto;
	private int cantidad;
	private double precio;
	private double costo;
	private String talla;
	public PresupuestoMateriaPrimaTallaDTO() {
	}
	public PresupuestoMateriaPrimaTallaDTO(String idPresupuesto,
			String tipoCosto, String concepto, int cantidad, double precio,
			double costo, String talla) {
		this.idPresupuesto = idPresupuesto;
		this.tipoCosto = tipoCosto;
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.costo = costo;
		this.talla = talla;
	}
	public String getIdPresupuesto() {
		return idPresupuesto;
	}
	public void setIdPresupuesto(String idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}
	public String getTipoCosto() {
		return tipoCosto;
	}
	public void setTipoCosto(String tipoCosto) {
		this.tipoCosto = tipoCosto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
}
