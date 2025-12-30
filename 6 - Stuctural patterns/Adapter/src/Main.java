
class UsbAMouse {
    public void connectWithUsbA() {
        System.out.println("Miska podklucena cerez USB A");
    }
}

interface UsbC {
    void connectWithUsbC();
}

class UsbAdapter implements UsbC {
    private UsbAMouse mouse;

    public UsbAdapter(UsbAMouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void connectWithUsbC() {
        System.out.println("Adapter preobrazuet USB-A -> USB-C");
        mouse.connectWithUsbA();
    }
}
class Laptop {
    public void pluginInUsbC(UsbC device) {
        device.connectWithUsbC();
    }
}

public class Main {
    public static void main(String[] args) {
        UsbAMouse oldMouse = new UsbAMouse();
        UsbC adapter = new UsbAdapter(oldMouse);

        Laptop laptop = new Laptop();
        laptop.pluginInUsbC(adapter);
    }
}
