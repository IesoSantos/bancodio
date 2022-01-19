/**
 * 
 */
package br.com.ieso.banco.model;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class ContaPoupanca extends Conta{
	
	/**
	 * @param cliente
	 */
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=========================== Extrato da Conta Poupanca ===========================");
		super.ImprimirInfosComuns();
	}
}
