package fr.esgi.jwf.webapp.action;

import java.io.IOException;

import org.apache.velocity.app.VelocityEngine;
import org.esgi.web.framework.action.interfaces.IActionRenderable;
import org.esgi.web.framework.context.interfaces.IContext;
import org.esgi.web.framework.renderer.interfaces.IRenderer;

import fr.esgi.jwf.webapp.model.User;

public class CreateAction implements IActionRenderable {

	public User user;
	private IRenderer renderer;
	private IContext context;

	@Override
	public int setPriority(int priority) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCredential(String role) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean needsCredentials() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCredential(String[] roles) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void proceed(IContext context) {

		VelocityEngine v = new VelocityEngine();

		try {
			context._getResponse().getOutputStream()
					.println("<b>Create action</b><br />");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		this.context = context;

		String[] loginTab = (String[]) context.getParameter("login");
		String[] passwordTab = (String[]) context.getParameter("password");

		if (loginTab != null && passwordTab != null) {
			String login = loginTab[0];
			String password = passwordTab[0];

			if (login != null && !login.isEmpty() && password != null
					&& !password.isEmpty()) {

				User user = new User();
				user.login = login;
				user.password = password;
				User.addUser(user);

				try {
					context._getResponse().getOutputStream()
							.println("<b>User created</b><br />");
					context._getResponse().getOutputStream()
							.println("<h4><a href='JWF/list'>List</a></h4>");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					context._getResponse().getOutputStream()
							.println("<h1>Can not create this user</h1><br />");
					context._getResponse().getOutputStream()
							.println("<h4><a href='JWF/list'>List</a></h4>");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	@Override
	public void setRenderer(IRenderer renderer) {
		this.renderer = renderer;
	}

	@Override
	public String render() {
		return renderer.render(context);
	}

}
