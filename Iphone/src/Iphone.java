public class Iphone implements MusicPlayer, CellPhone, Browser {

    @Override
    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adding new page");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void accept() {
    System.out.println("Accepting call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting Voice Mail");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Playing music: " + music);
    }
    
}