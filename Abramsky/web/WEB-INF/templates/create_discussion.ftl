<#include "base.ftl" />

<#macro content>

    <form method="post">

        <h1>Create discussion</h1>

        <table>



            <tr>
                <td> Name of Discussion </td>
                <td><input type="text" name="name"></td>
            </tr>


            <tr>
                <td> Description </td>
                <td><input type="text" name="text" width="200px" height="200px"></td>
                <td><input type="submit" name="create" value="save"></td>
            </tr>



        </table>
    </form>

</#macro>

<@display_page />