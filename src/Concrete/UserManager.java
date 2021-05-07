package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	@Override
	public void add(User user) {
		if(userCheckService.checkPerson(user)) {
			System.out.println("User added: " + user.getFirstName());
		}
		else {
			System.out.println("Not a valid person for adding");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted: " + user.getFirstName());
		
	}

}
