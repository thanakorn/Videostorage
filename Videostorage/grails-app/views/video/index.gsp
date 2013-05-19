<h1>My Video Storage</h1>

<g:form name="videoCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  Description: <g:textField name="description"/><br/>
  <input type="submit" value="Add New Video"/>
</g:form>

<hr>

<ul>
  <% if(videos.size() == 0) { %>
    <li>No videos</li>
  <% } else { %>
    <% for(video in videos) { %>
      <li>
	  	<iframe width="560" height="315" src="http://www.youtube.com/embed/<%=video.getYoutubeKey()%>" frameborder="0" allowfullscreen></iframe>
	  </li>
    <% } %> 
  <% } %>
</ul>
