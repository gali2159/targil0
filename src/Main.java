
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        try {
            employee[0] = new HourlyEmployee("Yosi", "Cohen", 999999999, 20, 50);
            employee[1] = new CommissionEmployee("Dani", "Levi", 888888888, 9999, 45);
            employee[2] = new BasePlusCommissionEmployee("Dana", "Levin", 777777777, 8989, 55, 5000);
            for(int i=0;i<3;i++)
            {
                System.out.println(employee[i].toString());
            }
        } catch (Exception a) {
            System.out.println(a);
        }

    }
    }

