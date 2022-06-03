public class RemoteController implements Remote{
    private Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        device.setVolume(device.getChannel() - 10);
    }

    @Override
    public void channelUp() {
        device.setVolume(device.getChannel() + 10);
    }
}
