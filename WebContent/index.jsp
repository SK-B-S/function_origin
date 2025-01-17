<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>野菜リスト</title>
</head>
<body>
    <h1>野菜リスト</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>名前</th>
        </tr>
        <c:forEach var="vege" items="${veges}">
            <tr>
                <td>${vege.vegeId}</td>
                <td>${vege.vegeName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
