let currentSlide = 0;

function slide(direction) {
    const items = document.querySelector('.blog-items');
    const itemWidth = document.querySelector('.blog-item').offsetWidth;
    const totalItems = document.querySelectorAll('.blog-item').length;

    currentSlide += direction;

    if (currentSlide < 0) {
        currentSlide = totalItems - 1;
    } else if (currentSlide >= totalItems) {
        currentSlide = 0;
    }

    items.style.transform = `translateX(${-currentSlide * (itemWidth + 20)}px)`;
}
