package videostorage

import static org.junit.Assert.*
import org.junit.*

class VideoIntegrationTests {

    def controller


    @Before
    void setUp() {
        // Setup logic here
        controller = new VideoController()
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        // 
    }

}
