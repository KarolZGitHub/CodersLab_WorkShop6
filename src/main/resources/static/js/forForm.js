window.addEventListener('resize', function() {
    var form = document.querySelector('form');
    if (window.innerWidth <= 600) {
        form.style.maxWidth = '100%';
        form.style.padding = '10px';
    } else {
        form.style.maxWidth = '400px';
        form.style.padding = '20px';
    }
});
