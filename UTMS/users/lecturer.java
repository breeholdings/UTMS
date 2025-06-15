package users;

public class lecturer extends user {
    public lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requested transport to lecture hall.");
    }
}
