<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Google Map</title>
</head>
<body>
<input id="demo" type="text" name="location" placeholder="Enter Mobile Number Without 0 or +91" maxlength="36" title="Locate Mobile Number On Map." class="style2" style="background-color:White;border-style:Inset;height:35px;width:300px;" autocomplete="off">
<button type="button"  class="style3" style="color:Black;background-color:White;border-color:Black;font-weight:bold;height:39px;width:100px" title="Locate Mobile Number On Map." onclick="myFunction()">Locate</button>
<button type="button"  class="style3" style="color:Black;background-color:White;border-color:Black;font-weight:bold;height:39px;width:100px" title="Locate Mobile Number On Map." onclick="myFunction()">Locate All</button>
<div class="mapContainer"></div>
 <div id="map" style="width: 500px; height: 400px;"></div>
 <script>
 function initMap(){
 var india={lat: 20.5937,lng: 78.9629};
 var map=new google.maps.Map(document.getElementById('map'),{zoom:4, center:india});
	var marker=new google.maps.Marker({position:india,map:map});
	}
</script>
	
 <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB2bXKNDezDf6YNVc-SauobynNHPo4RJb8&libraries=places&callback=initMap"
        async defer></script>
</body>
</html>