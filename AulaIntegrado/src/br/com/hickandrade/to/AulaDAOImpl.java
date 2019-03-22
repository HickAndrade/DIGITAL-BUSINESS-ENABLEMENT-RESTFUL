package br.com.hickandrade.to;

import javax.persistence.EntityManager;

public class AulaDAOImpl extends GenericDAOImpl<AulaTO,Integer> implements AulaDAO {

	public AulaDAOImpl(EntityManager em) {
		super(em);
	}
 
}
