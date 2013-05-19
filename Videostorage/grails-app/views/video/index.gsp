<center><h1>My Video Storage</h1></center>
<a href="create">Add Video</a>
</hr>
<ul>
  <% if(videos.size() == 0) { %>
    <li>No videos</li>
  <% } else { %>
    <% for(video in videos) { %>
      <li>
      	<div>
      		<h2><%=video.title%></h2>
	  		<iframe width="560" height="315" src="http://www.youtube.com/embed/<%=video.getYoutubeKey()%>" frameborder="0" allowfullscreen></iframe>
	  		<h3>Description : </h3><%=video.description%>
	  	</div>
	  </li>
    <% } %> 
  <% } %>
</ul>
