package LastLetterShuffle;




import java.util.*;
 
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
 
        if (s.matches("[A-Za-z ]+")) {

            String[] words = s.split(" ");

            char[] ch = new char[words.length];
 
            // Collect last characters

            for (int i = 0; i < words.length; i++) {

                ch[i] = words[i].charAt(words[i].length() - 1);

            }
 
            char[] ch1 = ch.clone();

            Arrays.sort(ch1);
 
            if (Arrays.equals(ch, ch1)) {

                // Reverse words if last chars are already sorted

                StringBuilder result = new StringBuilder();

                for (String word : words) {

                    result.append(new StringBuilder(word).reverse().toString()).append(" ");

                }

                System.out.println(result.toString().trim());

            } else {

                // Replace last characters with sorted ones

                StringBuilder result = new StringBuilder();

                for (int i = 0; i < words.length; i++) {

                    String word = words[i];

                    String newWord = word.substring(0, word.length() - 1) + ch1[i];

                    result.append(newWord).append(" ");

                }

                System.out.println(result.toString().trim());

            }

        } else {

            System.out.println(s + " is an invalid sentence");

        }

    }

}
 