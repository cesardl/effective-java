package item01.serviceprovider.services;

import item01.serviceprovider.Service;

/**
 * Created on 25/12/2017.
 *
 * @author Cesardl
 */
public class JSONService implements Service {

    @Override
    public void parse(String s) {
        System.out.println(String.format("Parsing string '%s' to JSON format", s));
    }
}
