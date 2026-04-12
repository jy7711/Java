package Interface.InterfaceTest2;

public class Main {

    static void main() {
        PingPongSporter pps = new PingPongSporter("刘诗雯", 23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }

}
