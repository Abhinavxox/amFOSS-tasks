"use strict";

const b1 = document.getElementById("b1");
const b2 = document.getElementById("b2");
const b3 = document.getElementById("b3");
const b4 = document.getElementById("b4");
const b5 = document.getElementById("b5");
const b6 = document.getElementById("b6");

//button store something in localStorage
b1.addEventListener("click", function () {
  window.localStorage.setItem("Flag", true);
  alert("Flag has been set.");
});

//button2 show time
b2.addEventListener("click", function () {
  var today = new Date();
  var time =
    today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
  alert(`The current time is ${time}`);
});

//button3 change background
var clicked = false;
b3.addEventListener("click", function () {
  if (clicked) {
    document.body.classList.remove("bg-color");
    clicked = false;
  } else {
    document.body.classList.add("bg-color");
    clicked = true;
  }
});

//button4 refresh page
b4.addEventListener("click", function () {
  window.location.reload();
});

//button5 open new page
b5.addEventListener("click", function () {
  window.open().focus();
});

//spam the console with "I did it"
b6.addEventListener("click", function () {
  console.log("I did it");
});
