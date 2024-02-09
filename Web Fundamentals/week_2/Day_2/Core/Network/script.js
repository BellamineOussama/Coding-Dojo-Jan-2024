var likes = [9, 12, 9]; 
// Function to increment likes 
function incrementLikes(index) {
    // Increment the likes count in the array
    likes[index - 1]++;
    // Return the new likes count
    var counter = document.querySelector('#counter' + index);
    counter.textContent = likes[index - 1];
}
