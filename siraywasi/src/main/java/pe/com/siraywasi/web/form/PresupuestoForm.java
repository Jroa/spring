package pe.com.siraywasi.web.form;

import java.util.Date;

public class PresupuestoForm {
	private String nombre;
	private Date fechaEntrega;
	private String estado;
	private String detalle;
	private int porcentajeProduccionAdm;
	private int porcentajeUtilidad;
	
	public PresupuestoForm() {
	}

	public PresupuestoForm(String nombre, Date fechaEntrega, String estado,
			String detalle, int porcentajeProduccionAdm, int porcentajeUtilidad) {
		this.nombre = nombre;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.detalle = detalle;
		this.porcentajeProduccionAdm = porcentajeProduccionAdm;
		this.porcentajeUtilidad = porcentajeUtilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getPorcentajeProduccionAdm() {
		return porcentajeProduccionAdm;
	}

	public void setPorcentajeProduccionAdm(int porcentajeProduccionAdm) {
		this.porcentajeProduccionAdm = porcentajeProduccionAdm;
	}

	public int getPorcentajeUtilidad() {
		return porcentajeUtilidad;
	}

	public void setPorcentajeUtilidad(int porcentajeUtilidad) {
		this.porcentajeUtilidad = porcentajeUtilidad;
	}
	
	
}
