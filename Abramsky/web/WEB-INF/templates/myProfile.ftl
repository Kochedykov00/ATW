<#include "base.ftl" />

<#macro content>

    <head>
        <title>My profile</title>
    </head>

    <div class="container-fluid profile-page-container">
        <div class="col-11">
            <div class="row profile">
                <div class="col-6">
                    <#if profile.photoPath??>
                        <img src="${profile.photoPath!}" width="400"/>
                    </#if>

                    <form action="/new">
                        <button  id="editButton" type="submit" class="btn btn-outline-primary">EditProfile</button>
                    </form>
                </div>
                <div class="col-5 profileInfo">
                    <div class="row" id="infoAbout">
                        <div class="col-5">
                            <label for="login">Username: </label>
                            <br /><br />
                            <label for="surname">Lastname :</label>
                            <br /><br />
                            <label for="name">Firstname :</label>
                            <br /><br />
                            <label for="aboutMe">Aboutme :</label>
                        </div>
                        <div class="col-6">
                            <h4 id="login">${profile.getUsername()}</h4>
                            <br />
                            <h4 id="surname">${profile.getLastName()}</h4>
                            <br />
                            <h4 id="name">${profile.getFirstName()}</h4>
                            <br />

                            <#if profile.getAboutme()??>
                                <h4 id="aboutMe">${profile.getAboutme()}</h4>
                            </#if>

                        </div>
                    </div>
                    <br />
                    <div class="row" style="font-size: 19px;font-weight: 700;">
                        <div class="col-5">
                            <label for="blog">Blog :</label>
                        </div>

                        <#if blog??>
                        <div class="col-6">
                            <div class="row">
                                <h4 id="blog">${blog.getName()}</h4>
                                <form style="margin-left: 20%" action="/myBlog" >
                                    &nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-outline-primary">go over</button>
                                </form>
                            </div>
                        </div>
                            </#if>

                    </div>

                </div>
            </div>
        </div>
    </div>


    </body>
</#macro>

<@display_page />