package ar.edu.unlam.pb2;

public class ComboAbsoluto extends Combo{
	
	private Integer pesoDescuento;

	public ComboAbsoluto(String nombre, Tipo tipo, Integer pesos) {
		super(nombre, tipo);
		this.pesoDescuento=pesos;
	}

	public Integer getPesoDescuento() {
		return pesoDescuento;
	}

	public void setPesoDescuento(Integer pesoDescuento) {
		this.pesoDescuento = pesoDescuento;
	}

	
}
