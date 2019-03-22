package br.com.hickandrade.to;

public interface GenericDAO<T,K> {

	void cadastrar(T tabela);
	
	void atualizar(T tabela);
	
	void remover(K codigo) throws Exception;
	
	T buscar(K codigo);
	
	void commit() throws Exception;
}

