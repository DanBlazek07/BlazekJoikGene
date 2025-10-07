import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Slovesa extends Generator {
    private Random rn = new Random();


    @Override
    public String generate() {
        String s = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/Slovesa"));
            int a = rn.nextInt(13);
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
        return switch (rn.nextInt(6)) {
            case 0 -> 8;
            case 1 -> -1;
            case 2 -> 9;
            default -> 8;
        };
    }
}
