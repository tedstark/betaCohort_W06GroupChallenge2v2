var index = 0;
var arrayOfQuotes = [];

$(document).ready(function () {
    getServerData()
});

function getServerData() {
    $.ajax({
        type: "GET",
        URL: "/quotes",
        success: function(data){
            console.log("Server Data Received");
            arrayOfQuotes = data.blurbs;
            console.log(data);
        }
    })
}