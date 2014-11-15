package pe.com.siraywasi.model.dto;

public class PlanProduccionTallaResumenDTO {
	private int idPlanProduccion;
	private String talla;
	private int cantidad;
	
	public PlanProduccionTallaResumenDTO() {
	}

	public PlanProduccionTallaResumenDTO(int idPlanProduccion, String talla,
			int cantidad) {
		this.idPlanProduccion = idPlanProduccion;
		this.talla = talla;
		this.cantidad = cantidad;
	}

	public int getIdPlanProduccion() {
		return idPlanProduccion;
	}

	public void setIdPlanProduccion(int idPlanProduccion) {
		this.idPlanProduccion = idPlanProduccion;
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
}

