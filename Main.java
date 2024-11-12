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

        ArrayList<String> zero = new ArrayList<String>();
        zero.add("to");
        zero.add("too");
        zero.add("stool");
        zero.add("tools");
        System.out.print(zero);
        WordChecker O = new WordChecker(zero);
        System.out.println(" Is it a chain: " + O.isWordChain());


        ArrayList<String> one = new ArrayList<String>();
        one.add("catch");
        one.add("bobcat");
        one.add("catchacat");
        one.add("cat");
        one.add("at");

        WordChecker w = new WordChecker(one);
        System.out.println(w.createList("cat"));

        WordChecker s = new WordChecker(one);
        System.out.println(s.createList("catch"));

        WordChecker d = new WordChecker(one);
        System.out.println(d.createList("dog"));

        
        

    }
}