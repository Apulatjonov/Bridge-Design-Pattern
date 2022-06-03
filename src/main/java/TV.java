public class TV implements Device{
    private boolean on = false;
    private int volume = 0;
    private int channel = 1;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int value) {
        volume = value;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int value) {
        channel = value;
    }

    @Override
    public void status() {
        System.out.println("On: " + on + "\n" +
                "Volume: " + volume + "\n" +
                "Channel: " + channel);
    }
}
