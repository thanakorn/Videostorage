package videostorage

class Tag {

	String name

    static constraints = {
    	name blank:false
    }

    def getTag(){
    	name
    }
}
