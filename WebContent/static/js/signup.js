/**
 * Created by zengzequn on 4/12/16.
 */
function isValidPhone() {
    /* The length of phone is 13 and no alphabet*/
    var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;

    var item = document.getElementById("phoneInput").value;

    if(!myreg.test(item))
    {
        document.getElementById("PhoneInfor").innerHTML="请输入有效的手机号码!";
    }
    else{
        document.getElementById("PhoneInfor").innerHTML="有效的手机号码！";
    }
}
function isValidPassword() {

    var pwd= document.getElementById("passwordInput").value;
    // at least one number, one lowercase and one uppercase letter
    // at least six characters
    var re = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
    if (re.test(pwd)) {
        document.getElementById('PasswordInfor').innerHTML = "输入正确";
        document.getElementById('PasswordInfor').style.color = "green";
    }
    else {
        document.getElementById('PasswordInfor').innerHTML = "请输入不少于6位，且包含一个大写字母"
        document.getElementById('PasswordInfor').style.color = "red";
    }
}

function cleanSpace(id) {
    var item= document.getElementById(id);
    item.innerHTML=" ";
}