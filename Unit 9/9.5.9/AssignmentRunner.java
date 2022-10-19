import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {

        ArrayList<Assignment> as = new ArrayList<Assignment>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an assignment name (exit to quit): ");
        String n = scanner.nextLine();
        if (n.equals("exit") == false) {
            String n1 = n;
            while (n1.equals("exit") == false) {
                System.out.println("Please enter the available points: ");
                double ap = scanner.nextDouble();
                System.out.println("Please enter the earned points: ");
                double ep = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Is this a (t)est or (p)roject: ");
                String top = scanner.nextLine();
                if (top.equals("p") == false) {
                    System.out.println("Please enter the test date: ");
                    String d = scanner.nextLine();
                    Test t = new Test(n1, ap, ep, d);
                    as.add(t);
                } else {
                    System.out.println("Please enter the due date: ");
                    String dd = scanner.nextLine();
                    System.out.println("Group project? true or false: ");
                    boolean g = scanner.nextBoolean();
                    Project p = new Project(n1, ap, ep, dd, g);
                    as.add(p);
                    scanner.nextLine();
                }
                System.out.println("Please enter an assignment name (exit to quit): ");
                n1 = scanner.nextLine();
            }
            System.out.println("Your average: " + average(as));
        }

    }

    public static double average(ArrayList<Assignment> assignments) {
        double earned = 0;
        double available = 0;
        for (int i = 0; i < assignments.size(); i++) {
            earned += assignments.get(i).getEarnedPoints();
            available += assignments.get(i).getAvailablePoints();
        }
        return ((earned / available) * 100);
    }
}