package se.johnny.demo.web.rest;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import se.johnny.demo.common.model.User;
import se.johnny.demo.service.api.UserService;


@Path("/user")
@ManagedBean
public class UserController {
			
	@Inject
	private UserService service;	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<User> findAll(){		

		return service.findAll();
				
	}				
}
