<#include "base.ftl" />

<#macro content>

    <head>
        <title>Blog</title>
    </head>


<br /><br />
    <#if blog??>

<div id="nameOfBlog">

    <h1 class="mb-lg-5">${blog.getName()}</h1>

</div>
    </#if>

    <#if article??>

    <#list article as a>

<div class="container-fluid page-container">
    <div class="row">
        <div class="col-9">


            <div class="col-9 lastArt" >
                <div class="lastArtRow row">
                    <img src="../photo/article_photo.png" class="small-photo1">
                    <div class="lastArtBody">
                        <div style="overflow: auto; max-width: 300px;">
                            <div><a class="articleHref1" href="/article?id=${a.user_id}">${a.title}</a></div>
                            <div><a class="articleHref1" href="/profile?id=${a.user_id}">${a.author}</a></div>
                            <br/>
                            <div><h6>${a.date}</h6></div>
                        </div>
                    </div>
                </div>
            </div>



        </div>
    </div>
</div>
    </#list>
        </#if>




</#macro>

<@display_page />