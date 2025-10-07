import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Spojky extends Generator{
    @Override
    public String generate() {
        String s = "";
        Random rn = new Random();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/Spojky"));
            int a = rn.nextInt(6);
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
        return 7;
    }
}
