/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-12-08 13:24:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Admin Login</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"AdminLoginValidation.js\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\" />\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"vendor/select2/select2.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-login100\"\r\n");
      out.write("\t\tstyle=\"background-image: url('images/logo6.jpg');\">\r\n");
      out.write("\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30\">\r\n");
      out.write("\t\t\t<form class=\"login100-form validate-form\" action=\"../admin/admin.jsp\"\r\n");
      out.write("\t\t\t\tmethod=\"get\" onsubmit=\"return validate()\">\r\n");
      out.write("\t\t\t\t<span class=\"login100-form-title p-b-37\"> ADMIN LOGIN </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input m-b-20\"\r\n");
      out.write("\t\t\t\t\tdata-validate=\"Enter username\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"uname\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"username\"> <span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input m-b-25\"\r\n");
      out.write("\t\t\t\t\tdata-validate=\"Enter password\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"pass\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"password\"> <span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container-login100-form-btn\">\r\n");
      out.write("\t\t\t\t\t<button class=\"login100-form-btn\">Sign In</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<a href=\"../Designs/index.jsp\" class=\"txt2 hov1\"> Back to Home\r\n");
      out.write("\t\t\t\t\t\tPage </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\r\n");
      out.write("\t<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
