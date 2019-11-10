<#macro content></#macro>
<#macro display_page>
    <html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign in</title>
    <link rel="stylesheet" href="../css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="../css/styleForATW.css" type="text/css">






    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">



</head>

<body style="background-color: #d4e3fc">


<nav class="navbar navbar-expand-sm navbar-dark justify-content-end" style="background-color: #8eb0fa">
    <a class="navbar-brand text-black">Around The World</a>
    <div class="col-2 offset-8 ">
        <div class="dropdown" hidden>
            <button type="button" class="btn btn-primary dropdown-toggle top-line-btn" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Меню</button>
            <div class="dropdown-menu">
                <a class="dropdown-item" href="">Мой профиль</a>
                <a class="dropdown-item" href="">Мой блог</a>
                <a class="dropdown-item" href="">Обсуждения</a>
                <a class="dropdown-item" href="">Главная</a>
                <a class="dropdown-item" href="">Выход</a>
            </div>
        </div>
    </div>
</nav>



<@content />
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.bundle.js" type="text/javascript"></script>
<script src="../js/myJs.js" type="text/javascript"></script>

</body>





    </html>
</#macro>

