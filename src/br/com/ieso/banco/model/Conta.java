/**
 * 
 */
package br.com.ieso.banco.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Anderson dos Reis Santos
 *
 */
public abstract class Conta implements InterfaceConta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected List<MovimentacaoFinanceira> extrato;
	private static int SEQUENCIAL = 1;
	protected static final int AGENCIA_PADRAO = 1;
	
	public Conta(Cliente cliente) {
		this.agencia=AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.extrato = new ArrayList<>();
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
		extrato.add(new MovimentacaoFinanceira(TipoMovimentacaoFinanceira.SAQUE, new Date(), String.format("R$ %.2f", valor)+"-"));
		
	}

	@Override
	public void depositar(double valor, TipoMovimentacaoFinanceira tipoMovimentacaoFinanceira) {
		this.saldo+= valor;
		extrato.add(new MovimentacaoFinanceira(tipoMovimentacaoFinanceira, new Date(), String.format("R$ %.2f", valor)+"+"));
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
		contaDestino.depositar(valor, TipoMovimentacaoFinanceira.TRANSFERENCIA);
		extrato.add(new MovimentacaoFinanceira(TipoMovimentacaoFinanceira.TRANSFERENCIA, new Date(), String.format("R$ %.2f", valor)+"-"));
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
		System.out.println(String.format("Conta Numero: %d", numero));
		System.out.println("\n          Data                        Tipo de Movimentacao             Valor\n");
		for(MovimentacaoFinanceira mf: extrato) {
			System.out.print(mf.getDataMovimentacao() + "          "+ mf.getTipoMovimentacao().getDescricao());
			if(mf.getTipoMovimentacao()==TipoMovimentacaoFinanceira.DEPOSITO) {
				System.out.print("                       ");
			}else if(mf.getTipoMovimentacao()==TipoMovimentacaoFinanceira.SAQUE) {
				System.out.print("                          ");
			}else {
				System.out.print("                  ");
			}
					
		System.out.println(mf.getValor());
		}
		System.out.println(String.format("\nSaldo: R$ %.2f  \n\n", saldo));
	}
}
