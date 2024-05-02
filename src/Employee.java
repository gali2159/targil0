import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    /**constructor*/
    public Employee() {
        this.firstName="plony";
        this.lastName="almony";
        this.id=0;
    }
    public Employee(String firstName, String lastName, int id) {
        this.firstName=firstName;
        this.lastName = lastName;
        this.id=id;
    }

    /** setter and getter for firstName*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** setter and getter for lastName*/
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** setter and getter for id*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", id=" + id +
                '}';
    }

    public abstract float earnings();
}
