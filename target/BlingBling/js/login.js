$(function(){
    $("#button").click(function(){
        var username=$("#username");
        var password=$("#password");
        if (username.val()==""){
            username.focus();
            username.css("border","1px solid red");
            return false;
        }
        if (password.val()==""){
            password.focus();
            return false;
        }
        $.ajax({
            url:"http://localhost:8080/staff/login.do",type:"POST",data:"username="+username.val()+"&password="+password.val(),
            success:function (data) {
                alert("su");
                    $("#reflect").html("Success");
            },
            error:function(er){
                alert("error");
            }
        })
    })
})