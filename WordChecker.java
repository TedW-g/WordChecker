import java.util.ArrayList;

public class WordChecker
{
    private ArrayList<String> wordList;

    public boolean isWordChain()
    {
        boolean wordChain = true;
        for (int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);
            if(after.indexOf(before) < 0) return false;
        }
        return true;
    }

    public ArrayList<String> createList(String target)
    {
        ArrayList<String> list = new ArrayList<String>();
        for (String s : wordList)
        {
            if(s.indexOf(target) == 0)
            {
                list.add(s.substring(target.length()));
            }
        }
        return list;
    }

    public WordChecker(ArrayList<String> list)
    {
        wordList = new ArrayList<String>();
    }
}