package homework15.family;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Family {
    String lastName;
    String address;
    double salary;
    Set<Children> childrens = new HashSet<>();

    public static final Set<String> familyLastNames = new HashSet<>();


    public Family(String lastName, String address, double salary)
            throws FamilyLastNameNotUniqueException {

        if (familyLastNames.contains(lastName)) {
            throw new FamilyLastNameNotUniqueException();
        }
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;

        familyLastNames.add(lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public Set<Children> getChildrens() {
        return childrens;
    }

    @Override
    public String toString() {
        return "Family{" +
                "lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", childrens=" + childrens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Family family = (Family) o;

        if (Double.compare(family.salary, salary) != 0) return false;
        if (!lastName.equals(family.lastName)) return false;
        if (!Objects.equals(address, family.address)) return false;
        return Objects.equals(childrens, family.childrens);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = lastName.hashCode();
        result = 31 * result + (address != null ? address.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (childrens != null ? childrens.hashCode() : 0);
        return result;
    }
}
