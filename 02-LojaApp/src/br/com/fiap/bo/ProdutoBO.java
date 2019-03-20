package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	private static ProdutoBO produtoBo;
	private static ArrayList<ProdutoTO> lista = new ArrayList<ProdutoTO>();

	public ProdutoBO() {
		lista.add(new ProdutoTO(401, 2.99, 4, "Camisa Branca"));
		lista.add(new ProdutoTO(402, 2.99, 4, "Camisa Azul"));
		lista.add(new ProdutoTO(403, 2.99, 4, "Camisa Rosa"));
		System.out.println("S: " + lista.size());
	}

	public static ProdutoBO getInstance() {
		if (produtoBo == null) {
			produtoBo = new ProdutoBO();
		}

		return produtoBo;
	}

	public static ProdutoTO consultaBO(int codProd) {

		for (ProdutoTO produto : lista) {
			if (produto.getCodigo() == codProd) {
				return produto;

			}
		}
		return null;
	}

	public static List<ProdutoTO> listar() {
		return lista;
	}

	public void cadastrar(ProdutoTO produto) {
		lista.add(produto);
	}

	public void atualizar(ProdutoTO produto) {
		for (ProdutoTO prod : lista) {
			if (produto.getCodigo() == prod.getCodigo()) {
				prod.setDescricao(produto.getDescricao());
				prod.setQuantidade(produto.getQuantidade());
				prod.setPreco(produto.getPreco());
				break;
			}
		}
	}

	public void remover(int codigo) {
		for (ProdutoTO produto : lista) {
			if (produto.getCodigo() == codigo) {
				lista.remove(produto);
				break;
			}
		}

	}

}
