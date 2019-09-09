<%@ page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=GBK">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/jquery.qrcode.min.js"></script>

    </head>
    <body>
        <div style="width:800px;margin:50px auto;text-align:center">
            <h1>把字符串: https://www.baidu.com/ 转换为二维码</h1>
            <div id="qrcode"></div>

        </div>

        <script>
            $(function(){
                $('#qrcode').qrcode({render:'canvas',text:"https://www.baidu.com/",width:260,height:260});
            });

        </script>
    </body>
</html>