package Remotes;

import devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Tecla Premium: mute - verificada");
        device.setVolume(0);
    }
}
