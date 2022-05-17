import Remotes.AdvancedRemote;
import Remotes.BasicRemote;
import devices.Device;
import devices.Radio;
import devices.Tv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Comprando un televisor");
        testDevice(new Tv());
        System.out.println("Comprando un radio");
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {

        String StrPremium = "0";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea comprar un control premium ?\n1. Si \n2. No  \n");
        StrPremium = entrada.nextLine();

        if (StrPremium.equals("2")){

            System.out.println("Testeando un control basico.");
            BasicRemote basicRemote = new BasicRemote(device);
            basicRemote.power();
            device.printStatus();

        } else {

            System.out.println("Testeando un control premium.");
            AdvancedRemote advancedRemote = new AdvancedRemote(device);
            advancedRemote.power();
            advancedRemote.channelUp();
            advancedRemote.channelDown();
            advancedRemote.volumeUp();
            advancedRemote.volumeUp();
            advancedRemote.mute();
            device.printStatus();

        }

    }

}
