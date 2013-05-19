package videostorage

import grails.test.mixin.*
import org.junit.*

@TestFor(Video)
class VideoTests {

    void testCreateVideo(){
    	def vdo = new Video(title:'Test create video',
    						url:'http://www.youtube.com/watch?v=uY7pymdB5ec',
    						description:'Test Video')

    	vdo.title == "Test create video"
    	vdo.url == "http://www.youtube.com/watch?v=uY7pymdB5ec"
    	vdo.description == "Test Video"
    }

    void testGetYoutubeKey(){
    	def vdo = new Video(title:'Test create video',
    						url:'http://www.youtube.com/watch?v=uY7pymdB5ec',
    						description:'Test Video')
    	assert vdo.getYoutubeKey() == 'uY7pymdB5ec'
    }

    void testInvalidUrl(){
        def vdo = new Video(title:'Test invalid video',
                            url:'http://www.google.com',
                            description:'Google')
        assert vdo.getYoutubeKey() == null
    }

    void testContraints(){
    	def vdo = new Video(title:'Test create video',
    						url:'',
    						description:'')
    	vdo.save()
    	assert vdo.count() == 0
    }
}
