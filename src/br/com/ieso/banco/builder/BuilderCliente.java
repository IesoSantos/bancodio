/**
 * 
 */
package br.com.ieso.banco.builder;

import br.com.ieso.banco.model.Cliente;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class BuilderCliente {
	
	public static Cliente getCliente1() {
		Cliente c1 = new Cliente();
		c1.setNome("Andysso");
		return c1;
	}
	
	public static Cliente getCliente2() {
		Cliente c2 = new Cliente();
		c2.setNome("Ieso");
		return c2;
	}
}
