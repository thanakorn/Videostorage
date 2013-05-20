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
        String youtube = "http://www.youtube.com/watch?v="
        int keyIndex = url.indexOf("http://www.youtube.com/watch?v=")
        if( keyIndex == -1 )
            return null
        keyIndex += youtube.length()
    	return url.substring(keyIndex)
    }

}
