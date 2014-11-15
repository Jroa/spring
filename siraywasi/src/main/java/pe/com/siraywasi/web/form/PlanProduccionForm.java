package pe.com.siraywasi.web.form;

import java.util.Date;

import pe.com.siraywasi.model.Color;

public class PlanProduccionForm {
	private int idPlanProduccion;
	private String nombrePrenda;
	private Date fechaProbableEntrega;
	private String prenda;
	private String estado;
	private Color color;
	
	public PlanProduccionForm() {
	}

	public PlanProduccionForm(int idPlanProduccion, String nombrePrenda,
			Date fechaProbableEntrega, String prenda, String estado, Color color) {
		this.idPlanProduccion = idPlanProduccion;
		this.nombrePrenda = nombrePrenda;
		this.fechaProbableEntrega = fechaProbableEntrega;
		this.prenda = prenda;
		this.estado = estado;
		this.color = color;
	}

	public int getIdPlanProduccion() {
		return idPlanProduccion;
	}

	public void setIdPlanProduccion(int idPlanProduccion) {
		this.idPlanProduccion = idPlanProduccion;
	}

	public String getNombrePrenda() {
		return nombrePrenda;
	}

	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}

	public Date getFechaProbableEntrega() {
		return fechaProbableEntrega;
	}

	public void setFechaProbableEntrega(Date fechaProbableEntrega) {
		this.fechaProbableEntrega = fechaProbableEntrega;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
