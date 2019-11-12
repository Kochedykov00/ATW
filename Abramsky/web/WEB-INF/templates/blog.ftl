<#include "base.ftl" />

<#macro content>

    <head>
        <title>My blog</title>
    </head>

    <#if blog??>
    <div id="nameOfBlog">
        <h1 class="mb-lg-5">${blog.getName()}</h1>
    </div>

    <#list article as a>

    <div class="container-fluid page-container">
        <div class="row">
            <div class="col-9">


                <div class="col-9 lastArt" >
                    <div class="lastArtRow row">
                        <img src="../photo/article_photo.png" class="small-photo1">
                        <div class="lastArtBody">
                            <div style="overflow: auto; max-width: 300px;">
                                <div><a class="articleHref1" href="/article?id=${a.title_id}">${a.title}</a></div>
                                <br/><br/>
                                <div><h6><a class="articleHref1" href="/profile?id=${a.user_id}">${a.author}</a></h6></div>
                            </div>
                        </div>
                    </div>
                </div>




            </div>
        </div>
    </div>

    </#list>
    <div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-primary border-black  btn-lg px-15 "
           style="background-color: rgba(59,72,148,0.91); margin-left: 40%;"
           href="/create_article" role="button" >&nbsp;&nbsp;&nbsp;Create article&nbsp;&nbsp;&nbsp;</a>
    </div>
        <#else >
            <div>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-primary border-black  btn-lg px-15 "
                                                                               style="background-color: rgba(59,72,148,0.91); margin-left: 40%;"
                                                                               href="/create_blog" role="button" >&nbsp;&nbsp;&nbsp;Create blog&nbsp;&nbsp;&nbsp;</a>
            </div>
    </#if>

</#macro>

<@display_page />