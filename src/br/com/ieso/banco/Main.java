/**
 * 
 */
package br.com.ieso.banco;

import br.com.ieso.banco.model.Cliente;
import br.com.ieso.banco.model.Conta;
import br.com.ieso.banco.model.ContaCorrente;
import br.com.ieso.banco.model.ContaPoupanca;
import br.com.ieso.banco.model.Endereco;

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
		Endereco e1 = new Endereco();
		e1.setLogradouro("Rua Branca Raposo");
		e1.setNumero("220");
		e1.setComplemento("casa 01");
		e1.setBairro("Jardim Carlu");
		e1.setCidade("São Paulo");
		e1.setPais("Brasil");
		e1.setCep("02415-100");
		c1.setEndereco(e1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Ieso");
		Endereco e2 = new Endereco();
		e2.setLogradouro("Rua Nossa Senhora de Aparecida");
		e2.setNumero("502");
		e2.setComplemento("");
		e2.setBairro("Jardim Itapoan");
		e2.setCidade("Mongagua");
		e2.setPais("Brasil");
		e2.setCep("");
		c2.setEndereco(e2);
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
