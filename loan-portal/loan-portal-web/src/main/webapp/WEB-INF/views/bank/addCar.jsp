<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="icon" href="<%=path %>/images/logo.jpg" type="image/x-icon"/>
    <title>此地有银</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
    <!-- <link rel="stylesheet/less" type="text/css" href="css/style.less" /> -->
    <script type="text/javascript" src="<%=path %>/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/all.js"></script>
    <!--[if IE 6]>
    <script src="./js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input,span, p');
    </script>
    <![endif]-->
</head>
<body>
<!-- header start -->
<div class="zxcf_top_wper">
    <div class="zxcf_top px1000 clearfix">
        <div class="zxcf_top_l fl">
            <img src="<%=path %>/images/zxcf_phone.png" alt="">
            400-027-0101(工作时间9:00-17:30)
            <a href="#"><img src="<%=path %>/images/zxcf_weixin.png" alt=""></a>
            <a href="#"><img src="<%=path %>/images/zxcf_sina.png" alt=""></a>
            <a href="#"><img src="<%=path %>/images/zxcf_qq.png" alt=""></a>
        </div>
        <div class="zxcf_top_r fr">
            <a href="<%=path %>/login" class="curspan">立即登录</a>
            <span>|</span>
            <a href="<%=path %>/register">免费注册</a>
            <%--<span>|</span>
            <a href="<%=path %>/problem">常见问题</a>--%>
            <span>|</span>
            <img src="<%=path %>/images/lg_pic01.png" alt="">
            <a href="<%=path %>/index1">返回首页</a>
        </div>
    </div>
</div>
<!-- end top -->
<div class="zxcf_nav_wper">
    <div class="zxcf_nav clearfix px1000">
        <div class="zxcf_nav_l fl"><img src="<%=path %>/images/zxcf_logo.png" alt=""></div>
        <%--<div class="zxcf_nav_r fr">
                <img src="<%=path %>/images/bank1.png" alt="">
                <span><a href="<%=path%>/index1">返回首页</a></span>
        </div>--%>
    </div>
</div>
<!-- end  -->
<div class="reg_con_wper">
    <div class="reg_con px1000">
        <div class="reg_box clearfix">
                <div class="reg_box_l fl">
                <img src="<%=path %>/images/bank1.png" alt="">
            </div>
            <div class="reg_box_r fl">
                <h2 class="lg_sec_tit clearfix">
                    <span class="fl" style="color: #ae291f;">添加银行卡</span>
                    <%--<em class="fr">没有帐号，<a href="<%=path%>/login">立即登录</a></em>--%>
                </h2>
                <form>
                    <fieldset>
                        <p class="mt20">
                            <input type="text" placeholder="用户名/手机" id="username" class="lg_input01 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="password" placeholder="密码" id="userpwd" class="lg_input02 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="password" placeholder="密码确认" id="userpwd2" class="lg_input02 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="text" placeholder="手机号" id="phone" class="lg_input03 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="text" placeholder="年龄" id="age" class="lg_input01 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="text" placeholder="邮箱" id="email" class="lg_input05 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            <input type="text" placeholder="真实姓名" id="realname" class="lg_input01 lg_input" onfocus="clearErro();">
                        </p>

                        <p class="mt20">
                            <input type="text" placeholder="身份证号" id="idnumber" class="lg_input01 lg_input" onfocus="clearErro();">
                        </p>
                        <p class="mt20">
                            性别:
                            <select id="sex">
                                <option value="1">男</option>
                                <option value="2">女</option>
                            </select>
                        </p>
                        <%--<p class="mt20 yanzheng">
                                      <input type="text" placeholder="验证码" id="yzm" class="lg_input04 lg_input" onfocus="clearErro();">
                                      <input type="button" id="hsbtn" value="免费获取验证码" onclick="time(hsbtn)" style="width: 120px; height: 35px;text-align:center" class="lg_btn" />
                                 </p>--%>
                        <p class="pt10"><span id="erro"></span></p>
                        <p class="mt20"><a href="javascript:void(0)" class="lg_btn" onclick="checkRegister();" >立即注册</a></p>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- footer start -->
<div class="zscf_aboutus_wper">
    <div class="zscf_aboutus px1000 clearfix">
        <div class="zscf_aboutus_l fl">
            <ul class="zscf_aboutus_lul clearfix">
                <li class="pt10"><a href="#"><img src="<%=path %>/images/app.png" alt=""></a>
                </li>
                <li>
                    <p class="pb20">服务热线</p>
                    <strong>400-027-0101</strong>
                </li>
                <li>
                    <p class="pb10 linkpic">
                        <a href="#"><img src="<%=path %>/images/ft_sina.png" alt=""></a>
                        <a href="#"><img src="<%=path %>/images/ft_weixin.png" alt=""></a>
                        <a href="#"><img src="<%=path %>/images/ft_erji.png" alt=""></a>
                    </p>
                    <p><a href="#">kefu@zhongxincaifu.com</a></p>
                </li>
            </ul>
        </div>
        <!-- end left -->
        <div class="zscf_aboutus_r fl clearfix">
            <a href="#" class="fl ft_ewm"><img src="<%=path %>/images/ft_erweima.png" alt=""></a>
            <ul class="fl clearfix">
                <li><a href="#">联系我们</a></li>
                <li><a href="#">我要融资</a></li>
                <li><a href="problem.html">帮助中心</a></li>
                <li><a href="#">友情链接</a></li>
                <li><a href="#">招贤纳士</a></li>
                <li><a href="#">收益计算器</a></li>
            </ul>
        </div>
        <!-- end right -->

    </div>
</div>

<div class="zscf_bottom_wper">
    <div class="zscf_bottom px1000 clearfix">
        <p class="fl">© 2014 zhongxincaifu &nbsp;  &nbsp;&nbsp;   中兴财富金融信息服务股份有限公司 &nbsp;&nbsp;&nbsp;    来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
        <p class="fr">
            <a href="#"><img src="<%=path %>/images/360.png" alt=""></a>
            <a href="#"><img src="<%=path %>/images/kexin.png" alt=""></a>
            <a href="#"><img src="<%=path %>/images/norton.png" alt=""></a>
        </p>
    </div>
</div>
<!-- footer end -->
</body>

<script type="text/javascript">

    var wait = 60;
    function time(btn) {
        var phone = document.getElementById('phone').value;
        if(phone==null || phone=="" ){
            $("#erro").html("*请输入手机号码");
            return false;
        }else if(!(/^1[34578]\d{9}$/.test(phone))){
            $("#erro").html("*手机号码有误，请重填");
            return false;
        }else{
            if (wait == 60) {
                btn.value = "免费获取验证码";
                var phone = $("#phone").val();
                phone = $.trim(phone);
                $.post("<%=path%>/register/verification",{'phone':phone},function(index){
                },"json")
                btn.removeAttribute("disabled");
            }else if(wait == 0){
                dj(btn);
            }
            btn.setAttribute("disabled", true);
            btn.value = wait + "秒后重新获取验证码";
            wait--;
            setTimeout(function () {
                if(wait==0){
                    dj(btn);
                    clearTimeout();
                }else{
                    time(btn);
                }
            },1000)

        }

    }
    function dj(btn){
        btn.value = "免费获取验证码";
        btn.removeAttribute("disabled");
        wait = 60;
    }

    function checkRegister(){
        var sex = $("#sex").val();

        var username=$("#username").val();
        var userpwd=$("#userpwd").val();
        var userpwd2=$("#userpwd2").val();
        var phone=$("#phone").val();var patrn=/^\d{8,11}$/;
        var yzm=$("#yzm").val();
        var realname=$("#realname").val();
        var age=$("#age").val();
        var email=$("#email").val();
        var idnumber=$("#idnumber").val();
        var patrn1 = /^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$/g;
        var patrn2 = /^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i;

        if(username == ""){
            $("#erro").html("*请输入用户名");
            return false;
        }else if(username.length < 2){
            $("#erro").html("*用户名不小于2位");
            return false;
        }else if(userpwd == ""){
            $("#erro").html("*请输入用户密码");
            return false;
        }else if(userpwd.length < 4){
            $("#erro").html("*用户名密码不小于4位");
            return false;
        }else if(userpwd2 == ""){
            $("#erro").html("*请再次输入用户密码");
            return false;
        }else if(userpwd2.length < 4){
            $("#erro").html("*用户名密码不小于4位");
            return false;
        }else if(userpwd!=userpwd2){
            $("#erro").html("*输入的密码不一致");
            return false;
        }else if(phone==""){
            $("#erro").html("*请输入手机号码");
            return false;
        }else if(!patrn.test(phone)){
            $("#erro").html("*请输入正确的手机格式");
            return false;
        }else if(age==""|| age==null) {
            $("#erro").html("*请输入年龄");
        }
        else if(age==0||age>=150) {
            $("#erro").html("*年龄范围是0~150");
        }else if(email==""){
            $("#erro").html("*请输入邮箱");
            return false;
        }else if(!patrn1.test(email)){
            $("#erro").html("*请输入正确邮箱格式");
            return false;
        }else if(realname==""||realname==null){
            $("#erro").html("*请输入真实姓名");
            return false;
        }
        else if(idnumber==""){
            $("#erro").html("*请输入身份证号");
            return false;
        }else if(!patrn2.test(idnumber)){
            $("#erro").html("*请输入正确身份证号");
            return false;
        }else{
            $.post("register/userregister",{'username':username,'userpwd':userpwd,'phone':phone,
                'realname':realname,'email':email,'idnumber':idnumber,'age':age,'sex':sex},function(index){
                if(index == "1"){
                    alert("注册成功！")
                    window.location.href="<%=path%>/login";
                }else{
                    $("#erro").html("注册失败");
                }
            },"json");
        }
    }

    function clearErro(){
        $("#erro").html("");
    }
</script>
</html>