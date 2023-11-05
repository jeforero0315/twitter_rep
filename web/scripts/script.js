const twitterForm = document.getElementById("twitter_form");

twitterForm.addEventListener("submit", (event) => {
    event.preventDefault();

    const tweetContent = document.getElementById("tweet_text_area").value;
    const tweetsList = document.getElementById("tweets_list");
    const listItem = document.createElement("li");
    listItem.innerText = tweetContent;
    tweetsList.appendChild(listItem);

    // Lógica de envío del tweet por medio de fetch
    // ...
});

function getTweets() {
    // Lógica para obtener tweets mediante fetch y mostrarlos en la lista
    // ...
}

document.addEventListener("DOMContentLoaded", () => {
    getTweets();
});
