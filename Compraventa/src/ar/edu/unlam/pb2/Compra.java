package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Compra implements Sugerible{
	
	private Cliente cliente;
	private Integer montoTotal;
	private List<Articulo> articulos;
	private List<Combo> combos;
	
	public Compra(Cliente cliente) {
		this.cliente = cliente;
		this.articulos = new ArrayList<>();
		this.combos = new ArrayList<>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public List<Combo> getCombos() {
		return combos;
	}

	public void setCombos(List<Combo> combos) {
		this.combos = combos;
	}


	@Override
	public String mostrarSugerencias() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
