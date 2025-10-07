import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Pad4 extends Generator{
    private Random rn = new Random();
    @Override
    public String generate() {
        String s = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/PodstatnaJmena/PodstatnáJména4pád"));
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
        return switch (rn.nextInt(3)) {
            case 0 -> 3;
            case 1 -> 3;
            case 2 -> -1;
            default -> 3;
        };
    }
}

    @Override
    public int nextWord() {
        return switch (rn.nextInt(2)) {
            case 0 -> 3;
            case 1 -> -1;
            default -> 3;
        };
    }
}
