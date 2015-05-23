package fr.esgi.jwf.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

	public static Map<String, User> map = new HashMap<String, User>();

	public String login;
	public String password;
	public List<String> roles;

	/*
	 * CRUD
	 */

	public static void addUser(User user) {
		if (user.login != null && user.password != null) {
			map.put(user.login, user);
		}
	}

	public static List<String> getUserLogins() {
		return new ArrayList<String>(map.keySet());
	}

	public static User getUserByLogin(String login) {
		return map.get(login);
	}

	public static void removeUser(User user) {
		map.remove(user.login);
	}

	public static List<User> getUsers() {
		return new ArrayList<User>(map.values());
	}

	public static void updateUser(User userToUpdate, String newLogin,
			String newPassword) {

		User newUser = new User();
		newUser.login = newLogin;
		newUser.password = newPassword;

		map.remove(userToUpdate.login);
		map.put(newLogin, newUser);
	}

}
