package org.omidbiz.ejb;

import javax.ejb.Local;

import org.omidbiz.model.Customer;

@Local
public interface CustomerAction {

	public void save();

}
