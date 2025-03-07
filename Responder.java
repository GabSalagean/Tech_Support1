import java.util.Random;
import java.util.ArrayList;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    private Random randomGenerator;
    private ArrayList<String> responses;
    /**
     * Constructor for objects of class Responder
     */
    public Responder()
    {
        // initialise instance variables
        randomGenerator = new Random();
        responses = new ArrayList<>();
        
        responses.add("nice");
        responses.add("cool");
        responses.add("oh...");
        responses.add("who knows");
    }

    public String getResponse(){
        int index = randomGenerator.nextInt(4);
         if (index == 0 ){
            return "nice";
        } else if (index == 1) {
            return "cool";
        } else if (index == 2){
            return "oh...";
        }  else if (index == 3){
            return "who knows";
        }
        return "";
    }

    public String getBetterResponse(){   
    int index = randomGenerator.nextInt(responses.size());
    return responses.get(index);
    }
}

        



        
        
