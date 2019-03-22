package br.com.hickandrade.to;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TEste {
public static void main(String[] args) {
	
	EntityManagerFactory fabrica = Persistence.createEntityManagerSingleton.getInstance();
	EntityManager em = fabrica.createEntityManager();
	
	AulaTO aula = new AulaTO();
	aula.setMateria("IOS");
	aula.setProfessor("calypso");
	aula.setSala("705");
	aula.setQuantidade("42");
	
	AulaDAO dao = new AulaDAOImpl();
	
	try {
		dao.cadastrar(aula);
		dao.commit();
	} catch (Exception e) {
		e.printStackTrace();
		
	}
}
}


		
		
	

