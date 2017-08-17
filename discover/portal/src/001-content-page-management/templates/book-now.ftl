<style>
.popup {
    text-align: center;
    width: 100%;
    margin: auto;
    display: inline-block;
    cursor: pointer;
    height: 350px;
    background-image: url("${bgimage.getData()}");
}

button {
    position: relative;
    top: 110px;
    padding: 20px 20px;
    text-align: center;
    text-decoration: none;
    border: none;
    font-size: 40px;
    border-radius: 6px;
    background-color: #65b6f0;
    color: white;
}

.popup .popuptext {
    visibility: hidden;
    width: 450px;
    background-color: #555;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 8px 0;
    position: absolute;
    z-index: 1;
    bottom: 100%;
    left: 50%;
    margin-left: -220px;
    font-size: 150%;
}

.popup .show {
    visibility: visible;
}
</style>

<div class="popup" onclick="bookNow()">
  <button>${buttontext.getData()}</button>
  <span class="popuptext" id="myPopup">You have successfully booked your trip!    <br />  See you on the moon!</span>
</div>

<script>
function bookNow() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
}
</script>