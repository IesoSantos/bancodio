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
	protected Cliente cliente;
	private static int SEQUENCIAL = 1;
	protected static final int AGENCIA_PADRAO = 1;
	
	public Conta(Cliente cliente) {
		this.agencia=AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor){
		if(saldo<valor) {
			throw new IllegalArgumentException("Saldo Insuficiente!");
		}
		if(valor<0) {
			throw new IllegalArgumentException("Valor de saque negativo!");
		}
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo+= valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(saldo<valor) {
			throw new IllegalArgumentException("Saldo Insuficiente!");
		}
		if(valor<0) {
			throw new IllegalArgumentException("Valor de transferencia negativo!");
		}
		this.saldo-= valor;
		contaDestino.depositar(valor);
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	protected void ImprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
}
