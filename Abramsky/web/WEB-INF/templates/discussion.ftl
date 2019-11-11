<#include "base.ftl" />

<#macro content>

<br/>
<div align="center"><h2>${forum.getName()}</h2></div>
<br /><br /><br/>



<div class="container-fluid page-container">
    <div class="row">
        <div class="col-5">
            <div class="row" style="margin-left: 4%;margin-top: 16%;font-size: large" >
                <div class="col-5">
                    <label for="author">Author : </label>
                    <br /><br />
                    <label for="date">Date :</label>
                </div>
                <div class="col-6">
                    <a href="/profile?id=${forum.getId_author()}" id="author" style="font-size: large">${forum.getAuthor()}</a>
                    <br /><br/>
                    <h4 id="date">${forum.getDate()}</h4>
                </div>
            </div>
        </div>

        <div class="col-6">
            <br/>
            <div class="textArt text-div">
                ${forum.getText()}
            </div>
        </div>
    </div>

    <#list comments as c>
    <div class="row commentsCont">
        <div class="col-10">
            <div>
                <h2>Messages :</h2>
                <div>
                    <div class="comment row">
                        <div class="col-11" style="margin-left: 5%">
                            <h6 class="text-div">${c.name_author}</h6>
                            <div class="bordered text-div comment-text">
                                <div>${c.text}</div>
                            </div>
                            <div >
                                <h6 style="text-align: right">10.10.2019 10:30</h6>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
        </#list>

    <h3 style="margin-left: 10%">Write message :</h3>
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