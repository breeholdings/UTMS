package transport;

import transport.interfaces.schedulable;
import transport.interfaces.trackable;

public class bus extends vehicle implements schedulable, trackable {
    public bus(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public void schedule(String time) {
        System.out.println("Bus scheduled at " + time);
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Bus location...");
    }
}
