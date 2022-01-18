/**
 * 
 */
package br.com.ieso.banco.model;

/**
 * @author Anderson dos Reis Santos
 *
 */
public enum TipoMovimentacaoFinanceira {
	DEPOSITO("Deposito"), SAQUE("Saque"), TRANSFERENCIA("Transferência");
	
	private String descricao;
	
	TipoMovimentacaoFinanceira(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
