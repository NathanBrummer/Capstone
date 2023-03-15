const form = document.getElementById('form')
const fname = document.getElementById('fname')
const lname = document.getElementById('lname')
const email = document.getElementById('email')
const password = document.getElementById('password')
const confirm_password = document.getElementById('confirm_password')

function ValidateEmail(inputText)
{
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(inputText.value.match(mailformat)) {
}
else {
return false;
}
}



form.addEventListener('submit', e => {
    let messages = []
    if (fname.value === '' || fname.value == null) {
        messages.push('First name is required')
    }
    if (fname.value.length >=20) {
        messages.push('First name max 20 characters')
    }
    if (lname.value === '' || fname.value == null) {
        messages.push('Last name is required')
    }
    if (lname.value.length >=20) {
        messages.push('Last name max 20 characters')
    }
    if (email.value === '' || email.value == null) {
        messages.push('Email address is required')
    }
    if (ValidateEmail(email) == false) {
        messages.push('Enter a valid email address')
    }
    if (password.value === '' || password.value == null) {
        messages.push('Password is required')
    }
    if (password.value.length >=20) {
        messages.push('Password max 20 characters')
    }
    if (password.value.length <=8) {
        messages.push('Password minimum 8 characters')
    }
    if (confirm_password.value !== password.value) {
        messages.push('Passwords must match')
    }
    if (messages.length > 0) {
        e.preventDefault()
        alert(messages.join('\n'))
    }
    if (messages.length == 0) {
        alert('Application Submitted')
    }
})