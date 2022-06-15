"use strict";

const reset = function(){
  window.location.reload(true);
}

const validate = function () {
  if (document.forms["myForm"]["name"].value == "") {
    alert(`Name must be filled`);
    return false;
  }
  if (document.forms["myForm"]["home-address"].value == "") {
    alert(`Address must be filled`);
    return false;
  }
  if (document.forms["myForm"]["email"].value == "") {
    alert(`Email must be filled`);
    return false;
  }
  if (document.forms["myForm"]["phone-number"].value == "") {
    alert(`Phn must be filled`);
    return false;
  }
  if (
    document.getElementById("gender-male").checked != true &&
    document.getElementById("gender-female").checked != true
  ) {
    alert(`Gender must be selected`);
    return false;
  }
  if (
    document.getElementById("pizza-crusts-thin").checked != true &&
    document.getElementById("pizza-crusts-deep").checked != true &&
    document.getElementById("pizza-crusts-pan").checked != true &&
    document.getElementById("pizza-crusts-stuffed").checked != true
  ) {
    alert(`Pizza must be selected`);
    return false;
  }
  return true;
};

document.getElementById("next_btn").addEventListener("click", function () {
  if (validate() == true) {
    //first shows loading animation
    this.classList.add("button--loading");
    //waits for 1sec and the goes to next command
    setTimeout(() => {
      //opens next page in same window
      window.open("../page-2/index.html", "_self");
    }, 1000);
  }
});
document.getElementById("reset").addEventListener("click",function(){
  window.open("form.html", "_self")
});

