/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2016-06-04 08:28:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header class=\"header header-two\">\r\n");
      out.write("  <div class=\"header-wrapper\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t  <div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-6 col-md-2 col-lg-3 logo-box\">\r\n");
      out.write("\t\t  <div class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"index.html\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./resources/img/logo.svg\" class=\"logo-img\" alt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div><!-- .logo-box -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-xs-6 col-md-10 col-lg-9 right-box\">\r\n");
      out.write("\t\t  <div class=\"right-box-wrapper\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"primary\">\r\n");
      out.write("\t\t\t  <div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle btn-navbar collapsed\" data-toggle=\"collapse\" data-target=\".primary .navbar-collapse\">\r\n");
      out.write("\t\t\t\t  <span class=\"text\">Menu</span>\r\n");
      out.write("\t\t\t\t  <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t  <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t  <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t  \r\n");
      out.write("\t\t\t\t<nav class=\"collapse collapsing navbar-collapse\">\r\n");
      out.write("\t\t\t\t  <ul class=\"nav navbar-nav navbar-center\">\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.htm\">Home<span class=\"item-new\">New</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/travel_info/travel_info.htm\">여행정보<span class=\"item-new\">New</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"#\">가이드구함</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"#\">여행자구함<span class=\"item-new\">New</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"#\">여행후기</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"item-danger item-bg text-danger\">\r\n");
      out.write("\t\t\t\t\t  <a href=\"#\">마이페이지</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div><!-- .primary -->\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"phone-active col-sm-9 col-md-9\">\r\n");
      out.write("\t\t  <a href=\"#\" class=\"close\"><span>close</span>×</a>\r\n");
      out.write("\t\t  <span class=\"title\">Call Us</span> <strong>+1 (777) 123 45 67</strong>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"search-active col-sm-9 col-md-9\">\r\n");
      out.write("\t\t  <a href=\"#\" class=\"close\"><span>close</span>×</a>\r\n");
      out.write("\t\t  <form name=\"search-form\" class=\"search-form\">\r\n");
      out.write("\t\t\t<input class=\"search-string form-control\" type=\"search\" placeholder=\"Search here\" name=\"search-string\">\r\n");
      out.write("\t\t\t<button class=\"search-submit\">\r\n");
      out.write("\t\t\t  <svg x=\"0\" y=\"0\" width=\"16px\" height=\"16px\" viewBox=\"0 0 16 16\" enable-background=\"new 0 0 16 16\" xml:space=\"preserve\">\r\n");
      out.write("\t\t\t\t<path fill=\"#231F20\" d=\"M12.001,10l-0.5,0.5l-0.79-0.79c0.806-1.021,1.29-2.308,1.29-3.71c0-3.313-2.687-6-6-6C2.687,0,0,2.687,0,6\r\n");
      out.write("\t\t\t\ts2.687,6,6,6c1.402,0,2.688-0.484,3.71-1.29l0.79,0.79l-0.5,0.5l4,4l2-2L12.001,10z M6,10c-2.206,0-4-1.794-4-4s1.794-4,4-4\r\n");
      out.write("\t\t\t\ts4,1.794,4,4S8.206,10,6,10z\"></path>\r\n");
      out.write("\t\t\t\t<image src=\"img/png-icons/search-icon.png\" alt=\"\" width=\"16\" height=\"16\" style=\"vertical-align: top;\">\r\n");
      out.write("\t\t\t  </svg>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t  </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div><!--.row -->\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div><!-- .header-wrapper -->\r\n");
      out.write("</header><!-- .header -->");
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