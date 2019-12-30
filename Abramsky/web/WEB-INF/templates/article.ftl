<#include "base.ftl" />

<#macro content>

    <head>
        <title>Article</title>
    </head>

</br></br>

    <div class="container-fluid page-container">
        <div class="row">
            <div class="col-5">

                <img class="photoArticle" src="${article.getPhotoPath()!}">

                <div class="row" id="aboutArticle">
                    <div class="col-5">
                        <label for="author"></label>
                        <br /><br />
                        <label for="date"></label>
                    </div>
                    <div class="col-6">
                        <a href="/profile?id=${article.getUser_id()}" id="author" style="font-size: large">${article.getAuthor()}</a>
                        <br /><br/>
                        <h4 id="date">${article.getDate()}</h4>
                    </div>
                </div>
            </div>
            </br></br>



            <div class="col-6">
                <div align="center"><h2>${article.getTitle()}</h2></div>
                <div class="textArt text-div">
                    ${article.getText()}
                </div>
                <form method="post" class="addRating">
                <div class="row" >
                    <div class="row" style="font-size: large; margin-top: 5%;">
                        <div class="col-9">

                        </div>
                        <div class="col-3">
                            <h4 id="rating">rating ${article.getRating()}</h4>
                            <input type="submit" name="rating" class="btn btn-outline-primary" value="plus"/>
                        </div>
                    </div>


                        </div>
                    </form>

                </div>
            </div>
        </div>


        </br></br></br></br>

        <div class="row commentsCont">
            <div class="col-10">
                <div>
                    <h2>Comments :</h2>
                    <#list comments as c>
                    <div>
                        <div class="comment row">
                            <div class="col-11" style="margin-left: 5%">
                                <a href="/profile?id=${c.id_author}">${c.name_author}</a>
                                <div class="bordered text-div comment-text">
                                    <div>${c.text}</div>
                                </div>

                            </div>
                        </div>

                    </div>
                    </#list>
                </div>
            </div>
        </div>


        </br></br></br></br>
        <h3 style="margin-left: 10%">Write comment :</h3>
        <form method="post" class="addCommentsCont">
            <div class="row">
                <div class="col-8">
                    <h6 class="text-div">NickName</h6>
                    <div class="text-div">
                        <div class="form-group">
                            <textarea class="form-control" name="input" id="input" rows="2"></textarea>
                        </div>
                    </div>
                    <div style="text-align: right">
                        <input type="submit" name="submit" value="save" class="btn btn-outline-primary"/>
                    </div>
                </div>
            </div>
        </form>
    </div>
</#macro>

<@display_page />
