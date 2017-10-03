<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>Hello, world!</h1>
<div class="container center">
    <div class="row">
        <div class="col-sm-4">

        </div>
        <div class="col-sm-4">
            <div class="well well-lg">
                <h3>SignUp</h3>
            </div>
            <form:form action="/signup" method="post" modelAttribute="userLogin">
                <div class="form-group">
                    <label for="email">Email address:</label>
                    <form:input type="email" class="form-control"  path="email" id="email"/>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <form:input type="password" class="form-control" path="password" id="password" />
                </div>
                <div class="form-group">
                    <label for="pwdConfirm">Confirm Password:</label>
                    <input type="password" class="form-control" id="pwdConfirm"/>
                </div>
                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</input></label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form:form>
        </div>
        <div class="col-sm-4">

        </div>
    </div>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>