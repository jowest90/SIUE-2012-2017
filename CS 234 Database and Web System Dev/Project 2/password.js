/* 
* Author:      John West
* File Name:   Password.js
* Date:        2/1/2014
* Description: to validate the password's requirements.
 */

function checkForm(form)
  {
	if(form.username.value == "") {
      alert("Error: Username cannot be blank!");
      form.username.focus();
      return false;
    }
	if(form.pwd1.value == form.username.value) {
        alert("Error: Password must be different from Username!");
        form.pwd1.focus();
        return false;
      }
      re = /[0-9]/;
     if(!re.test(form.pwd1.value)) {
        alert("ERROR: password must contain at least one number (0-9)!");
        return false;
      }
      re = /[a-z]/;
     if(!re.test(form.pwd1.value)) {
        alert("ERROR: password must contain at least one lowercase letter (a-z)!");
        return false;
      }
      re = /[A-Z]/;
     if(!re.test(form.pwd1.value)) {
        alert("ERROR: password must contain at least one uppercase letter (A-Z)!");
        return false;
      }
	   re = /[@#$&*^%!+=\/\\[\]|?.,<>)(;:'"~`]/;
     if(!re.test(form.pwd1.value)) {
        alert("ERROR: password must contain at least one punctuation [.!?, etc.]!");
        return false;
      } 
	  if(form.pwd1.value != form.pwd2.value) {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.pwd1.focus();
      return false;
    }
  }