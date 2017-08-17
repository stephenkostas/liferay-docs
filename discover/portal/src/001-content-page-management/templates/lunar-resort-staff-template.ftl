<style>
.wrapper {
  display: grid;
  grid-template-columns: 300px, 300px, 300px, 300px;
  grid-gap: 10px;
  grid-auto-rows: minmax(auto, auto);
  text-align: center;
}

h1 {
    text-align: center;
}

h2 { 
   position: relative;
   color: black;
}

.item-one {
  grid-column: 2;
  grid-row: 1;
  max-width: 355px;
}

.item-two { 
  grid-column: 4;
  grid-row: 1;
  max-width: 355px;
}

.item-three {
  grid-column: 2;
  grid-row: 2;
  max-width: 355px;
}

.item-four {
  grid-column: 4;
  grid-row: 2;
  max-width: 355px;
}
</style>

<h1>${title.getData()}</h1>

<div class="wrapper">
  <a class="item-one" href="${link1.getFriendlyUrl()}">
  <h2>${name1.getData()}</h2>
    <#if image1.getData()?? && image1.getData() != "">
	 <img alt="${image1.getAttribute("alt")}" src="${image1.getData()}" />
    </#if>
  </a>
  
  <a class="item-two" href="${link2.getFriendlyUrl()}">
  <h2>${name2.getData()}</h2>
    <#if image2.getData()?? && image2.getData() != "">
	 <img alt="${image2.getAttribute("alt")}" src="${image2.getData()}" />
    </#if>
  </a>

<hr />
  
  <a class="item-three" href="${link3.getFriendlyUrl()}">
  <h2>${name3.getData()}</h2>
    <#if image3.getData()?? && image3.getData() != "">
	 <img alt="${image3.getAttribute("alt")}" src="${image3.getData()}" />
    </#if>
  </a>

  <a class="item-four" href="${link4.getFriendlyUrl()}">
  <h2>${name4.getData()}</h2>
    <#if image4.getData()?? && image4.getData() != "">
	  <img alt="${image4.getAttribute("alt")}" src="${image4.getData()}" />
    </#if>
  </a>
 
</div>