import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

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
    private HashMap<String,String> responses;
    //private Answer;
    /**
     * Constructor for objects of class Responder
     */
    public Responder()
    {
        // initialise instance variables
    responses = new HashMap<>();
    fillResponsesMap();
}

    private void fillResponsesMap(){
        responses.put("crash","try to reboot your computer");
        responses.put("slow", "try to close some other apps");
        responses.put("froze", "try to reboot your computer");
    }
    private String pickDefaultResponse(){
        return "no idea sorry";
    }

    //public String generateBetterResponse(String word){   
   // if (answer==null) {
   //     answer= pickDefaultResponse();
    //}
    //return answer;
   // }
}

        



        
        
