package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	public static ProdutoTO consultaBO(int codProd) {

		if (codProd == 401) {
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Branca");

		} else if (codProd == 402) {
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Azul");
		} else if (codProd == 403) {
			return new ProdutoTO(codProd, 2.99, 4, "Camisa Rosa");
		} else {
			return new ProdutoTO(-1, 0, 0, "Produto não encontrado");
		}
	}

	public static List<ProdutoTO> listar() {
		ArrayList<ProdutoTO> lista = new ArrayList<ProdutoTO>();
		lista.add(ProdutoBO.consultaBO(401));
		lista.add(ProdutoBO.consultaBO(402));
		lista.add(ProdutoBO.consultaBO(403));
			
		return lista;
	}

}
