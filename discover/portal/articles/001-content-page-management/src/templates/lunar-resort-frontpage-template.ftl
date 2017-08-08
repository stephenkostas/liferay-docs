<style>
h1 { 
   position: absolute;
   color: white;
   top: 100px; 
   width: 100%; 
   text-align: center;
}

.img-container {
    height: 1000px;
    background-image: url("${BGImage.getData()}");
    background-size: cover;
    background-repeat: no-repeat;
    background-position: 50% 50%;
}

</style>

<div class="figure figure-rounded">
<#if BGImage.getData()?? && BGImage.getData() != "">
    <div class="img-container" />
</#if>
    <div class="flex-container" style="height: 100%">
                <h1>${textoverlay.getData()}<h1>
            <div class="flex-item-center text-center" style="width: 100%">
            </div>
    </div>  
</div>