package pe.com.siraywasi.model.dto;

public class PlanProduccionTallerResumenDTO {
	private String color;
	private String talla;
	private int cantidad;
	private String tipoTaller;
	private String nombre;
	private String fechaEntrega;
	
	public PlanProduccionTallerResumenDTO() {
	}

	public PlanProduccionTallerResumenDTO(String color, String talla,
			int cantidad, String tipoColor, String nombre, String fechaEntrega) {
		this.color = color;
		this.talla = talla;
		this.cantidad = cantidad;
		this.tipoTaller = tipoColor;
		this.nombre = nombre;
		this.fechaEntrega = fechaEntrega;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipoTaller() {
		return tipoTaller;
	}

	public void setTipoTaller(String tipoColor) {
		this.tipoTaller = tipoColor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
}
