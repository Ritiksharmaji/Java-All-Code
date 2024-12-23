<%-- 
    Document   : index
    Created on : Nov 1, 2017, 4:58:44 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Java Date Picker</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>

    </head>
    <body>
        <Pre>
        <form action="First_date_insert">
            <label for="datepicker">Enter Your Date of Birth:</label>
                <input type="text" name="dob" id="datepicker" placeholder="mm-dd-yyyy">
            
            <input type="submit" value="Submit">
        </form>
        </pre>    
    </body>
</html>