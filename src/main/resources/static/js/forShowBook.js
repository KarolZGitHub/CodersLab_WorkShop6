// script.js

function adjustLayout() {
    var screenWidth = window.innerWidth;

    if (screenWidth < 600) {
        // Small screens
        document.body.style.backgroundColor = "#f2f2f2";
    } else if (screenWidth < 1200) {
        // Dodatkowe działania dla mid screens
        document.body.style.backgroundColor = "#d9d9d9";
    } else {
        // Large screens
        document.body.style.backgroundColor = "#bfbfbf";
    }
}

window.addEventListener("load", adjustLayout);
window.addEventListener("resize", adjustLayout);
