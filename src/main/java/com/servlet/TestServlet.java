package com.servlet;

import com.controller.UpLoadProductController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by wufeifei on 2016/12/23.
 */
@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet implements Servlet {
    private transient ServletConfig servletConfig;
    private transient static final Log logger = LogFactory.getLog(UpLoadProductController.class);

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String servletName = servletConfig.getServletName();
        Enumeration<String> parameterNames = servletRequest.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            logger.info(servletRequest.getParameter(parameterName));
        }
        ServletContext context = servletRequest.getServletContext();
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.print("<html><head></head><body> Hello From  " + servletName + "</body></html>");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
