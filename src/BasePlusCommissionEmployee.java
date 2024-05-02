import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;

    /**constructors**/
    public BasePlusCommissionEmployee() {
        super();
        baseSalary=0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision, float baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
        this.baseSalary = baseSalary;
    }

    /**getter and setter for baseSalary**/
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary<0) throw new IllegalArgumentException("baseSalary must be number non-negative");
        this.baseSalary = baseSalary;
    }
    /**override**/
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName=" + getFirstName()+
                ", lastName=" + getLastName() +
                ", id=" + getId() +
                ", grossSales=" + getGrossSales() +
                ", commision=" + getCommision() +
                ", baseSalary=" + baseSalary +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(baseSalary, that.baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }

    @Override
    public float earnings() {
        return (float) (baseSalary+getGrossSales()*getCommision()/100);
    }

}
