package users;

public class student extends user {
    public student(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " requested a ride to campus.");
    }
}
