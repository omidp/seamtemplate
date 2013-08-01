package org.omidbiz.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.omidbiz.model.Customer;

@Name("customerAction")
@Stateless
public class CustomerActionImpl implements CustomerAction{

	@PersistenceContext
	EntityManager entityManager;
	
	@In
	Customer customer;
	
	@Override
	public void save() {
		entityManager.persist(customer);
		entityManager.flush();
	}

}
