<#include "base.ftl"/>

<#macro content>
    <form method="post" enctype="multipart/form-data">
    <div class="container-fluid profile-page-container">
            <div class="col-11">
                <div class="row profile">
                    <div class="col-6">
                        <div class="form-group">
                            <label>Change photo:</label>
                            <input type="file" class="photo" name="photo">
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
                                <input type="text" name="login" class="form-control" placeholder="login" id="login">
                                <br />
                                <input type="text" name="surname" class="form-control" placeholder="surname" id="surname">
                                <br />
                                <input type="text" name="name" class="form-control" placeholder="name" id="name">
                                <br />
                                <input type="text" name="aboutMe" class="form-control" placeholder="aboutMe" id="aboutMe">
                            </div>
                        </div>
                        <br />

                    </div>
                </div>
            </div>
            <div class="container" >
                <div class="col-5" style="margin-left: 37%">
                    <a class="btn btn-primary border-black mx-4 btn-lg px-15 mt-4"
                       style="background-color: rgba(58,49,148,0.91)"
                       href="" role="button" value="save">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Change&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                </div>
            </div>
    </div>
    </form>
</#macro>

<@display_page />



