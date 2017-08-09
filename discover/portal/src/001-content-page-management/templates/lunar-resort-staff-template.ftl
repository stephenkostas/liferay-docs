<style>
.wrapper {
  display: grid;
  grid-template-columns: 300px, 300px, 300px, 300px;
  grid-gap: 10px;
  grid-auto-rows: minmax(auto, auto);
}
h1 {
    text-align: center;
}
h2 { 
   position: absolute;
   color: white;
   text-align: center;
}
.item-one {
  grid-column: 2;
  grid-row: 1;
}
.item-two { 
  grid-column: 3;
  grid-row: 1;
}
.item-three {
  grid-column: 2;
  grid-row: 2;
}
.item-four {
  grid-column: 3;
  grid-row: 2;
}

</style>
<h1>${title.getData()}</h1>
<div class="wrapper">
  <div class="item-one">
    <h2>${item1.getData()}</h2>
    <#if image1.getData()?? && image1.getData() != "">
	<img alt="${image1.getAttribute("alt")}" src="${image1.getData()}" />
</#if>
  </div>
  
  <div class="item-two">
    <h2>${item2.getData()}</h2>
    <#if image2.getData()?? && image2.getData() != "">
	<img alt="${image2.getAttribute("alt")}" src="${image2.getData()}" />
</#if>
  </div>
  
  <div class="item-three">
    <h2>${item3.getData()}</h2>
    <#if image3.getData()?? && image3.getData() != "">
	<img alt="${image3.getAttribute("alt")}" src="${image3.getData()}" />
</#if>
  </div>

  <div class="item-four">
    <h2>${item4.getData()}</h2>
    <#if image4.getData()?? && image4.getData() != "">
	<img alt="${image4.getAttribute("alt")}" src="${image4.getData()}" />
</#if>
  </div>
 
</div>