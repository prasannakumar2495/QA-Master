window.alert("you have entered into the local website");
// this is a function for the bulb.
var vdo = document.getElementById("video");
function playpause() {
	if (vdo.paused) {
		vdo.play();
	} else {
		vdo.pause();
	}
}
function makeBig() {
	vdo.width = 720;
}
function makeSmall() {
	vdo.width = 420;
}

