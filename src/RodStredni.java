import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class RodStredni extends Generator{

    @Override
    public String generate() {
        String s = "";
        Random rn = new Random();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/PodstatnaJmena/zensky"));
            int a = rn.nextInt(5);
            for (int i = 0; i < a; i++) {
                s = bf.readLine();
            }
        } catch (Exception e) {
            System.out.println("mozsky rodFileNenalezen");
        }
        return s;
    }

    @Override
    public int nextWord() {
        return 0;
    }
}
