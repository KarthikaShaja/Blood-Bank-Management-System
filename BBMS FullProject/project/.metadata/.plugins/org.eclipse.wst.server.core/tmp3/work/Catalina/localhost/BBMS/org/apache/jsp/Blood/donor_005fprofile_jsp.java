/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-12-09 06:02:01 UTC
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
import java.util.*;
import java.text.SimpleDateFormat;

public final class donor_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 
 
         long phone;
	     float height,weight;  
	     
         String sdonor_id,sdonor_name,sblood_grp,sgender,sdob,sphone,sheight,sweight;
         boolean ErrorFlag=false;
         boolean sErrorFlag=false;
         
         String message="";          
         AdminAcceptDonorDTO donor=null;
         AdminAcceptDonorDTO donor2=null;
 
         int result=0;
                   
      
  
     String result2;
     ArrayList<AdminProfileDTO> counts = null;
     AdminProfileDTO count =null;
     
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Blood/../Designs/footer.jsp", Long.valueOf(1575866283426L));
    _jspx_dependants.put("/Blood/../includes/menu.jsp", Long.valueOf(1575811222581L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title>Donor Profile</title>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write(" \r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Designs/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Swiper CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Designs/css/swiper.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("* {box-sizing: border-box;}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select, textarea {\r\n");
      out.write("  width: 50%;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  margin-top: 6px;\r\n");
      out.write("  margin-bottom: 16px;\r\n");
      out.write("  resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("input[type=date]{\r\n");
      out.write("  width: 25%;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  margin-top: 6px;\r\n");
      out.write("  margin-bottom: 16px;\r\n");
      out.write("  resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 12px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("  background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1>Profile</h1>\r\n");
      out.write("\r\n");
      out.write(" ");
if(session.getAttribute("donorId")!=null)
                  {
                	  out.println(" Hello "+(String)session.getAttribute("donorId"));
                	  //session.removeAttribute("message");
                  }
                  else
                  {
                	  response.sendRedirect("donor_logout.jsp");
                  }
                  
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("ol {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 14px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not (.active ) {\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("\torange\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<ol>\r\n");
      out.write("\t\t<li><a href=\"../Designs/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/donor_add.jsp\">Register Donor</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/receiver_add.jsp\">Register Receiver</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/donor_view_all.jsp\">View Donor Details</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/receiver_view_all.jsp\">View Receiver\r\n");
      out.write("\t\t\t\tDetails</a></li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("      ");

        if(request.getParameter("submit")!=null)
        {
                	   
         message="";
         ErrorFlag=false;
         sErrorFlag=false;         
         sdonor_id="";sdonor_name="";sblood_grp="";sgender="";sdob="";sphone="";sheight="";sweight="";
                  	    
        }
   
        else
        {
           message="";
           ErrorFlag=false;
           sErrorFlag=false;
           String donor_id=(String)session.getAttribute("donorId");
           donor=DonorBL.getDonor(donor_id);   
           
            
          if(donor!=null)
           {
        	   
           	   sdonor_name=donor.getDonor_name(); 
           	   session.setAttribute("donor_name", sdonor_name);
           	   
           	   sblood_grp =donor.getBlood_grp();
           	   session.setAttribute("blood_grp", sblood_grp);

           	   sgender= donor.getGender();
           	   session.setAttribute("gender", sgender);

           	   sdob=donor.getAge();
           	   session.setAttribute("dob", sdob);

           	   phone=donor.getPhone();
           	   session.setAttribute("Phone", phone);

           	   height=donor.getHeight();
           	   session.setAttribute("Height", height);

           	   weight=donor.getWeight();
           	   session.setAttribute("Weight", weight);
           	   
           	   
           	System.out.println(donor_id);
        	System.out.println(sdonor_name);
        	System.out.println(sblood_grp);
        	System.out.println(sgender);
        	System.out.println(sdob);
        	System.out.println(phone);
        	System.out.println(height);
        	System.out.println(weight);


           }
           else
           {
           	   sdonor_id="";sdonor_name="";sblood_grp="";sgender="";sdob="";sphone="";sheight="";sweight="";
           }
              		   
       }
                   
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");

	String donor_id=(String)session.getAttribute("donorId");

    int count=AdminProfileBL.getCount(donor_id);
    System.out.println(count);
    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"imgcontainer\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>Hello, ");
      out.print(sdonor_name );
      out.write("</h3>\r\n");
      out.write("    <img src=\"../images/Blood.jpg\" alt=\"HELLO!!\" width=\"200px\" height=\"200px\"  style=\"border-radius:50%\" >\r\n");
      out.write("    <h4>You Have Donated ");
      out.print(count);
      out.write(" Times</h4>\r\n");
      out.write("</center>    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write(" <center>\r\n");
      out.write(" <table>\r\n");
      out.write(" <tr>\r\n");
      out.write(" <form action=\"welcome_donor.jsp\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t<label for=\"name\">Your ID</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"text\" id=\"name\" name=\"txtDonorId\" placeholder=\"Your name..\" \r\n");
      out.write("    value=\"");
      out.print(session.getAttribute("donorId"));
      out.write("\" readonly ><br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <label for=\"name\">Your Name</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"text\" id=\"name\" name=\"txtDonorName\" placeholder=\"Your name..\" value=\"");
      out.print(sdonor_name );
      out.write("\" readonly><br><br>\r\n");
      out.write("\r\n");
      out.write("     <label for=\"bld_grp\" >Blood Group</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("     <input type=\"text\" id=\"name\" name=\"gender\" placeholder=\"blood group..\" value=\"");
      out.print(sblood_grp);
      out.write("\" readonly><br><br>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <label for=\"gender\">Gender : </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("           <input type = \"text\" name = \"gender\" value = \"");
      out.print(sgender);
      out.write("\" readonly><br><br>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"dob\">Age</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <input type = \"text\" id =\"date\" name=\"dob\" value=\"");
      out.print(sdob);
      out.write("\" readonly><br><br>\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    <label for=\"phone\">Contact No:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <input type = \"text\" name = \"txtPhone\" placeholder = \"Your contact no is..\" value=\"");
      out.print(phone);
      out.write("\" readonly><br><br>\r\n");
      out.write("    \r\n");
      out.write("      <label for=\"height\">Height</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"text\" id=\"height\" name=\"txtHeight\" value=\"");
      out.print(height);
      out.write("\" placeholder=\"Your height is...\" readonly><br><br>\r\n");
      out.write("    \r\n");
      out.write("      <label for=\"weight\">Weight</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"text\" id=\"weight\" name=\"txtWeight\" value=\"");
      out.print(weight);
      out.write("\" placeholder=\"Your weight..\" readonly><br><br>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <input type=\"submit\" value=\"Back\">\r\n");
      out.write(" </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write(" \r\n");
      out.write(" <form action=\"donor_edit.jsp\" method=\"post\">\r\n");
      out.write(" <input type=\"submit\" value=\"Update\">\r\n");
      out.write(" </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write(" \r\n");
      out.write(" <form action=\"donor_donationform.jsp\" method=\"post\">\r\n");
      out.write(" <input type=\"submit\" value=\"Donate\">\r\n");
      out.write(" </form>\r\n");
      out.write(" \r\n");
      out.write(" </tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" </center> \r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"background-image: url('images/footer-bg.png')\">\r\n");
      out.write("\t<footer class=\"site-footer\">\r\n");
      out.write("\t\t<div class=\"footer-widgets\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-about\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>This project is designed for successful completion of a\r\n");
      out.write("\t\t\t\t\t\t\t\tproject on blood bank management system. This project aims at\r\n");
      out.write("\t\t\t\t\t\t\t\tmaintaining all the information pertaining to blood donors,\r\n");
      out.write("\t\t\t\t\t\t\t\tdifferent blood groups available in each blood bank and help\r\n");
      out.write("\t\t\t\t\t\t\t\tthem manage in a better way.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\tAll rights reserved</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-about -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Contact</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"p-0 m-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Addtress:</span>ABCD Trivandrum Kerala India </br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Phone:</span>+91 773 636 7984<br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Email:</span>mbvishnu17@gmail.com</br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Usefull Links</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Designs/index.jsp\">Home</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_add.jsp\">Donor Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_add.jsp\">Receiver Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_view_all.jsp\">View Donor</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_view_all.jsp\">View Receiver</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../includes/login_redirect.jsp\">Login</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-links -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- .row -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- .container -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- .footer-widgets -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- .site-footer -->\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.collapsible.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/swiper.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countdown.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/circle-progress.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countTo.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.barfiller.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/custom.js'></script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
