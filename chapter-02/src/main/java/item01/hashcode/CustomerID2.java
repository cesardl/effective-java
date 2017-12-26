package item01.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cesardiaz
 * @see <a href='http://www.xyzws.com/javafaq/why-always-override-hashcode-if-overriding-equals/20'>Why always override hashcode() if overriding equals()?</a>
 */
public class CustomerID2 {

    private long crmID;
    private int nameSpace;

    public CustomerID2(long crmID, int nameSpace) {
        super();
        this.crmID = crmID;
        this.nameSpace = nameSpace;
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(new CustomerID2(2345891234L, 0), "Jeff Smith");
        System.out.println(m.get(new CustomerID2(2345891234L, 0)));
    }

    @Override
    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        if (!(obj instanceof CustomerID2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.crmID == ((CustomerID2) obj).crmID
                && this.nameSpace == ((CustomerID2) obj).nameSpace;
    }

    @Override
    public int hashCode() {
        int result = (int) (crmID / 12) + nameSpace;
        return result;
    }

}
