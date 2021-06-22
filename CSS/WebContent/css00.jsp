<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function load(){
		/* location获取的是服务器端的相关信息，如果想获取客户端信息需要用request.getRemoteAddr() */
		alert("location.host:"+location.host);// localhost:8080 主机名（ip）：端口号 192.168.0.105:8080
		alert("location.hostname:"+location.hostname);// localhost 主机名 location.hostname:192.168.0.105
		alert("location.protocol:"+location.protocol);// location.protocol:http:
		alert("location.origin:"+location.origin);// http://localhost:8080 location.origin:http://192.168.0.105:8080
		alert("location.pathname:"+location.pathname);// /CSS/css00.jsp location.pathname:/CSS/css00.jsp
		alert("window.location:"+window.location);// http://localhost:8080/CSS/css00.jsp window.location:http://192.168.0.105:8080/CSS/css00.jsp
		document.getElementById("id02").style.display="";/* 显示  默认值 */
		document.getElementById("id03").style.display="none";/* 显示 */
		document.all.id04.style.display="";/* 显示  默认值 */
		document.all.id05.style.display="none";/* 显示 */
		/* alert(document.getElementById("id03").style.display); */
	}
</script>
</head>
<body onload="load()">
	<a id="id00" href="css01.jsp" style="display: ;color:red">0.to css01</a><!-- 显示 -->
	<a id="id01" href="css01.jsp" style="display:none">1.to css01</a><!-- 不显示 -->
	<a id="id02" href="css01.jsp">2.to css01</a><!-- 显示 -->
	<a id="id03" href="css01.jsp">3.to css01</a><!-- 不显示 -->
	<a id="id04" href="css01.jsp">4.to css01</a><!-- 显示 -->
	<a id="id05" href="css01.jsp">5.to css01</a><!-- 不显示 -->
</body>
</html>