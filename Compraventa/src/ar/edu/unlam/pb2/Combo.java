package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Sugerible{
	
	private String nombre;
	private Tipo tipo;
	private List<Articulo> articulos;
	
	public Combo(String nombre, Tipo tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.articulos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	public void agregarArticulo(Articulo articulo) throws ArticuloRepetidoException {
		if(buscarArticulo(articulo.getNombre()) == null) {
			articulos.add(articulo);
		}else {
			throw new ArticuloRepetidoException("Articulo Repetido");
		}
	}

	private Articulo buscarArticulo(String nombre) {
		for(Articulo a : articulos) {
			if(a.equals(nombre)) {
				return a;
			}
		}
		return null;
	}
	
	public Integer getValor() {
		Integer contador = 0;
		for(Articulo a : articulos) {
			contador = contador + a.getValor();
		}
		return contador;
	}

	@Override
	public String mostrarSugerencias() {
		// TODO Auto-generated method stub
		return null;
	}
}
