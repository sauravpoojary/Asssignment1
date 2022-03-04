<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Index</title>
    <style>
        body{
            background-color: #ffcf00;
        }
    </style>
</head>
<body>

   <div class="container">
        <h1>Assignment</h1>
        <form action="putName" method="post">
            
                <div class="mb-3">
                    <label class="form-label">Student Name</label>
                    <input type="text" class="form-control"  name="name" placeholder="Enter the name...">
                </div>
                
            
            <button>Submit</button>
        </form>
    </div>

</body>
</html>