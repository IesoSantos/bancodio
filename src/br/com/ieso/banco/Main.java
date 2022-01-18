/**
 * 
 */
package br.com.ieso.banco;

import br.com.ieso.banco.builder.BuilderCliente;
import br.com.ieso.banco.builder.BuilderEndereco;
import br.com.ieso.banco.model.Cliente;
import br.com.ieso.banco.model.Conta;
import br.com.ieso.banco.model.ContaCorrente;
import br.com.ieso.banco.model.ContaPoupanca;
import br.com.ieso.banco.model.TipoMovimentacaoFinanceira;

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
	
		Cliente c1 = BuilderCliente.getCliente1();
		c1.setEndereco(BuilderEndereco.getEndereco1());
		
		Cliente c2 = BuilderCliente.getCliente2();
		c2.setEndereco(BuilderEndereco.getEndereco2());
		
		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c2);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.depositar(100, TipoMovimentacaoFinanceira.DEPOSITO);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cp.sacar(10);
	
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
