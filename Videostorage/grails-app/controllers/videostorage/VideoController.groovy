package videostorage

class VideoController {

    def index() { 
    	def videos = Video.findAll()
    	[videos:videos]
    }

    def create(){
    	
    }
}
