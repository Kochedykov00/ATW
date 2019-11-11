<#include "base.ftl" />

<#macro content>

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



            <div class="col-6">
                <div align="center"><h2>${article.getTitle()}</h2></div>
                <div class="textArt text-div">
                    ${article.getText()}
                </div>
                <div class="row" >
                    <div class="row" style="font-size: large; margin-top: 5%;">
                        <div class="col-9">
                            <label for="rating">Rating : ${article.getRating()} </label>
                        </div>
                        <div class="col-3">
                            <h4 id="rating"></h4>
                        </div>
                    </div>
                    <form method="post" style="margin-top: 4%;margin-left: 40%">
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck1" value="save">
                            <label class="custom-control-label" for="customCheck1">+</label>
                        </div>
                    </form>
                </div>
            </div>
        </div>


            <#list comments as c>
        <div class="row commentsCont">
            <div class="col-10">
                <div>
                    <h2>Comments :</h2>
                    <div>
                        <div class="comment row">
                            <div class="col-11" style="margin-left: 5%">
                                <h6 class="text-div">${c.name_author}</h6>
                                <div class="bordered text-div comment-text">
                                    <div>${c.text}</div>
                                </div>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
                </#list>


        <h3 style="margin-left: 10%">Write comment :</h3>
        <form method="post" class="addCommentsCont">
            <div class="row">
                <div class="col-8">
                    <h6 class="text-div">NickName</h6>
                    <div class="text-div">
                        <div class="form-group">
                            <textarea class="form-control" id="input" rows="2"></textarea>
                        </div>
                    </div>
                    <div style="text-align: right">
                        <button type="submit" value="save" class="btn btn-outline-primary">Send</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</#macro>

<@display_page />
