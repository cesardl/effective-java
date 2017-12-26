package item01.serviceprovider;

import item01.serviceprovider.providers.JSONProvider;
import item01.serviceprovider.providers.TextProvider;
import item01.serviceprovider.providers.XMLProvider;
import item01.serviceprovider.services.JSONService;
import item01.serviceprovider.services.TextService;
import item01.serviceprovider.services.XMLService;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created on 25/12/2017.
 *
 * @author Cesardl
 */
public class ServicesTest {

    @BeforeClass
    public static void setUp() {
        Services.registerDefaultProvider(new TextProvider());
        Services.registerProvider("XML", new XMLProvider());
        Services.registerProvider("JSON", new JSONProvider());
    }

    @Test
    public void getProviders() {
        Service result = Services.newInstance();
        assertTrue(result instanceof TextService);
        result.parse("a");

        result = Services.newInstance("XML");
        assertTrue(result instanceof XMLService);
        result.parse("b");

        result = Services.newInstance("JSON");
        assertTrue(result instanceof JSONService);
        result.parse("c");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUnregisterProvider() {
        Services.newInstance("aaa");
    }
}