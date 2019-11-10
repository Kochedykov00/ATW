function counting(max) {
    var count = $('#count');
    var text = $('#text');

    if (text.val().length > max) {
        text.val(text.val().substr(0, max));
        count.text(0);
    } else {
        count.text(max-text.val().length);
    }
}

function validateLogin(){
    var login = $('#login');
    var password = $('#password');
    var submit = $('#submit');
    var validLogin = $('#loginValid');
    var validPassword = $('#passwordValid');
    if (validationOfLogin(login, validLogin) && validationOfPasswordLogin(password, validPassword)) {
        submit.attr('disabled', false);
    } else {
        submit.attr('disabled', true);
    }
};



function validationOfLogin(login, validLogin) {
    if (login.val().length > 0) {
        validLogin.text("");
        return true;
    }else {
        validLogin.text("Login can't be null");
        return false;
    }
}

function validationOfPasswordLogin(password, validPassword) {
    if (password.val().length > 0) {
        validPassword.text("");
        return true;
    } else {
        validPassword.text("Password can't be null");
        return false;
    }


}

function validateRegistration(){
    var login = $('#login');
    var password = $('#password');
    var name = $('#name');
    var surname = $('#surname');
    var password2 = $('#password2');
    var email = $('#email');
    var submit = $('#submit');
    var validLogin = $('#loginValid');
    var validPassword = $('#passwordValid');
    var validName = $('#nameValid');
    var validPassword2 = $('#password2Valid');
    var validEmail = $('#emailValid');
    var validSurname = $('#surnameValid');
    if (validationOfName(name, validName) && validationOfName(surname, validSurname) && validationOfEmail(email, validEmail) && validationOfName(login, validLogin) && validationOfPassword(password, validPassword) && validationOfPassword2(password, password2, validPassword2)) {
        submit.attr('disabled', false);
    } else {
        submit.attr('disabled', true);
    }
};

function validationOfName(login, validLogin) {
    if (login.val().length > 0) {
        validLogin.text("");
        return true;
    }else {
        validLogin.text("This field can't be null");
        return false;
    }
}

function validationOfEmail(email, validEmail) {
    var pattern = /[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+/i;
    if (email.val().length == 0) {
        validEmail.text("Email can't be null");
        return false;
    } else if (pattern.test(email.val())) {
        validEmail.text("");
        return true;
    }else {
        validEmail.text("Incorrect email");
        return false;
    }
}

function validationOfPassword(password, validPassword) {
    if (password.val().length >= 6) {
        validPassword.text("");
        return true;
    } else {
        validPassword.text("The password must contain at least 6 characters");
        return false;
    }

}

function validationOfPassword2(password, password2, validPassword2) {
    if (password.val() == password2.val()) {
        validPassword2.text("");
        return true;
    } else {
        validPassword2.text("Different passwords");
        return false;
    }

}

