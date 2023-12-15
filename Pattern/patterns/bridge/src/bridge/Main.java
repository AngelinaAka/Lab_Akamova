package bridge;

public class Main {
    public static void main(String[] args) {
        User user = new User(new CarImpl());
        user.toPlane();
    }
}