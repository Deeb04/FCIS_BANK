package FK_Lib;

import java.io.IOException;

public class clsUtil {

    public static void Clear() {
        try {

            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }

        } catch (IOException | InterruptedException ex) {
        }
    }
}