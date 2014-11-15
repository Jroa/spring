package pe.com.siraywasi.model.dto;

public class PresupuestoTotalDTO {
	private int idPresupuesto;
	private String concepto;
	private String porcentaje;
	private double total;
	
	public PresupuestoTotalDTO(int idPresupuesto, String concepto,
			String porcentaje, double total) {
		this.idPresupuesto = idPresupuesto;
		this.concepto = concepto;
		this.porcentaje = porcentaje;
		this.total = total;
	}
	public PresupuestoTotalDTO() {
	}
	
	public int getIdPresupuesto() {
		return idPresupuesto;
	}
	public void setIdPresupuesto(int idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
