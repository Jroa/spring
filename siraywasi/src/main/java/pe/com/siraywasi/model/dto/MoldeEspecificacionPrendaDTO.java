package pe.com.siraywasi.model.dto;

public class MoldeEspecificacionPrendaDTO {
	private int idEspecificacionPrenda;
	private int idMolde;
	private String nombreCatalogoPrenda;
	private String nombreCliente;
	private String indicadorMolde;
	private String indicadorPresupuesto;
	private String indicadorProduccion;
	private String indicadorMateriaPrima;
	private String indicadorMantenimiento;
	
	public MoldeEspecificacionPrendaDTO() {
	}

	
	public MoldeEspecificacionPrendaDTO(int idEspecificacionPrenda,
			int idMolde, String nombreCatalogoPrenda, String nombreCliente,
			String indicadorMolde, String indicadorPresupuesto,
			String indicadorProduccion, String indicadorMateriaPrima,
			String indicadorMantenimiento) {
		this.idEspecificacionPrenda = idEspecificacionPrenda;
		this.idMolde = idMolde;
		this.nombreCatalogoPrenda = nombreCatalogoPrenda;
		this.nombreCliente = nombreCliente;
		this.indicadorMolde = indicadorMolde;
		this.indicadorPresupuesto = indicadorPresupuesto;
		this.indicadorProduccion = indicadorProduccion;
		this.indicadorMateriaPrima = indicadorMateriaPrima;
		this.indicadorMantenimiento = indicadorMantenimiento;
	}

	public String getIndicadorMantenimiento() {
		return indicadorMantenimiento;
	}


	public void setIndicadorMantenimiento(String indicadorMantenimiento) {
		this.indicadorMantenimiento = indicadorMantenimiento;
	}


	public String getIndicadorPresupuesto() {
		return indicadorPresupuesto;
	}


	public void setIndicadorPresupuesto(String indicadorPresupuesto) {
		this.indicadorPresupuesto = indicadorPresupuesto;
	}


	public int getIdEspecificacionPrenda() {
		return idEspecificacionPrenda;
	}

	public void setIdEspecificacionPrenda(int idEspecificacionPrenda) {
		this.idEspecificacionPrenda = idEspecificacionPrenda;
	}

	public int getIdMolde() {
		return idMolde;
	}

	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}

	public String getNombreCatalogoPrenda() {
		return nombreCatalogoPrenda;
	}

	public void setNombreCatalogoPrenda(String nombreCatalogoPrenda) {
		this.nombreCatalogoPrenda = nombreCatalogoPrenda;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombrecliente) {
		this.nombreCliente = nombrecliente;
	}

	public String getIndicadorMolde() {
		return indicadorMolde;
	}

	public void setIndicadorMolde(String indicadorMolde) {
		this.indicadorMolde = indicadorMolde;
	}

	public String getIndicadorProduccion() {
		return indicadorProduccion;
	}

	public void setIndicadorProduccion(String indicadorProduccion) {
		this.indicadorProduccion = indicadorProduccion;
	}

	public String getIndicadorMateriaPrima() {
		return indicadorMateriaPrima;
	}

	public void setIndicadorMateriaPrima(String indicadorMateriaPrima) {
		this.indicadorMateriaPrima = indicadorMateriaPrima;
	}



}
