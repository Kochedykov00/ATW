<#include "base.ftl"/>

<#macro content>
<head>
    <title>Edit</title>
</head>


    <form method="post" enctype="multipart/form-data">
    <div class="container-fluid profile-page-container">
            <div class="col-11">
                <div class="row profile">
                    <div class="col-6">

                        <div class="form-group">
                            <#if user.getPhotoPath()??>
                            <img src="${user.getPhotoPath()!}" width="400"/>
                                </#if>


                           <input type="file" class="photo" name="photo" value="${user.getPhotoPath()!}">
                        </div>
                    </div>
                    <div class="col-5 profileInfo">
                        <div class="row" id="infoAbout">
                            <div class="col-5">
                                <label for="login">Login : </label>
                                <br /><br />
                                <label for="surname">Lastname :</label>
                                <br /><br />
                                <label for="name">Firstname :</label>
                                <br /><br />
                                <label for="aboutMe">About Me :</label>
                            </div>
                            <div class="col-6">
                                <input type="text" name="login" value="${user.getUsername()}" class="form-control" placeholder="login" id="login">
                                <br />
                                <input type="text" value = "${user.getLastName()}" name="surname" class="form-control" placeholder="surname" id="surname">
                                <br />
                                <input type="text"  value = "${user.getUsername()}"  name="name" class="form-control" placeholder="name" id="name">
                                <br />
                                <#if user.getAboutme()??>
                                <input type="text" value="${user.getAboutme()}" name="aboutMe" class="form-control" placeholder="aboutMe" id="aboutMe">
                                    <#else >
                                        <input type="text"  name="aboutMe" class="form-control" placeholder="aboutMe" id="aboutMe">
                                    </#if >

                            </div>
                        </div>
                        <br />

                    </div>
                </div>
            </div>
            <div class="container" >
                <div class="col-5" style="margin-left: 37%">
                    <button  style="background-color: rgba(58,49,148,0.91)" value="save" type="submit" name="submit" id="submit"  class="btn btn btn-primary border-black mx-4 btn-lg px-15 mt-4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Change&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
                </div>
            </div>
    </div>
    </form>
</#macro>

<@display_page />



