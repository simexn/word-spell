import java.util.Scanner;

public class wordType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word that will be spelled:");

        String word = sc.nextLine();
        sc.close();
        for (int n = 0; n < word.length(); n++) {
            System.out.println(word.charAt(n));
        }
    }
}
