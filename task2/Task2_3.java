import java.io.IOException;
public class Task2_3 {
    public static String VOWELS = "aeiouAEIOU";
    public static void main(String[] args) throws IOException
    {
        char c = 0;
        while(true)
        {
            c = (char) System.in.read();
            if (Character.isAlphabetic(c))
                System.out.println(VOWELS.indexOf(c) != -1 ? "vowel" : "consonant");
        }
    }
}
