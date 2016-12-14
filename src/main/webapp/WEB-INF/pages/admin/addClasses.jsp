<%--
  Created by IntelliJ IDEA.
  User: Eayon
  Date: 16/12/13
  Time: 下午6:46
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
    <title>学生信息管理系统 - 添加班级</title>

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
    <h1>学生信息管理系统 - 添加班级</h1>
    <hr/>
    <form:form action="/admin/Classes/addP" method="post" commandName="Class" role="form">
        <div class="form-group">
            <label for="classId">班号:</label>
            <input type="text" class="form-control" id="classId" name="classId" placeholder="Enter ClassId:"/>
        </div>
        <div class="form-group">
            <label for="className">班级名:</label>
            <input type="text" class="form-control" id="className" name="className" placeholder="Enter ClassName:"/>
        </div>
        <div class="form-group">
            <label for="grade">年级:</label>
            <input type="text" class="form-control" id="grade" name="grade" placeholder="Enter Grade:"/>
        </div>
        <div class="form-group">
            <label for="sumStu">学生总数:</label>
            <input type="date" class="form-control" id="sumStu" name="sumStu" placeholder="Enter Sum of Students:"/>
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