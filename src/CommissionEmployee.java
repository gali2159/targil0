import java.util.Objects;

public class CommissionEmployee extends Employee{
    private float grossSales;
    private int commision;

    /**constructors**/
    public CommissionEmployee() {
        super();
        grossSales=0;
        commision=0;
    }

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        if(grossSales<0) throw new IllegalArgumentException("GrossSales must be number non-negative");
        this.grossSales = grossSales;
        if(commision<0) throw new IllegalArgumentException("Commision must be number non-negative");
        this.commision=commision;
    }

    /**getter and setter for grossSales**/
    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {

        if(grossSales<0) throw new IllegalArgumentException("GrossSales must be number non-negative");
        this.grossSales = grossSales;
    }

    /**getter and setter for commision**/
    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if(commision<0) throw new IllegalArgumentException("Commision must be number non-negative");
        this.commision = commision;
    }

    /**override**/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(grossSales, that.grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName=" + getFirstName()+
                ", lastName=" + getLastName() +
                ", id=" + getId() +
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                "} ";
    }

    @Override
    public float earnings(){ return (float) ((commision*grossSales)/100); }

}
