package se.johnny.demo.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;

import se.johnny.demo.common.model.User;
import se.johnny.demo.service.api.UserService;

@SessionScoped
public class UserServiceImpl implements UserService, Serializable {

	private static final long serialVersionUID = 1L;
		
	@Override
	public List<User> findAll() {			
		System.out.println("-------------------------------- IN USER SERVICE!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		return new ArrayList<>();
	}

}
