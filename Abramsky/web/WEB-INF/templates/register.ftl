<#include "base.ftl"/>


<#macro content>

    <form method="post">
        <div>
            Name: <input name="name" type="text">
        </div>

        <div>
            Username: <input name="username" type="text">
        </div>
        <div>
            Password: <input name="password" type="password">
        </div>

        <div>
            Retype Password: <input name="password1" type="password">
        </div>

        <input type="submit" name="registration" value="registration">
    </form>
</#macro>

<@display_page />