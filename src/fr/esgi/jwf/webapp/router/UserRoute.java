package fr.esgi.jwf.webapp.router;

import org.esgi.web.framework.context.interfaces.IContext;
import org.esgi.web.framework.router.interfaces.IRewriteRule;

import fr.esgi.jwf.webapp.action.CreateAction;
import fr.esgi.jwf.webapp.enums.ActionEnum;
import fr.esgi.jwf.webapp.enums.FormatEnum;

public class UserRoute implements IRewriteRule {

	private ActionEnum action;

	public UserRoute(ActionEnum action) {
		this.action = action;
	}

	public void changeAction(ActionEnum action) {
		this.action = action;
	}

	@Override
	public boolean matches(IContext context) {
		return true;
	}

	@Override
	public void rewrite(IContext context) {

		this.action = getActionEnumByContext(context);

		setFormatToContext(context);
		setUserLoginToContext(context);

		switch (action) {
		case CREATE:
			context.setActionClass(CreateAction.class.getCanonicalName());
			break;

		default:
			break;
		}

	}

	private void setUserLoginToContext(IContext context) {
		context.setAttribute(
				"login",
				context._getRequest()
						.getRequestURI()
						.substring(
								context._getRequest().getRequestURI()
										.lastIndexOf('/') + 1));
	}

	private void setFormatToContext(IContext context) {

		FormatEnum formatEnum = FormatEnum.HTML; // HTML par défaut

		String format = context._getRequest().getParameter("format");

		if (format != null && !format.isEmpty()) {
			if (format.contains("json")) {
				formatEnum = FormatEnum.JSON;
			} else if (format.contains("xml")) {
				formatEnum = FormatEnum.XML;
			}
		}

		context.setAttribute("format", formatEnum);
	}

	private ActionEnum getActionEnumByContext(IContext context) {

		String uri = context._getRequest().getRequestURI();

		return ActionEnum.CREATE;

		// if (uri.contains("create")) {
		// return ActionEnum.CREATE;
		// } else {
		// return ActionEnum.NONE;
		// }

	}
}
