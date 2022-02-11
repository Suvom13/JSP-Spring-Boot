<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Place</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
    <h1>Update Place</h1>
    <hr>
    <form class="form-horizontal" method="post" action="edit-place">
        <div class="form-group">
            <label class="control-label col-md-3">Name</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="name" value="${place.name}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-7">
                <input type="hidden" class="form-control" name="id" value="${place.id}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-md-3">Country</label>
            <div class="col-md-7">
                <input type="password" class="form-control" name="country" value="${place.country}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-md-3">Rating</label>
            <div class="col-md-7">
                <input type="number" class="form-control" name="rating" value="${place.rating}">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-md-3">Type</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="type" value="${place.type}">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Date Revised</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="dateRevised" value="${place.dateRevised}" readonly>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Revised By</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="revisedBy" value="${place.revisedBy}" readonly>
            </div>
        </div>

        <div class="form-group">
            <input type="submit" class="btn btn-primary col-md-7" value="Update">
        </div>
    </form>
</div>
</body>
</html>