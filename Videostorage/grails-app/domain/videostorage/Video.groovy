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
        int keyIndex = url.indexOf('=')
        if( keyIndex == -1 )
            return null
    	return url.substring(keyIndex+1)
    }

}
