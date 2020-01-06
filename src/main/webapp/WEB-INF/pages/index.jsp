<%--
  Created by IntelliJ IDEA.
  User: praBwa
  Date: 07.01.2020
  Time: 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Самый точный проноз погоды</title>
    <style>
    <%@include file="/WEB-INF/pages/style.css"%>
</style>
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro&display=swap" rel="stylesheet">
</head>
<body>

<a>${page}</a>
<center>
    <div id="main">
        <div class="card"><img src="https://lh3.googleusercontent.com/A3AoMqSCIuDqhGywYXSY1P7PRS8AlSKxDi6a7JnznGSwLEFk8aHGn8AtVqnw2hL6TL0" style="height: 50px;"><br><a class="maintext">+5&deg</a><br><a class="maintext" style="font-size: 12pt">880 мм.рт.ст</a><br><a class="maintext" style="font-size: 12pt">Ветер 10 м/c</a></div>
        <div class="card"><img src="http://cs5-2.4pda.to/8094136.png" style="height: 50px;"><br><a class="maintext">+3&deg</a><br><a class="maintext" style="font-size: 12pt">876 мм.рт.ст</a><br><a class="maintext" style="font-size: 12pt">Ветер 11 м/c</a></div>
        <div class="card"><img src="https://www.google.ru/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png" style="height: 50px; "><br><a class="maintext">+4&deg</a><br><a class="maintext" style="font-size: 12pt">881 мм.рт.ст</a><br><a class="maintext" style="font-size: 12pt">Ветер 13 м/c</a></div>
        <div class="card"><img src="https://brand.rambler.ru/uploads/png/logo_ru.png" style="height: 50px;"><br><a class="maintext">+3&deg</a><br><a class="maintext" style="font-size: 12pt">885 мм.рт.ст</a><br><a class="maintext" style="font-size: 12pt">Ветер 12 м/c</a></div>
    </div></center>
</body>
</html>
