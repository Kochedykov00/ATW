<#macro content></#macro>

<#macro display_page>
    <html>
    <head>
        <script type="application/javascript" src="/js/jquery-3.4.1.min.js"></script>
    </head>

    <body>

    <h1>Around the world!</h1>
    <a href="/myProfile">My Profile</a> | <a href="/discussions">Discussions</a> | <a href="/blog">My Blog</a>
    <hr/>
    <@content />
    <hr/>
    &copy; ITIS, 2019
    </body>
    </html>
</#macro>