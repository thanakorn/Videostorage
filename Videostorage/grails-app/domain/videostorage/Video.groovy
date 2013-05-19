package videostorage

class Video {

	String title
	String url
	String description

    static constraints = {
    	title blank:false
    	url blank:false
    	description blank:false
    }

    def getYoutubeKey(){
    	url.substring(url.indexOf('=')+1)
    }
}
