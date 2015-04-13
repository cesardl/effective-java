package item01.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cesardiaz
 */
public class CustomerID1 {

    private final long crmID;
    private final int nameSpace;

    public CustomerID1(long crmID, int nameSpace) {
        super();
        this.crmID = crmID;
        this.nameSpace = nameSpace;
    }

    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        if (!(obj instanceof CustomerID1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.crmID == ((CustomerID1) obj).crmID
                && this.nameSpace == ((CustomerID1) obj).nameSpace;
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(new CustomerID1(2345891234L, 0), "Jeff Smith");
        System.out.println(m.get(new CustomerID1(2345891234L, 0)));
    }
}
