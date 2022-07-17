package com.tms.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter("/*")
public class AccessFilter extends HttpFilter {
    public static final String accessParam = "token";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        if (httpServletRequest.getMethod().equalsIgnoreCase("GET") || checkHeaderHaveParam(httpServletRequest, accessParam)) {
            chain.doFilter(req, res);
        } else {
            throw new AccessFilterException();
        }
    }

    private boolean checkHeaderHaveParam(HttpServletRequest req, String paramName) {
        Enumeration<String> headerNames = req.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                if (headerName.equals(paramName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
