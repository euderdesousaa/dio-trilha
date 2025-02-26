public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.play();
        iphone.selectMusic("I can Make You Dance - Zapp");
        iphone.call("9999-9999");
        iphone.openURL("www.google.com");
    }
}