import java.util.ArrayList;

public class WordChecker
{
    private ArrayList<String> wordList;

    public boolean isWordChain()
    {
        for (int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);
            if(after.indexOf(before) < 0) 
            {
                return false; 
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target)
    {
        ArrayList<String> list = new ArrayList<>();
        for (String b : wordList)
        {
            if(b.indexOf(target) == 0)
            {
                list.add(b.substring(target.length()));
            }
        }
        return list;
    }

    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }
}