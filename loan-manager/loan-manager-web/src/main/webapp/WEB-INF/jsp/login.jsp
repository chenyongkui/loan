<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<body style="background:url(${pageContext.request.contextPath}/images/bglogin.jpg) ">
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>

<script type="text/javascript">

    //验证用户名和密码
    $(function() {
        $("#roleForm").submit(function(e) {

            var un = $("#un").val();
            var pw = $("#pw").val();

            var flag1 = false;
            var flag2 = false;

            if(un==null||un=="") {
                //提示用户名不能为空
                $("#sp1").html("用户名不能为空");
            }else {
                $("#sp1").html("");
                flag1 = true;
            }

            if(pw==null||pw=="") {
                //提示密码不能为空
                $("#sp2").html("密码不能为空");
            }else {
                $("#sp2").html("");
                flag2 = true;
            }

            //阻止表单提交
            e.preventDefault();

            //进行ajax提交'
            if(flag1&&flag2){

                var role = {'rolename':un,'rpassword':pw};
                $.ajax({

                    url:"login",
                    type:"post",
                    data:role,
                    dataType:"text",
                    success:function(rec){
                        //1允许登录,2,用业户名或密码错误,3,用户名或密码为空
                        //允许登录
                        if(rec==1){
                            location.href="../cdyy/index";
                        }else if(rec==2){
                            $("#sp1").html("用户或密码错误");
                        }else{
                            $("#sp1").html("用户或密码不能为空");
                        }

                    },
                    error:function(){
                        alert("error");
                    }

                });

            }

        });


    })




</script>
<div >
    <form action="cdyy/index" method="post" id="roleForm">

        <table style="margin: 0 auto;margin-top: 250px" >
            <tr><td><h1>此地有银后台管理</h1></td></tr>
            <tr>
            <td>RoleName:<input type="text" name="rolename" id="un"/>
            <span id="sp1" style="color: red" ></span><br>
            Rpassword:<input type="text" name="rpassword" id="pw"/>
            <span id="sp2"  style="color: red" ></span><br>

            <input type="submit" id="submit"></td></tr>
        </table>
    </form>
</div>

</body>
</html>
