<%--
  Created by IntelliJ IDEA.
  User: Eayon
  Date: 16/12/13
  Time: 下午3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>学生信息管理系统 - 添加学生</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>学生信息管理系统 - 添加学生</h1>
    <hr/>
    <form:form action="/admin/Students/addP" method="post" commandName="StuInfo" role="form">
        <div class="form-group">
            <label for="studentId">学号:</label>
            <input type="text" class="form-control" id="studentId" name="studentId" placeholder="Enter StudentId:"/>
        </div>
        <div class="form-group">
            <label for="studentName">姓名:</label>
            <input type="text" class="form-control" id="studentName" name="studentName" placeholder="Enter StudentName:"/>
        </div>
        <div class="form-group">
            <label for="sex">性别:</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="Enter Sex:"/>
        </div>
        <div class="form-group">
            <label for="birthdate">出生日期:</label>
            <input type="date" class="form-control" id="birthdate" name="birthdate" placeholder="Enter Birthdate:"/>
        </div>
        <div class="form-group">
            <label for="nation">国籍:</label>
            <input type="text" class="form-control" id="nation" name="nation" placeholder="Enter Nation:"/>
        </div>
        <div class="form-group">
            <label for="homeAddress">家庭住址:</label>
            <input type="text" class="form-control" id="homeAddress" name="homeAddress" placeholder="Enter Home Address:"/>
        </div>
        <div class="form-group">
            <label for="politic">政治面貌:</label>
            <input type="text" class="form-control" id="politic" name="politic" placeholder="Enter Politic:"/>
        </div>
        <div class="form-group">
            <label for="classByClassId.classId">班级:</label>
            <select class="form-control" id="classByClassId.classId" name="classByClassId.classId">
                <c:forEach items="${ClassList}" var="classes">
                    <option value="${classes.classId}">${classes.classId},
                        ${classes.className}, ${classes.grade}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>