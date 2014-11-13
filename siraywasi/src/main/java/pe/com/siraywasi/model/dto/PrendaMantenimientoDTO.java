package pe.com.siraywasi.model.dto;

public class PrendaMantenimientoDTO {
	private int idPrenda;
	private String nombrePrenda;
	private String nombreTipoTela;
	
	public PrendaMantenimientoDTO() {
	}
	
	public PrendaMantenimientoDTO(int idPrenda, String nombrePrenda,
			String nombreTipoTela) {
		this.idPrenda = idPrenda;
		this.nombrePrenda = nombrePrenda;
		this.nombreTipoTela = nombreTipoTela;
	}
	public int getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(int idPrenda) {
		this.idPrenda = idPrenda;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}
	public String getNombreTipoTela() {
		return nombreTipoTela;
	}
	public void setNombreTipoTela(String nombreTipoTela) {
		this.nombreTipoTela = nombreTipoTela;
	}
	
	
}
