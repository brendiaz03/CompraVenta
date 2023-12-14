package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCompraVenta {
	
	@Test
	public void queSePuedanIngresarClientesArticulosYCombos() throws ClienteRepetidoException, ClienteNoEncontradoException, ArticuloNoEncontradoException, ArticuloRepetidoException, ComboRepetidoException, ComboNoEncontradoException {
		Sistema sistema = new Sistema("BrenTema");
		
		Cliente nuevo = new Cliente("Brenda", 1000, Tipo.EXOTICO);
		Articulo artNuevo = new Articulo("Jarra","casi sin uso", 500, 20, Tipo.EXOTICO);
		ComboAbsoluto comboAbs = new ComboAbsoluto("combo exotico", Tipo.EXOTICO, 100);
		comboAbs.agregarArticulo(artNuevo);
		
		sistema.agregarCliente(nuevo);
		sistema.agregarArticulo(artNuevo);
		sistema.agregarCombo(comboAbs);
		
		assertEquals(artNuevo, sistema.buscarArticulo("Jarra"));
	}

}
