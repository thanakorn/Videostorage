package videostorage

class Video {

	String title
	String url
	String description

    static constraints = {
    }

    def getYoutubeKey(){
    	url.substring(url.indexOf('=')+1)
    }
}
