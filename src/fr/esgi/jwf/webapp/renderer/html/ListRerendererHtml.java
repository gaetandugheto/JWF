package fr.esgi.jwf.webapp.renderer.html;

import org.esgi.web.framework.context.interfaces.IContext;
import org.esgi.web.framework.renderer.interfaces.IRenderer;

import fr.esgi.jwf.webapp.model.User;

public class ListRerendererHtml implements IRenderer {

	@Override
	public String render(IContext context) {

		context._getResponse().setContentType("text/html");

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head><title>Users list</title></head><body>");
		sb.append("<h1>User List</h1>");
		sb.append("<ul>");

		for (String userLogin : User.getUserLogins()) {
			sb.append("<li>");
			sb.append("<a href='/JWF/user/");
			sb.append(userLogin);
			sb.append("'>");
			sb.append(userLogin);
			sb.append("</a>");
			sb.append("</li>");
		}

		sb.append("</ul>");

		sb.append("<form method='POST' action='/JWF/create'>");
		sb.append("<label for='login'>Login</label>");
		sb.append("<input type='text' name='login' id='login'/><br>");
		sb.append("<label for='password'>Password</label>");
		sb.append("<input type='password' name='password' id='password'/><br>");
		sb.append("<input type='submit' value='Add user' name='add' id='add'/>");
		sb.append("</form>");

		sb.append("</body></html>");

		return sb.toString();
	}

}
