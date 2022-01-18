/**
 * 
 */
package br.com.ieso.banco.model;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class ContaCorrente extends Conta{

	/**
	 * @param cliente
	 */
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==Extrato da Conta Corrente==");
		super.ImprimirInfosComuns();
		
	}	
}
