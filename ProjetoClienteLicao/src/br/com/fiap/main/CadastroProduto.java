package br.com.fiap.main;

import br.com.fiap.beans.Produto;

public class CadastroProduto {

	public static void main(String[] args) {
	
		Produto objProduto = new Produto();

		objProduto.setCodigo(001);
		objProduto.setTipo("telefone");
		objProduto.setMarca("Apple");
		objProduto.setValor(9.299);
		
		System.out.println("Codigo: " + objProduto.getCodigo() +
						"\nTipo: " + objProduto.getTipo()+ 
						"\nMarca: " + objProduto.getMarca()+
						"\nValor: " + objProduto.getValor());	
		
		
	}

}
