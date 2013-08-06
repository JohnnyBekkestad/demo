package se.johnny.demo.service.api;

import java.util.List;

import javax.ejb.Local;

import se.johnny.demo.framework.common.model.User;

@Local
public interface UserService {

	List<User> findAll();
}
