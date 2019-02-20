/**
 * 
 */
$(function() {
	
	$('#loginBtn').click(function(){
		var uname = $.trim($("#username").val());
	    var passwd = $.trim($("#password").val());
	    if(uname == "" || uname == null || uname == "您的用户名")
	    {
	
	        alert("用户名不能为空,请输入用户名!");
	        document.getElementById("username").focus();
	        return false;
	    }
	    if(passwd == "" || passwd == null || passwd == "登录密码")
	    {
	        alert("密码不能为空,请输入密码!");
	        $("#password").focus();
	        return false;
	    }
	
	    $("#loginForm").submit();
    })
})