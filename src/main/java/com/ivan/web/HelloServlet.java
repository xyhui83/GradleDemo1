package com.ivan.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yinghui on 2017/8/30.
 */
public class HelloServlet extends HttpServlet {

    private Logger log= LoggerFactory.getLogger(HelloServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.debug("HelloServlet doGet方法被调用了！");
        response.getWriter().write("Hello,gradle servlet");
    }
}
