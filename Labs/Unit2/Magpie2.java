import java.lang.Math;

public class Magpie2
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()        
    {
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);          // revise this assignment statement      
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";

        } else if (whichResponse == 4){
            response = "How does that make you feel?";

        } else if (whichResponse == 5){
            response = "Can you eleborate?";
        } 
        return response;
    }
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = ""; 
        
        if (statement.indexOf("math") != -1){
            response = "I go to math after lunch.";

        } else if (statement.indexOf("science") != -1){
            response = "Is that your favorite class?";

        } else if (statement.indexOf("Topsail") != -1){
            response = "I loved my time at Topsail!";

        } else if (statement.indexOf("pancake") != -1){
            response = "I got to say I do love myself some pancakes.";

        }else{
            response = getRandomResponse();  
        }
             
        return response;
    }
}