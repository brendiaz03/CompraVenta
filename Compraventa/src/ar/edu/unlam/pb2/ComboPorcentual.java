package ar.edu.unlam.pb2;

public class ComboPorcentual extends Combo {
	
	private Integer porcentajeDescuento;

	public ComboPorcentual(String nombre, Tipo tipo, Integer porcentajeDescuento) {
		super(nombre, tipo);
		this.porcentajeDescuento=porcentajeDescuento;
	}

	public Integer getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Integer porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	
}
