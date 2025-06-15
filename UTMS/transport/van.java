package transport;

import transport.interfaces.schedulable;
import transport.interfaces.trackable;

public class van extends vehicle implements schedulable, trackable {
    public van(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public void schedule(String time) {
        System.out.println("Van scheduled at " + time);
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Van location...");
    }
}
