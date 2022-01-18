/**
 * 
 */
package br.com.ieso.banco.model;

/**
 * @author Anderson dos Reis Santos
 *
 */
public abstract class Conta implements InterfaceConta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	private static int SEQUENCIAL = 1;
	protected static final int AGENCIA_PADRAO = 1;
	
	public Conta() {
		this.agencia=AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
	
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
