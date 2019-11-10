<#include "base.ftl" />

<#macro content>
    <table border="1">
        <tr>
            ${blog_content.getName()}
        </tr>
        <tr>
            ${blog_content.getDescription()} </tr>

        <#list articles as a>
            <tr>
                <td>#${a.title}</td>
                <td>${a.text}</td>
                <td><#if a.photoPath??>
                    <img src="${a.photoPath!}" width="200"/> </td>
                </#if>

            </tr>
        </#list>
    </table>

    </table>
</#macro>

<@display_page />