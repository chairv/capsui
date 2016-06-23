package com.capsui.secure.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.capsui.utils.Cons;

/**
 * Created by tancw on 2016/6/23.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
			AuthLogin authLogin = ((HandlerMethod) handler).getMethodAnnotation(AuthLogin.class);
			HttpSession session = request.getSession();
			if (authLogin == null || authLogin.validate() == false) {
				return true;
			} else if (session.getAttribute(Cons.SESSION_USER) != null) {
				return true;
			}
            response.sendRedirect("/go.do?p=resources/html/login.html");
            return false;
		}

		return super.preHandle(request, response, handler);
	}
}
