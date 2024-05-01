import java.util.Objects;

public class HourlyEmployee extends Employee{
    private int hours;
    private float wage;

    /**constructors**/
    public HourlyEmployee() {
        super();
        hours=0;
        wage=0;
    }

    public HourlyEmployee(String firstName, String lastName, int id, int hours, int wage) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wage=wage;
    }

    /**getter and setter for hour**/    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<0)
        {}
        this.hours = hours;

    }

    /**getter ans setter for wage**/
    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    /**override**/
    @Override
    public int earnings(){return (int) (hours * wage); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee that)) return false;
        if (!super.equals(o)) return false;
        return hours == that.hours && Float.compare(wage, that.wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName=" + getFirstName()+
                ", lastName=" + getLastName() +
                ", id=" + getId() +
                ", hours=" + hours +
                ", wage=" + wage +
                "} ";
    }
}
