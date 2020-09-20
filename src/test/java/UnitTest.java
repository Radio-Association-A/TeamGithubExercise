import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.junit.Assert.*;

public class UnitTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(API.SampleAPI.class);
    }

    @Test
    public void addTest(){

        int out = target("add")
                .queryParam("Value1",5)
                .queryParam("Value2",7)
                .request()
                .get(Integer.class);

        assertEquals(out,12);
    }
}
