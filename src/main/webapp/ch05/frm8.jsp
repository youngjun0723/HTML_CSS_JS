<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- frm8.html 입력한 data를 받아서 처리 페이지 -->
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String url = request.getParameter("url");
	// response를 줘서 url로 바로 가게끔 줌
	response.sendRedirect(url);
%>
id =  <%=id%><br>
pwd =  <%=pwd%><br>
id =  <%=url%><br>