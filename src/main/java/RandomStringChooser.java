import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> words;

  public RandomStringChooser(String[] meep)
  {
    words = new ArrayList<String>();
    for(String w : meep)
        words.add(w);
}

public String getNext(){
  if(words.size() == 0)
      return "NONE";
  int i = (int)(Math.random()* words.size());
  return words.remove(i);
}
}
