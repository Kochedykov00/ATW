<#include "base.ftl"/>


<#macro content>
    <form method="post">
        <div>
            Name: <input name="name" type="name">
        </div>

        <div>
            Username: <input name="username" type="username">
        </div>
        <div>
            Password: <input name="password1" type="password">
        </div>

        <div>
            Retype Password: <input name="password2" type="password">
        </div>

        <input type="submit">
    </form>
</#macro>

<@display_page />