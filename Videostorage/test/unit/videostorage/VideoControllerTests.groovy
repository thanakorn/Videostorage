package videostorage

import grails.test.mixin.*
import org.junit.*
import grails.test.mixin.domain.DomainClassUnitTestMixin

@TestFor(VideoController)
@TestMixin(DomainClassUnitTestMixin)
@Mock([Video])
class VideoControllerTests {

	@Test
    void testInvalidUrl(){
        params.title = "Test invalid URL"
        params.url = "www.google.com"
        params.description = "Google"
        controller.create()
        assert Video.count == 0
    }

    @Test
    void testBlankForm(){
        params.title = ""
        params.url = ""
        params.description = ""
        controller.create()
        assert Video.count == 0
    }

    @Test
    void testBlankTitle(){
        params.title = ""
        params.url = "http://www.youtube.com/watch?v=JeWZcr4bijM"
        params.description = "Samsung Galaxy S4"
        controller.create()
        assert Video.count == 0
    }

    @Test
    void testNotStartWithHttp(){
        params.title = ""
        params.url = "www.youtube.com/watch?v=JeWZcr4bijM"
        params.description = "Samsung Galaxy S4"
        controller.create()
        params.url = "http://www.youtube.com/watch?v=JeWZcr4bijM"
    }

}
