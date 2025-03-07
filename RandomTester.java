import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
        responses = new ArrayList<>();
        
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("New random number: " + randomGenerator.nextInt(1000)); 
  }
    
      public void printMultiRandom(int howMany ){
          int index = 0;
      while (index < howMany){
          System.out.println("New random number [" + (index+1) + "]: " + randomGenerator.nextInt(1000));
          index++;
      }
        }
    
    public String getResponse(){
        int index = randomGenerator.nextInt(3);
        
        if (index == 0 ){
            return "yes";
        } else if (index == 1) {
            return "no";
        } else {
            return "maybe";
        }
        }
        
    public String getBetterResponse(){   
    int index = randomGenerator.nextInt(responses.size());
    return responses.get(index);
}

}
    


