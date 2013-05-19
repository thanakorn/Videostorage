package videostorage

class Tag {

	String tag

	static belongsTo = [video:Video]

    static constraints = {
    	tag blank:false
    }

    def getTag(){
    	return tag
    }
}
