package com.bling.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "ValidateFilter")
public class ValidateFilter implements Filter {

    private ServletContext servletContext;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String login_page=servletContext.getInitParameter("login_page");
    }

    public void init(FilterConfig config) throws ServletException {
        servletContext=config.getServletContext();
    }

}
