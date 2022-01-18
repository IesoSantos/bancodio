/**
 * 
 */
package br.com.ieso.banco.model;

import java.util.List;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class Banco {
	private int id;
	private String name;
	private List<Conta> contas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Conta> getContas(){
		return this.contas;
	}
}
