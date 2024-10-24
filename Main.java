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
        WordChecker w = new WordChecker(one);
        System.out.println(w.isWordChain());
        System.out.println(w.createList("cat"));

        //test2

        WordChecker s = new WordChecker(one);
        System.out.println(s.isWordChain());
        System.out.println(s.createList("catch"));

        //test3

        WordChecker d = new WordChecker(one);
        System.out.println(d.isWordChain());
        System.out.println(d.createList("dog"));

        
        

    }
}