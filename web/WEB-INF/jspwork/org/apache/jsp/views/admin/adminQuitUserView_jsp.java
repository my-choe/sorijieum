/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-10-11 06:39:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminQuitUserView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/../inc/adminTemplate.jsp", Long.valueOf(1570722332602L));
  }

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write(' ');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- 시맨틱 UI -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.css\"/>\r\n");
      out.write(" \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js\"></script>\r\n");
      out.write(" <!-- Custom CSS -->\r\n");
      out.write("\t<link rel = \"stylesheet\" type=\"text/css\" href=\"/sori/resources/css/Admin.css\">\r\n");
      out.write("\t  <script src=\"/sori/resources/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<!-- 폰트변경 -->\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t@font-face { font-family: 'S-CoreDream-7ExtraBold'; \r\n");
      out.write("\t\t\t\t\t src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-7ExtraBold.woff') format('woff'); \r\n");
      out.write("\t\t\t\t\t font-weight: normal; \r\n");
      out.write("\t\t\t\t\t font-style: normal; }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t* { font-family: 'S-CoreDream-7ExtraBold';}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 상단 바 시작! -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"topbar\" style=\"overflow:hidden;\">\r\n");
      out.write("\t\t\t<span class=\"topname\"><a href=\"/sori/index.jsp\" target=\"_blank\"><i class=\"home icon\"></i></a>SORIJIEUM <span style=\"color:#4ecdc4\">ADMIN</span></span>\r\n");
      out.write("\t\t\t<div id=\"adminname\"><a href=\"\">최민영</a> 님!&nbsp;&nbsp;&nbsp;<button class=\"ui mini teal button\">Logout</button></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("<!-- 상단 바 끝! -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 사이드 메뉴 바 시작!-->\r\n");
      out.write("<aside>\r\n");
      out.write("<div class=\"menubar\" style=\"overflow:hidden;\">\r\n");
      out.write("<nav>\r\n");
      out.write("\t<ul class=\"vertical-menu\">\r\n");
      out.write("\t\t<li style=\"font-weight: 600; font-size:12pt\"><a href=\"/sori/views/admin/adminIndexView.jsp\"><i class=\"home icon\"></i>MAIN</a></li>\r\n");
      out.write("\t\t<li style=\"font-weight: 600; font-size:12pt\"><a href=\"javascript:;\"><i class=\"book icon\"></i>도서</a></li>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/blist.ad\">　도서목록</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminAddBookForm.jsp\">　도서추가</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminWishBookListView.jsp\">　도서신청내역</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t<li style=\"font-weight: 600; font-size:12pt\"><a href=\"\"><i class=\"user icon\"></i>사용자</a></li>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminUserListView.jsp\">　회원정보조회</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminQuitUserView.jsp\">　회원탈퇴관리</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminListView.jsp\">　권한관리</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t<li style=\"font-weight: 600; font-size:12pt\"><a href=\"\"><i class=\"clipboard list icon\"></i>게시판</a></li>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"/sori/views/admin/adminQnaListView.jsp\">　문의글관리</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>\r\n");
      out.write("</aside>\r\n");
      out.write("<!-- 사이드 메뉴 끝! -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <footer class=\"site-footer\" style=\"overflow:hidden;\">\r\n");
      out.write("        <p>\r\n");
      out.write("          &copy; Copyrightⓒ 2019 <strong>sorijieum @minyoung.</strong> All Rights Reserved.<br>\r\n");
      out.write("        </p>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원탈퇴관리</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Content 시작! -->\r\n");
      out.write("<section class=\"contentsection\">\r\n");
      out.write("\t<!--회원 목록 시작-->\r\n");
      out.write("            <i class=\"big user times icon\"></i><span style=\"font:black; font-size:17pt; padding:10px;\">회원탈퇴관리</span>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <!-- 검색창 시작!-->\r\n");
      out.write("            <div class=\"greyBox\" style=\"height: 85px;\">\r\n");
      out.write("            <form action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div style=\"float:left\">\r\n");
      out.write("\t\t\t\t<a class=\"ui large teal label\">회원유형</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t<select class=\"search\" name=\"usertype\" id=\"usertype\" style=\"border-radius: 10px; width: 160px;\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"user\">이용자</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"maker\">제작자</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<a class=\"ui large teal label\">아이디</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"search\" name=\"searchuserid\" id=\"userid\" placeholder=\"내용입력\" style=\"border-radius: 10px; width: 200px;\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<a class=\"ui large teal label\">탈퇴유형</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t<select class=\"search\" name=\"searchtype\" id=\"searchtype\" style=\"border-radius: 10px; width: 160px;\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"G\">일반탈퇴</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"F\">강제탈퇴</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 검색창 끝! -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 회원검색 결과 리스트 시작! -->\r\n");
      out.write("\t\t\t<div class=\"listBoxBG\" style=\"height: 1500px; margin-top:90px;\">\r\n");
      out.write("\t\t\t\t<div class=\"listBox\">\r\n");
      out.write("\t\t\t\t<div>총 <span style=\"font-weight: 600; font-size: 13pt; color:#4ecdc4\">5</span> 명</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<table class=\"listTable\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"2%\"><input type=\"checkbox\" id=\"allCheck\" onclick=\"allChk(this);\"/></th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">아이디</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"13%\">탈퇴유형</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"15%\">탈퇴사유</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">회원탈퇴일</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"checkbox\" name=\"RowCheck\" value=\"getBookcode\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>user02</td>\r\n");
      out.write("\t\t\t\t\t\t<td>일반탈퇴</td>\r\n");
      out.write("\t\t\t\t\t\t<td>기타</td>\r\n");
      out.write("\t\t\t\t\t\t<td>2019/05/02</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<!-- 회원검색 결과 리스트 끝! -->\r\n");
      out.write("       <!-- 회원 목록 끝! -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Content 끝! -->\r\n");
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
