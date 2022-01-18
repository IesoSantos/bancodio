/**
 * 
 */
package br.com.ieso.banco.model;

import java.util.Date;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class MovimentacaoFinanceira {
	private TipoMovimentacaoFinanceira tipoMovimentacao;
	private Date dataMovimentacao;
	private String valor;
	/**
	 * @param tipoMovimentacao
	 * @param dataMovimentacao
	 * @param valor
	 */
	public MovimentacaoFinanceira(TipoMovimentacaoFinanceira tipoMovimentacao, Date dataMovimentacao, String valor) {
		super();
		this.tipoMovimentacao = tipoMovimentacao;
		this.dataMovimentacao = dataMovimentacao;
		this.valor = valor;
	}
	public TipoMovimentacaoFinanceira getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	public String getValor() {
		return valor;
	}
	
}
