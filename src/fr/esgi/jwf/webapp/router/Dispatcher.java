package fr.esgi.jwf.webapp.router;

import org.esgi.web.framework.context.interfaces.IContext;
import org.esgi.web.framework.router.interfaces.IDispatcher;

import fr.esgi.jwf.webapp.action.LoginAction;

public class Dispatcher implements IDispatcher {

	@Override
	public void dispatch(IContext context) {
		// try {
		new LoginAction().proceed(context);
		// ((IAction) Class.forName(context.getActionClass()).newInstance())
		// .proceed(context);
		// } catch (InstantiationException | IllegalAccessException
		// | ClassNotFoundException | NullPointerException e) {
		// new ErrorAction(404, "action non trouvée").proceed(context);
		// }
	}
}
