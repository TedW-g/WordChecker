import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.print(words);
        WordChecker x = new WordChecker(words);
        System.out.println(" Is it a chain: " + x.isWordChain());
        System.out.println(x.createList("a"));

        //test1

        ArrayList<String> one = new ArrayList<String>();
        one.add("catch");
        one.add("bobcat");
        one.add("catchacat");
        one.add("cat");
        one.add("at");

        
        

    }
}