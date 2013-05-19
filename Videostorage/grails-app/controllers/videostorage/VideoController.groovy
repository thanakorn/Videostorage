package videostorage

class VideoController {

    def index() { 
    	def videos = Video.findAll()
    	[videos:videos]
    }

    def create(){
    	if( params.title != null ){
	    	def new_video = new Video(title:params.title,
	    							  url:params.url,
	    							  description:params.description)
            if( new_video.getYoutubeKey() != null )
	    	  new_video.save()
	    	redirect(action:'index')
    	}
    }

}
