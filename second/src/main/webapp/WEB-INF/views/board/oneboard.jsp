<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body> 
<form action="">
<table border=3>
<tr>
	<td>�Խù���ȣ</td>
	<td><input type=text value="${oneboard.seq }" readonly></td>
</tr>
<tr>
	<td>�Խù�����</td>
	<td><input type=text value="${oneboard.title }" ></td>
</tr>
<tr>
	<td>�Խù�����</td>
	<td><textarea cols=50 rows=5>${oneboard.contents }</textarea> </td>
</tr>
<tr>
	<td>�Խù��ۼ���</td>
	<td><input type=text value="${oneboard.writer }" readonly></td>
</tr>
<tr>
	<td>�Խù���ȸ��</td>
	<td><input type=text value="${oneboard.viewcount }" readonly></td>
</tr>
<tr>
	<td><input type=submit value="������ư"></td>
	<td><input type=submit value="������ư"></td>
</tr>
	
	
</table>
</form>
</body>
</html>