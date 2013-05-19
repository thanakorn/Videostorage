package videostorage

class Tag {

	String tag

    static constraints = {
    	tag blank:false
    }

    def getTag(){
    	return tag
    }
}
