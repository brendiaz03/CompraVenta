package ar.edu.unlam.pb2;

public class Articulo implements Sugerible{
	
	private String nombre;
	private String descripcion;
	private Integer valor;
	private Integer cantidad;
	private Tipo tipo;
	
	public Articulo(String nombre, String descriocion, Integer valor, Integer cantidad, Tipo tipo) {
		this.nombre = nombre;
		this.descripcion = descriocion;
		this.valor = valor;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descriocion) {
		this.descripcion = descriocion;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	@Override
	public String mostrarSugerencias() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
