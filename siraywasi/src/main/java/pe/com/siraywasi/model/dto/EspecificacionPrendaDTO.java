package pe.com.siraywasi.model.dto;

import java.util.Date;

public class EspecificacionPrendaDTO {
	private int idEspecificacionPrenda;
	private String nombrePrenda;
	private Date fechaProbable;
	private Date fechaEntrega;
	private String nombreCliente;
	private String indicadorMolde;
	private String indicadorPresupuesto;
	private String indicadorPlanProduccion;
	
	public int getIdEspecificacionPrenda() {
		return idEspecificacionPrenda;
	}
	public void setIdEspecificacionPrenda(int idEspecificacionPrenda) {
		this.idEspecificacionPrenda = idEspecificacionPrenda;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}
	public Date getFechaProbable() {
		return fechaProbable;
	}
	public void setFechaProbable(Date fechaProbable) {
		this.fechaProbable = fechaProbable;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getIndicadorMolde() {
		return indicadorMolde;
	}
	public void setIndicadorMolde(String indicadorMolde) {
		this.indicadorMolde = indicadorMolde;
	}
	public String getIndicadorPresupuesto() {
		return indicadorPresupuesto;
	}
	public void setIndicadorPresupuesto(String indicadorPresupuesto) {
		this.indicadorPresupuesto = indicadorPresupuesto;
	}
	public String getIndicadorPlanProduccion() {
		return indicadorPlanProduccion;
	}
	public void setIndicadorPlanProduccion(String indicadorPlanProduccion) {
		this.indicadorPlanProduccion = indicadorPlanProduccion;
	}
}
