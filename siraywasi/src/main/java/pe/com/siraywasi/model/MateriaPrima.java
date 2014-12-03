package pe.com.siraywasi.model;

public class MateriaPrima {
	private int idMateriaPrima;
	private String nombreMateriaPrima;
	private int idMarca;
	private int cantidad;
	private int idProveedor;
	private int idTipoMateriaPrima;
	private int idTipoCompra;
	private int idUnidadMedida;
	private double costo;
	private String detalle;
	
	public MateriaPrima() {
		
	}

	public MateriaPrima(int idMateriaPrima, String nombreMateriaPrima,
			int idMarca, int cantidad, int idProveedor, int idTipoMateriaPrima,
			int idTipoCompra, int idUnidadMedida, double costo, String detalle) {
		this.idMateriaPrima = idMateriaPrima;
		this.nombreMateriaPrima = nombreMateriaPrima;
		this.idMarca = idMarca;
		this.cantidad = cantidad;
		this.idProveedor = idProveedor;
		this.idTipoMateriaPrima = idTipoMateriaPrima;
		this.idTipoCompra = idTipoCompra;
		this.idUnidadMedida = idUnidadMedida;
		this.costo = costo;
		this.detalle = detalle;
	}

	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public String getNombreMateriaPrima() {
		return nombreMateriaPrima;
	}

	public void setNombreMateriaPrima(String nombreMateriaPrima) {
		this.nombreMateriaPrima = nombreMateriaPrima;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getIdTipoMateriaPrima() {
		return idTipoMateriaPrima;
	}

	public void setIdTipoMateriaPrima(int idTipoMateriaPrima) {
		this.idTipoMateriaPrima = idTipoMateriaPrima;
	}

	public int getIdTipoCompra() {
		return idTipoCompra;
	}

	public void setIdTipoCompra(int idTipoCompra) {
		this.idTipoCompra = idTipoCompra;
	}

	public int getIdUnidadMedida() {
		return idUnidadMedida;
	}

	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
