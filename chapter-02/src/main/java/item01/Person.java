package item01;

import java.util.Objects;

/**
 *
 * @author cesardiaz
 */
public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        Person p = (Person) obj;
        return name.compareTo(p.getName()) == 0;
    }

    @Override
    public String toString() {
        return name;
    }

}
