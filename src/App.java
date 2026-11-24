import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("00101", "Alice", 35, "Manager", "Management", 10));
        staffList.add(new Staff("00102", "Bob", 28, "Ride Operator", "Operations", 4));
        staffList.add(new Staff("00103", "Carol", 32, "Inspector", "Maintenance", 7));

        ArrayList<Visitor> visitorList= new ArrayList<>();
        visitorList.add(new Visitor("00201", "Tom", 20, "VIP Ticket"));
        visitorList.add(new Visitor("00202", "Lily", 15));
        visitorList.add(new Visitor("00203","Jack", 42,"Family Ticket"));
        visitorList.add(new Visitor("00204", "Emma", 12));
        visitorList.add(new Visitor("00205", "David",27,"VIP Ticket"));
        
        for (Staff staff: staffList){
            System.out.println(staff);
        }

        Collections.sort(visitorList);
        for (Visitor visitor : visitorList){
            System.out.println(visitor);
        }
    }
}
