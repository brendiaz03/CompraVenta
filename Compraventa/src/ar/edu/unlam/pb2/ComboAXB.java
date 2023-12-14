package ar.edu.unlam.pb2;

public class ComboAXB extends Combo{
	
	private Articulo gratis;

	public ComboAXB(String nombre, Tipo tipo, Articulo gratis) {
		super(nombre, tipo);
		this.setGratis(gratis);
	}

	public Articulo getGratis() {
		return gratis;
	}

	public void setGratis(Articulo gratis) {
		this.gratis = gratis;
	}
	
}
