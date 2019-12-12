/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-12-04 17:35:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Blood;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import blood.dto.*;
import blood.bl.*;
import blood.dl.*;
import blood.utlity.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public final class donor_005fdonationform_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

String donor_id, donor_name, blood_grp, gender, age, dod;

	long phone;
	float height, weight;
	DonorDTO donor = null;
	int result;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("blood.dl");
    _jspx_imports_packages.add("blood.utlity");
    _jspx_imports_packages.add("blood.bl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("blood.dto");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.sql.Date");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	try {

		donor_id = (String) session.getAttribute("donorId");
		donor_name = (String) session.getAttribute("donor_name");
		blood_grp = (String) session.getAttribute("blood_grp");
		gender = (String) session.getAttribute("gender");
		age = (String) session.getAttribute("age");
		phone = (Long) session.getAttribute("Phone");
		height = (Float) session.getAttribute("Height");
		weight = (Float) session.getAttribute("Weight");
		dod = request.getParameter("dod");

		System.out.println(donor_id);
		System.out.println(donor_name);
		System.out.println(blood_grp);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(dod);

		donor = new DonorDTO();
		donor.setDonor_id(donor_id);
		donor.setDonor_name(donor_name);
		donor.setBlood_grp(blood_grp);
		donor.setGender(gender);
		donor.setAge(age);
		donor.setPhone(phone);
		donor.setHeight(height);
		donor.setWeight(weight);
		donor.setDod(dod);

		//donor.

		result = AdminAcceptDonorBL.addToAdminAccept(donor);

		if (result > 0) {
			session.setAttribute("message", "Donor details added to Admin successfully");
		} else {
			session.setAttribute("message", "Please try again later");
		}
		response.sendRedirect("welcome_donor.jsp");
	}

	catch (Exception e) {
		System.out.println("**Error**: Donor: donor_donationform_process" + e.getMessage());
		e.printStackTrace();
		response.sendRedirect("donor_add.jsp");
	}

      out.write('\r');
      out.write('\n');
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
