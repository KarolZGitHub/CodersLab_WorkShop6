function adjustTableStyle() {
    var table = document.querySelector('table');
    if (window.innerWidth <= 600) {
        table.querySelectorAll('th, td').forEach(function(cell) {
            cell.style.padding = '5px';
            cell.style.fontSize = '12px';
        });
    } else {
        table.querySelectorAll('th, td').forEach(function(cell) {
            cell.style.padding = '8px';
            cell.style.fontSize = 'inherit';
        });
    }
}

window.addEventListener('resize', adjustTableStyle);
