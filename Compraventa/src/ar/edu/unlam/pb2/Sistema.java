package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private String nombre;
	private List<Articulo> articulos;
	private List<Cliente> clientes;
	private List<Combo> combos;
	private List<Compra> registroCompras;
	
	public Sistema(String nombre) {
		this.nombre=nombre;
		this.articulos= new ArrayList<>();
		this.clientes= new ArrayList<>();
		this.combos= new ArrayList<>();
		this.registroCompras= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Combo> getCombos() {
		return combos;
	}

	public void setCombos(List<Combo> combos) {
		this.combos = combos;
	}
	
	public Cliente buscarCliente(String nombre){
		for(Cliente c : clientes) {
			if(c.getNombre().equals(nombre)) {
				return c;
			}
			
		}
		return null;
	}

	public void agregarCliente(Cliente nuevo) throws ClienteRepetidoException {
		if(buscarArticulo(nuevo.getNombre()) == null) {
			clientes.add(nuevo);
		}else {
			throw new ClienteRepetidoException("Articulo repetido");
		}	
	}
	
	public Articulo buscarArticulo(String nombre) {
		for(Articulo c : articulos) {
			if(c.getNombre().equals(nombre)) {
				return c;
			}
			
		}
		return null;
	}

	public void agregarArticulo(Articulo artNuevo) throws ArticuloRepetidoException{
		if(buscarArticulo(artNuevo.getNombre()) == null) {
			articulos.add(artNuevo);
		}else {
			throw new ArticuloRepetidoException("Articulo repetido");
		}	
	}

	public void agregarCombo(Combo combo) throws ComboRepetidoException {
		if(buscarCombo(combo.getNombre()) == null) {
			combos.add(combo);
		}else {
			throw new ComboRepetidoException("Combo Repetido");
		}
	}
	
	public Combo buscarCombo(String nombre) {
		for(Combo c : combos) {
			if(c.getNombre().equals(nombre)) {
				return c;
			}
		}
		return null;
	}
	
	public void agregarSugerenciaACliente(String nombre) {
		Cliente cliente = buscarCliente(nombre);
		if(cliente != null) {
			for(Articulo a : articulos) {
				if(cliente.getArticuloPreferido().equals(a.getTipo()) && cliente.getPresupuesto() >= a.getValor()) {
					cliente.agregarSugerencia(a);
				}
			}
			for(Combo c : combos) {
				if(cliente.getArticuloPreferido().equals(c.getTipo()) && cliente.getPresupuesto() >= c.getValor()) {
					cliente.agregarSugerencia(c);
				}
			}
		}
		
	}
	
}
