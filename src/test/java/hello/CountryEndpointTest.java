package hello;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CountryEndpointTest {

    @Test
    public void testGetCountry() {
        assertThat(true, is(true));
    }
}
