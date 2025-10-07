import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class PodMuzsky extends Generator {

    @Override
    public String generate() {
        String s = "";
        Random rn = new Random();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/PodstatnaJmena/muzsky"));
            int a = rn.nextInt(36);
            for (int i = 0; i < a; i++) {
                s = bf.readLine();
            }
        } catch (Exception e) {
            System.out.println("404 not found");
        }
        return s;
    }

    @Override
    public int nextWord() {
        return 3;
    }
}
