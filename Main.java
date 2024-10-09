import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        WordChecker w = new WordChecker(words);
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.print(words);
    }
}