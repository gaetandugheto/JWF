package fr.esgi.jwf.webapp.renderer.json;

import org.esgi.web.framework.context.interfaces.IContext;
import org.esgi.web.framework.renderer.interfaces.IRenderer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.esgi.jwf.webapp.model.User;

public class ListRerendererJson implements IRenderer {

	@Override
	public String render(IContext context) {

		context._getResponse().setContentType("application/json");

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		return gson.toJson(User.getUsers());
	}

}
