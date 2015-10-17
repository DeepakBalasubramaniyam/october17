<html>
<head>
<script type = "application/javascript">


function loadJSON(){
var data_file = "new1.json";
var request = new XMLHttpRequest();
try{
request = new XMLHttpRequest();
}catch (e){
try{
request = new ActiveXObject("Msxml2.XMLHTTP");
}catch (e) {
try{
request = new ActiveXObject("Microsoft.XMLHTTP");
}catch (e){
alert("Your browser broke!");
return false;
}
}
}
request.onreadystatechange = function(){
if (request.readyState == 4 ){
var jsonObj = JSON.parse(request.responseText);
document.getElementById("Sl.no1").innerHTML = jsonObj.sl1;
document.getElementById("Subject1").innerHTML = jsonObj.subject1;
document.getElementById("Time1").innerHTML = jsonObj.time1;
document.getElementById("Date1").innerHTML = jsonObj.date1;

}
}
request.open("GET", data_file, true);
request.send();
}
</script>
<title>JSON EXAMPLE</title>
</head>
<body>
<h1>EXAM TIMETABLE</h1>
<table border="1">
<tr>
    <th>SL.NO</th>
    <th>SUBJECT</th>
    <th>TIME</th>
    <th>DATE</th>


</tr>
<tr>
    <td><div id = "Sl.no1">1</div></td>
    <td><div id = "Subject1">Tamil</div></td>
    <td><div id = "Time1">10:00 AM</div></td>
    <td><div id = "Date1">25/03/2016</div></td>


</tr>
<tr>
    <td><div id = "Sl.no2">2</div></td>
    <td><div id = "Subject2">English</div></td>
    <td><div id = "Time2">02:00 PM</div></td>
    <td><div id = "Date2">27/03/2016</div></td>


</tr>
<tr>
    <td><div id = "Sl.no3">3</div></td>
    <td><div id = "Subject3">Maths</div></td>
    <td><div id = "Time3">10:00 AM</div></td>
    <td><div id = "Date3">29/03/2016</div></td>


</tr>
<tr>
    <td><div id = "Sl.no4">4</div></td>
    <td><div id = "Subject4">Science</div></td>
    <td><div id = "Time4">10:00 AM</div></td>
    <td><div id = "Date4">01/04/2016</div></td>


</tr>

<tr>
    <td><div id = "Sl.no5">5</div></td>
    <td><div id = "Subject5">Social</div></td>
    <td><div id = "Time5">10:00 AM</div></td>
    <td><div id = "Date5">05/04/2016</div></td>


</tr>
</table>
<div class = "central">
    <br>
<button type = "button" onclick = "loadJSON()">Update Details </button>
</div>
</body>
</html>