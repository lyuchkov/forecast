<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Самый точный проноз погоды</title>
    <style>
    <%@include file="/WEB-INF/pages/style.css"%>
</style>
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro&display=swap" rel="stylesheet">
</head>
<body>
<center>
    <div id="main">
        <div class="card"><img src="https://lh3.googleusercontent.com/A3AoMqSCIuDqhGywYXSY1P7PRS8AlSKxDi6a7JnznGSwLEFk8aHGn8AtVqnw2hL6TL0" style="height: 50px;"><br><a class="maintext">${yandexTemp}</a><br><a class="maintext" style="font-size: 12pt">${yandexBar}</a><br><a class="maintext" style="font-size: 12pt">${yandexWind}</a></div>
        <div class="card"><img src="http://cs5-2.4pda.to/8094136.png" style="height: 50px;"><br><a class="maintext">${gisTemp}&deg</a><br><a class="maintext" style="font-size: 12pt">${gisBar}</a><br><a class="maintext" style="font-size: 12pt">${gisWind}м/c</a></div>
    </div></center>
</body>
</html>
