package com.mrose.peanut.web;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by martinrose on 2/13/15.
 */
public class OliviaServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    DateTimeFormatter dtf = DateTimeFormat.forPattern("YYYYMMdd.HHmmss.SSSSSS");
    resp.getWriter().append("I LOVE YOU OLIVIA!!! " + dtf.print(DateTime.now()));
  }
}
