<!DOCTYPE html>
<html>
<head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
    <title>User Input Form</title>
</head>

<body>
<h2>User Input Form</h2>
<form method="get" action="evaluate">
    <fieldset>
        <legend>Enter the expression to evaluate</legend>
        <textarea rows="5" cols="30" name="expression"></textarea>
    </fieldset>

    <input type="submit" value="EVALUATE" />
    <input type="reset" value="CLEAR" />
</form>
</body>
</html>
