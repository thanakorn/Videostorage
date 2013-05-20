package videostorage

class VideoController {

    def index() { 
    	def videos = Video.findAll([sort:'id',order:'desc'])
    	[videos:videos]
    }

    def create(){
    	if( params.title != null ){

            if( params.url.indexOf("http://") != 0 || params.url.indexOf("https://") != 0)
                params.url = "http://"+params.url

	    	def new_video = new Video(title:params.title,
	    							  url:params.url,
	    							  description:params.description)
            if( new_video.getYoutubeKey() != null )
	    	  new_video.save()
	    	redirect(action:'index')
    	}
    }

}
