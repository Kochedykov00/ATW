<#include "base.ftl" />

<#macro content>
    <html>
    <body>

    <br /><br />
    <div class="mt-7">
        <h1 class="mb-lg-5"><img src="../photo/add_blog.png">&nbsp;&nbsp;Create blog</h1>
    </div>
    <br />
    <form name="" action="" method="post">
        <div class="container">
            <div class="row" id="inputInformation">
                <div class="col-2">
                    <label for="name">Name</label>
                    <br /><br /><br />
                    <label for="description">Description </label>
                </div>
                <div class="col-6">
                    <input class="form-control" type="text" name="name" id="name" size="50%" placeholder="name of blog"/>
                    <br /><br />
                    <textarea class="form-control" type="text" name="description" id="description" size="50%" placeholder="description"></textarea>
                </div>
            </div>
        </div>
        <br /><br />
        <div class="container" >
            <div class="col-5" style="margin-left: 37%">
                <button style="background-color: rgba(58,49,148,0.91)" value="save" type="submit" id="submit"  class="btn btn btn-primary border-black mx-4 btn-lg px-15 mt-4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Create blog&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
            </div>
        </div>
    </form>
    </body>
    </html>

</#macro>

<@display_page />