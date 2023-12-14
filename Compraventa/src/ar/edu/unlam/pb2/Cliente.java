package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private Integer presupuesto;
	private Tipo articuloPreferido;
	private List<Sugerible> articulosSugerido;
	
	public Cliente(String nombre, Integer presupuesto, Tipo articuloPreferido) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.articuloPreferido = articuloPreferido;
		this.articulosSugerido = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Tipo getArticuloPreferido() {
		return articuloPreferido;
	}

	public void setArticuloPreferido(Tipo articuloPreferido) {
		this.articuloPreferido = articuloPreferido;
	}
	
	public void agregarSugerencia(Sugerible nueva) {
		articulosSugerido.add(nueva);
	}
	
}
