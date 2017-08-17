<style>
	  .slides {
	    margin: auto; 
	    width: 100%;
	    height: auto;
	    border-radius: 5%;
	  }
	  
	  h1 { 
       position: absolute;
       color: white;
       top: 100px; 
       width: 100%; 
       text-align: center;
       font-size: 50px;
      }

</style>

<#if entries?has_content>
	<div id="<@portlet.namespace />carousel">
		<#assign imageMimeTypes = propsUtil.getArray("dl.file.entry.preview.image.mime.types") />

		<#list entries as entry>
			<#if imageMimeTypes?seq_contains(entry.getMimeType())>
    	      <img class="slides" src="${dlUtil.getPreviewURL(entry, entry.getFileVersion(), themeDisplay, "")}">
			</#if>
		</#list>
		    <div class="flex-container" style="height: 100%">
                <h1>Make Memories at the Lunar Resort<h1>
            <div class="flex-item-center text-center" style="width: 100%">
            </div>
    </div>  

	</div>

	<script>
	var slideIndex = 0;
        carousel();

    function carousel() {
    var i;
    var x = document.getElementsByClassName("slides");
    for (i = 0; i < x.length; i++) {
      x[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex > x.length) {slideIndex = 1} 
    x[slideIndex-1].style.display = "block"; 
    setTimeout(carousel, 3000); // Change image every 3 seconds
    }
	</script>
</#if>