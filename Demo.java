import java.io.BufferedReader;
import java.io.InputStreamReader;

class Demo {
    public static void main(String[] args) throws Exception {
        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println("Number: " + num);
            System.out.println("This simply demo file");
        }

    }
}