import users.*;
import transport.*;
import transport.interfaces.*;

public class main {
    public static void main(String[] args) {
        user student = new student("Alice", "ST123");
        user lecturer = new lecturer("Dr. Bob", "LC456");
        transportofficer officer = new transportofficer("Mr. John", "TO789");

        student.requestTransport();                    // <-- Must be present
        lecturer.requestTransport();                   // <-- Must be present
        officer.requestTransport();                    // <-- Must be present

        officer.assignDriver("Bus");                   // <-- Must be present
        officer.assignDriver("Van", "Morning Shift");  // <-- Must be present

        bus schoolBus = new bus("UBB123X");
        schoolBus.schedule("08:00 AM");
        schoolBus.trackLocation();
    }
}
