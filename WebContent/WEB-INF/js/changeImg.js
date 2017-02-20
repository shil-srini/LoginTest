/**
 * 
 */
var count=0;
	function changeImg() {
		count++;
		var images = [
				"file:///C:/shilpa/Workspace/Eclipse/LoginTest/WebContent/WEB-INF/Images/image1.jpg",
				"file:///C:/shilpa/Workspace/Eclipse/LoginTest/WebContent/WEB-INF/Images/image2.png",
				"file:///C:/shilpa/Workspace/Eclipse/LoginTest/WebContent/WEB-INF/Images/image3.png",
				"file:///C:/shilpa/Workspace/Eclipse/LoginTest/WebContent/WEB-INF/Images/image4.png" ]
		
		if (count > 3) {
			count = 0;
			//alert(count);
			document.getElementById('imageChange').src = images[0];
		}
		else{
			//	alert(counts)
			document.getElementById('imageChange').src = images[count];
			//alert(document.getElementById('imageChange').src)
		}
	}
	
	  