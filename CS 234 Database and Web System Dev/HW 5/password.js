/* 
* Author:      John West
* File Name:   Password.js
* Date:        2/1/2014
* Description: to validate the password's requirements.
 */

function checkForm(form)
  {
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

    alert("You entered a valid password: " + form.pwd1.value);
    return true;
  }