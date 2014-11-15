package pe.com.siraywasi.web.form;

public class MoldeForm {
	private int idMolde;
	private String nombreMolde;
	private String nombrePrenda;
	private String detalle;
	
	private String medida;
	private String corte;
	private String prendaFinal;
	
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public String getNombreMolde() {
		return nombreMolde;
	}
	public void setNombreMolde(String nombreMolde) {
		this.nombreMolde = nombreMolde;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getPrendaFinal() {
		return prendaFinal;
	}
	public void setPrendaFinal(String prendaFinal) {
		this.prendaFinal = prendaFinal;
	}
}
