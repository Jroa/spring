package pe.com.siraywasi.web.form;

public class PlanProduccionTallerForm {
	private String tipoTaller;
	private String nombre;
	private String disponibilidad;
	private String proximaDisponibilidad;
	private String avance;
	private int cantidad;
	private String fechaEntrega;
	
	public PlanProduccionTallerForm() {
	}

	public PlanProduccionTallerForm(String tipoTaller, String nombre,
			String disponibilidad, String proximaDisponibilidad, String avance,
			int cantidad, String fechaEntrega) {
		this.tipoTaller = tipoTaller;
		this.nombre = nombre;
		this.disponibilidad = disponibilidad;
		this.proximaDisponibilidad = proximaDisponibilidad;
		this.avance = avance;
		this.cantidad = cantidad;
		this.fechaEntrega = fechaEntrega;
	}

	public String getTipoTaller() {
		return tipoTaller;
	}

	public void setTipoTaller(String tipoTaller) {
		this.tipoTaller = tipoTaller;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getProximaDisponibilidad() {
		return proximaDisponibilidad;
	}

	public void setProximaDisponibilidad(String proximaDisponibilidad) {
		this.proximaDisponibilidad = proximaDisponibilidad;
	}

	public String getAvance() {
		return avance;
	}

	public void setAvance(String avance) {
		this.avance = avance;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
}
