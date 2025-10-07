import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Rod2pad extends Generator{
    @Override
    public String generate() {
        String s = "";
        Random rn = new Random();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/PodstatnaJmena/PodstatnaJmena2pad"));
            int a = rn.nextInt(46);
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
        return 3;
    }
}
