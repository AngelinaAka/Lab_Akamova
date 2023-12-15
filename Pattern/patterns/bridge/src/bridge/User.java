package bridge;

public class User {
    private UserImpl realUser;
    public User(UserImpl impl)
    {
        realUser = impl;
    }
    public void toPlane()
    {
        realUser = new CarImpl();
        realUser.drive();
    }
    public void toCar()
    {
        realUser = new PlaneImpl();
        realUser.fly();
    }

}