package org.bankapp.controller;

import org.bankapp.model.User;
import org.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private BankAccountController accountController;

	@PostMapping("/user")
	public void createUser(@RequestBody User customer) {
		userService.createCustomer(customer);
		accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

	@GetMapping("/user/{acctID}")
	public User getUserInfo(@PathVariable int acctID) {
		return userService.getCustomerInfo(acctID);
	}

	@DeleteMapping("/user/{acctID}")
	public void deleteUser(@PathVariable int acctID) {
		userService.deleteCustomer(acctID);
	}

}
