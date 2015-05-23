package fr.esgi.jwf.webapp.context;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.esgi.web.framework.context.interfaces.IHtmlContext;

public class HtmlContext implements IHtmlContext {

	private String actionClass;

	@Override
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	@Override
	public String getActionClass() {
		return this.actionClass;
	}

	@Override
	public HttpServletRequest _getRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpServletResponse _getResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParameter(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getParameterKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File[] getUploadedFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String key, Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSessionAttribute(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getSessionAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getUserCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetSession() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IHtmlContext toHtmlContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPageTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPageDescription(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addKeyword(String keyword) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCssLink(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addJsLink(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getKeywords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getCssLinks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getJsLinks() {
		// TODO Auto-generated method stub
		return null;
	}

}
