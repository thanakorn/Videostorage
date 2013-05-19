<h1>My Video Storage</h1>

<g:form name="videoCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  Description:</br> <g:textArea name="description" rows='5' cols='50'/><br/>
  <input type="submit" value="Add Video"/>
</g:form>

<hr>

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
