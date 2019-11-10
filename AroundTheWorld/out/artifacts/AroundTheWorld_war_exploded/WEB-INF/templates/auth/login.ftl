<#include "base.ftl"/>


<#macro content>
    <form action="LoginRegister" method="post">
        <div>
            Username: <input name="username" type="username">
        </div>
        <div>
            Password: <input name="password" type="password">
        </div>
        <input type="submit">
    </form>

</#macro>

<@display_page />