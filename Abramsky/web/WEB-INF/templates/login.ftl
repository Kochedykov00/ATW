<#include "base.ftl"/>


<#macro content>
    <form method="post">
        <table>



            <tr>
                <td> UserName :</td>
                <td><input type="text" name="username"></td>
            </tr>


            <tr>
                <td> Password :</td>
                <td><input type="password" name="password"></td>
                <td><input type="submit" name="submit" value="login"></td>
            </tr>

            <tr>
                <td><a href="http://localhost:8080/register">registration</a></td>
                <td><input type="checkbox" name="option" value="remember" checked = "false">rememberMe</td>
            </tr>

        </table>
    </form>

</#macro>

<@display_page />