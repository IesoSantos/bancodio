/**
 * 
 */
package br.com.ieso.banco.model;

/**
 * @author Anderson dos Reis Santos
 *
 */
public abstract class Conta implements InterfaceConta {
	private int agencia;
	private int numero;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
