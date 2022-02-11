<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Place</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
</head>
<body>
    <div class="container" id="tasksDiv">
        <h1>All Places</h1>
        <hr>
        <form class="form-horizontal" method="post" action="backToAdd">
            <div class="form-group">
                <input type="submit" class="btn btn-dark col-md-2" value="Add Place">
            </div>
        </form>
        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead>
                <tr>
                <th>Name</th>
                <th>Country</th>
                <th>Rating</th>
                <th>Type</th>
                    <th>Action</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="place" items="${places}">
                    <tr>
                        <td>${place.name}</td>
                        <td>${place.country}</td>
                        <td>${place.rating}</td>
                        <td>${place.type}</td>
                        <td><a href="/update-place?id=${place.id}"><input type="submit" class="btn btn-primary col-md-5" value="Update"></a></td>
                        <td><a href="/delete-place?id=${place.id}"><input type="submit" class="btn btn-danger col-md-5" value="Delete"></a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>