import multi.util.*;

public class MultiStdout {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            PrintThread t = new PrintThread(i);
            t.run();
        }
    }
}
