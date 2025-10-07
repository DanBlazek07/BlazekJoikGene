import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class PridJmena extends Generator{
    Random rn = new Random();
    @Override
    public String generate() {

        String s = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/pridJmenaMuz"));
            int a = rn.nextInt(15);
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
        return switch (rn.nextInt(2)) {
            case 0 -> 0;
            case 1 -> -1;
            default -> 0;
        };
    }
}
