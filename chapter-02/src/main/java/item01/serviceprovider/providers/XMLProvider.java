package item01.serviceprovider.providers;

import item01.serviceprovider.Provider;
import item01.serviceprovider.Service;
import item01.serviceprovider.services.XMLService;

/**
 * Created on 25/12/2017.
 *
 * @author Cesardl
 */
public class XMLProvider implements Provider {

    @Override
    public Service newService() {
        return new XMLService();
    }
}
