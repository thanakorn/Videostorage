package videostorage

class Video {

	String title
	String url
	String description

    static hasMany = [tags:Tag]

    static constraints = {
    	title blank:false
    	url blank:false
    	description blank:false
    }

    def getYoutubeKey(){
    	return url.substring(url.indexOf('=')+1)
    }
}
