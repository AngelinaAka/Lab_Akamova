package adapter;

public class Main {
    public static void main(String[] args) {
        Usb typeCAdapter = new TypeCAdapter(new TypeC());
        typeCAdapter.usbConnect();

        TypeC usbAdapter = new UsbAdapter(new Usb());
        usbAdapter.typeCConnect();
    }
}