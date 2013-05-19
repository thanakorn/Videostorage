package videostorage

import grails.test.mixin.*
import org.junit.*
import grails.test.mixin.domain.DomainClassUnitTestMixin

@TestFor(VideoController)
@TestMixin(DomainClassUnitTestMixin)
@Mock([Video])
class VideoControllerTests {

	void testSomething(){
		
	}

	@Test
    void testInvalidUrl(){
        params.title = "Test invalid URL"
        params.url = "www.google.com"
        params.description = "Google"
        controller.create()
        assert Video.count == 0
    }

}
