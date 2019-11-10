<#include "base.ftl" />

<#macro content>
    <div class="container-fluid profile-page-container">
        <div class="col-11">
            <div class="row profile">
                <div class="col-6">
                    <img src="../photo/user.png" class="photo">
                    <form action="/new?id=${profile.getId()}">
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
                        <div class="col-6">
                            <div class="row">
                                <h4 id="blog">ProgerBlog</h4>
                                <form style="margin-left: 20%" action="blog.html" >
                                    <button type="submit" class="btn btn-outline-primary">go over</button>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>


    </body>
</#macro>

<@display_page />