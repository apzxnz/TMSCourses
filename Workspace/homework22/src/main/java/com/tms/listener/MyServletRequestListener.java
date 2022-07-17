package com.tms.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener("/*")
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("-- request destroyed --");
        System.out.println(sre.getServletRequest().toString());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("-- request initialized --");
        System.out.println(sre.getServletRequest().toString());
    }
}
