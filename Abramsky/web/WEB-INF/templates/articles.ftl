<#include "base.ftl" />


<#macro content>

    <head>
        <title>Main</title>
    </head>



<body>


    <br /><br />

    <div id="bests">
        <h3 class="mb-lg-5"><img src="../photo/star.png">&nbsp;List of better article</h3>
    </div>

    <div class="col-12">
        <div class="row" id="bestRow">
            <#list articleTopRating as a>
            <div class="col-2 bestArt" >
                <div class="bestArtRow row">



                    <img src="../photo/article_photo.png" class="small-photo">
                    <div class="bestArtBody">

                        <div style="overflow: auto; max-width: 100px;">
                            <div><a class="articleHref" href="/article?id=${a.title_id}">${a.title}</a></div>
                            <div><a class="articleHref" href="/profile?id=${a.user_id}">${a.author}</a></div>
                            <div><a class="articleHref" href=""></a></div>
                            <div><h6>${a.date}</h6></div>
                        </div>

                    </div>

                </div>


            </div>
            </#list>
        </div>

        <div id="lasts">
            <h3 class="mb-lg-5"><img src="../photo/calendar.png">&nbsp;List of new articles</h3>
        </div>

        <div class="container-fluid page-container">
            <div class="row">
                <div class="col-9">
                    <#list articleTopDate as ad>
                    <div class="col-9 lastArt" >
                        <div class="lastArtRow row">

                            <img src="../photo/article_photo.png" class="small-photo1">
                            <div class="lastArtBody">
                                <div style="overflow: auto; max-width: 300px;">
                                    <div><a class="articleHref" href="/article?id=${ad.title_id}">${ad.title}</a></div>
                                    <div><a class="articleHref" href="/profile?id=${ad.user_id}">${ad.author}</a></div>
                                    <div><a class="articleHref" href="">blog</a></div>
                                    <div><h6>${ad.date}</h6></div>
                                </div>
                            </div>

                        </div>
                    </div>
                    </#list>



                </div>
            </div>
        </div>

    </div>

    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    <script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.bundle.js" type="text/javascript"></script>
    <script src="../js/myJs.js" type="text/javascript"></script>




    </body>
    </html>
</#macro>

<@display_page />