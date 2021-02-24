package org.bankapp.service;

import org.bankapp.dao.UserRepository;
import org.bankapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void createCustomer(User customer) {
		userRepository.save(customer);
	}

	public User getCustomerInfo(int acctID) {
		return userRepository.findById(acctID).orElse(null);
	}

	public void deleteCustomer(int acctID) {
		userRepository.deleteById(acctID);
	}

}
