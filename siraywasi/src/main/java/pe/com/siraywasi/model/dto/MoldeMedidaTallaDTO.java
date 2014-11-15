package pe.com.siraywasi.model.dto;

public class MoldeMedidaTallaDTO {
	private int idMolde;
	private int idMoldeMedida;
	private int idMoldeMedidaTalla;
	private String nombreMoldeMedida;
	private String corte;
	private String prendaFinal;
	private String tipoTalla;
	
	public MoldeMedidaTallaDTO() {
	}
	
	public MoldeMedidaTallaDTO(int idMolde, int idMoldeMedida,
			int idMoldeMedidaTalla, String nombreMoldeMedida, String corte,
			String prendaFinal, String tipoTalla) {
		this.idMolde = idMolde;
		this.idMoldeMedida = idMoldeMedida;
		this.idMoldeMedidaTalla = idMoldeMedidaTalla;
		this.nombreMoldeMedida = nombreMoldeMedida;
		this.corte = corte;
		this.prendaFinal = prendaFinal;
		this.tipoTalla = tipoTalla;
	}

	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public int getIdMoldeMedida() {
		return idMoldeMedida;
	}
	public void setIdMoldeMedida(int idMoldeMedida) {
		this.idMoldeMedida = idMoldeMedida;
	}
	public int getIdMoldeMedidaTalla() {
		return idMoldeMedidaTalla;
	}
	public void setIdMoldeMedidaTalla(int idMoldeMedidaTalla) {
		this.idMoldeMedidaTalla = idMoldeMedidaTalla;
	}
	public String getNombreMoldeMedida() {
		return nombreMoldeMedida;
	}
	public void setNombreMoldeMedida(String nombreMoldeMedida) {
		this.nombreMoldeMedida = nombreMoldeMedida;
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
	public String getTipoTalla() {
		return tipoTalla;
	}
	public void setTipoTalla(String tipoTalla) {
		this.tipoTalla = tipoTalla;
	}
}
