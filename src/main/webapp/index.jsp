<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Caesar Cipher</title>
    <style>
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body class="bg-dark">
    <div class="text-secondary px-4 py-5 text-center">
        <div class="py-5">
            <h1 class="display-5 fw-bold text-white">Encrypt messages using the Caesar Cipher.</h1>
            <div class="col-lg-6 mx-auto">
                <p class="fs-5 mb-4">Also known as the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. The method is named after Julius Caesar, who used it in his private correspondence.</p>
                <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
                    <form action="encrypt">
                        <textarea id="message" name="message" rows="5" cols="50" placeholder="Enter message"></textarea>
                        <br/>
                        <br/>
                        <input id="key" name="key" type="text" placeholder="Enter encryption key"/>
                        <br/>
                        <br/>
                        <button type="submit" class="btn btn-outline-info btn-lg px-4 me-sm-3 fw-bold">Encrypt</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <p class="text-secondary">You can also <a href="decrypt.jsp">decrypt a message</a>.</p>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous">
    </script>
</body>
</html>