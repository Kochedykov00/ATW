<#include "base.ftl"/>
<#macro content></#macro>
<#macro display_page>


    <form method="post">

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/styleForATW.css">
        <script src="../js/myJs.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/jquery-3.4.1.min.js"></script>
        <script src="../js/bootstrap.bundle.js"></script>

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
    <div class="mt-7">
        <h1 class="mb-lg-5"><img src="../photo/iconadd.png"> Sign up</h1>
    </div>
    <form name="registration" action="" method="post">
        <div class="container">
            <div class="row" id="inputInformation">
                <div class="col-2">
                    <label for="surname">Last name </label>
                    <br /><br />
                    <label for="name">First name </label>
                    <br /><br />
                    <label for="email">Email </label>
                    <br /><br />
                    <label for="login">Login</label>
                    <br /><br />
                    <label for="password">Password </label>
                    <br /><br />
                    <label for="password2">Repeat password </label>
                </div>
                <div class="col-6">
                    <input oninput="validateRegistration()" type="text" aria-label="Last name" id="surname" class="form-control" placeholder="lastname" name="lastname">
                    </small><small id="surnameValid" class="form-text validation"></small>
                    <br />
                    <input oninput="validateRegistration()" type="text" aria-label="First name" id="name" class="form-control" placeholder="firstname" name="firstname">
                    <small id="nameValid" class="form-text validation"></small>
                    <br />
                    <input oninput="validateRegistration()" type="text" aria-label="Email" id ="email" class="form-control" placeholder="Email" name="email">
                    <small id="emailValid" class="form-text validation"></small>
                    <br />
                    <input oninput="validateRegistration()" class="form-control" type="text" name="username" id="login" size="50%" placeholder="username"/>
                    <small id="loginValid" class="form-text validation"></small>
                    <br />
                    <input oninput="validateRegistration()" class="form-control" type="password" name="password" id="password" size="50%" placeholder="password"/>
                    <small id="passwordValid" class="form-text validation"></small>
                    <br />
                    <input oninput="validateRegistration()" class="form-control" type="password" name="password2" id="password2" size="50%" placeholder="repeat password"/>
                    <small id="password2Valid" class="form-text validation"></small>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-6" align="right">
                    <button style="background-color: rgba(59,72,148,0.91)" value="save" type="submit" id="submit" disabled="true" class="btn btn btn-primary border-black mx-4 btn-lg px-15 mt-4">&nbsp;&nbsp;&nbsp;Sign up&nbsp;&nbsp;&nbsp;</button>
                </div>
                <div class="col-5" align="left">
                    <a class="btn btn-primary border-black mx-4 btn-lg px-15 mt-4"
                       style="background-color: rgba(58,49,148,0.91)"
                       href="/login" role="button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sign in&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                </div>
            </div>
        </div>
    </form>
    </div>
    </body>
    </html>

</#macro>

<@display_page />