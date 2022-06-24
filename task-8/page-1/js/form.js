"use strict";

const reset = function () {
  document.forms["myForm"]["name"].value == "";
  document.forms["myForm"]["home-address"].value == "";
  document.forms["myForm"]["email"].value == "";
  document.forms["myForm"]["phone-number"].value == "";
  document.getElementById("gender-male").checked = false;
  document.getElementById("gender-female").checked = false;
  document.getElementById("pizza-crusts-thin").checked = false;
  document.getElementById("pizza-crusts-deep").checked = false;
  document.getElementById("pizza-crusts-pan").checked = false;
  document.getElementById("pizza-crusts-stuffed").checked = false;
};

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
