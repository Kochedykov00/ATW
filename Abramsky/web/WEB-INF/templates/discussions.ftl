<#include "base.ftl" />

<#macro content>

    <head>
        <title>Discussions</title>
    </head>


    <html>
    <body>

    <br /><br />

    <div id="nameOfBlog">
        <h1 class="mb-lg-5">List of discussion</h1>
    </div>



    <div class="container-fluid page-container">
        <#list discussions as d>
        <div class="row">
            <div class="col-9">

                <div class="col-9 list" >
                    <div class="listRow ">
                        <div class="lastArtBody">

                            <div class="row" style="overflow: auto; max-width: 600px;">
                                <div><a class="articleHref1" href="/profile?id=${d.id_author}">${d.author}</a></div>
                                <div><a style="margin-left: 42%" class="articleHref1" href="/discussion?id=${d.id}" >${d.name}</a></div>



                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        </#list>
    </div>



    </br></br></br></br></br></br></br></br></br>

    <div>
        <a class="btn btn-primary border-black  btn-lg px-15 "
           style="background-color: rgba(59,72,148,0.91); margin-left: 40%;"
           href="/create_discussion" role="button" >&nbsp;&nbsp;&nbsp;Create discussion&nbsp;&nbsp;&nbsp;</a>
    </div>

    </div>

    </body>
    </html>

</#macro>

<@display_page />