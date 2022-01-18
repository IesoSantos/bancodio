package br.com.ieso.banco.builder;

import br.com.ieso.banco.model.Endereco;

public class BuilderEndereco {
	
	public static Endereco getEndereco1() {
		Endereco e1 = new Endereco();
		e1.setLogradouro("Rua Branca Raposo");
		e1.setNumero("220");
		e1.setComplemento("casa 01");
		e1.setBairro("Jardim Carlu");
		e1.setCidade("São Paulo");
		e1.setPais("Brasil");
		e1.setCep("02415-100");
		return e1;
	}
	
	public static Endereco getEndereco2() {
		Endereco e2 = new Endereco();
		e2.setLogradouro("Rua Nossa Senhora de Aparecida");
		e2.setNumero("502");
		e2.setComplemento("");
		e2.setBairro("Jardim Itapoan");
		e2.setCidade("Mongagua");
		e2.setPais("Brasil");
		e2.setCep("03015-100");
		return e2;
	}

}
