/**
 * 
 */
package br.com.ieso.banco;

import br.com.ieso.banco.model.Cliente;
import br.com.ieso.banco.model.Conta;
import br.com.ieso.banco.model.ContaCorrente;
import br.com.ieso.banco.model.ContaPoupanca;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class Main {
	//Metodo imprimirExtrato implementado nas classes Conta, ContaCorrente e ContaPoupanca, refatorando classe Banco incluindo atributo contas

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Andysso");
		Cliente c2 = new Cliente();
		c2.setNome("Ieso");
		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c2);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.depositar(100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
