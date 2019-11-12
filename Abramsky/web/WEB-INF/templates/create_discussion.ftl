<#include "base.ftl" />

<#macro content>

    <head>
        <title>Create discussion</title>
    </head>

    </br> </br>

    <div class="mt-7">
        <h1 class="mb-lg-5"><img src="../photo/add_discussion.png">&nbsp;&nbsp;Create discussion</h1>
    </div>

    <div class="container-fluid ">
        <form method="post">
            <div class="col-11">
                <div >
                    <div class="row" id="infoAbout" style="margin-left: 30%; margin-top: 5%">
                        <div class="col-2">
                            <label for="name">Name : </label>
                            <br /><br/>
                            <label for="text">Text:</label>
                        </div>
                        <div class="col-5">
                            <input type="text" name="name" class="form-control" placeholder="name" id="name">
                            <br />
                            <div class="form-group">
                                <textarea name="text" id="text" class="form-control" rows="5"></textarea>
                            </div>
                        </div>
                    </div>
                    <br />

                </div>
            </div>
            <div class="container" >
                <div class="col-5" style="margin-left: 37%">
                    <button style="background-color: rgba(58,49,148,0.91)" value="save" type="submit" id="submit"  class="btn btn btn-primary border-black mx-4 btn-lg px-15 mt-4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Create&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>

                </div>
            </div>
        </form>
    </div>
</#macro>

<@display_page />