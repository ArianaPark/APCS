/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        String input = statement.toLowerCase();
        String chars = input.trim();
        if (input.indexOf(" no ") >= 0)
        {
            response = "Why so negative?";
        }
        else if (input.indexOf("mother") >= 0
        || input.indexOf("father") >= 0
        || input.indexOf("sister") >= 0
        || input.indexOf("brother") >= 0
        || input.indexOf("family")>=0)
        {
            response = "Tell me more about your family.";
        }
        else if (input.indexOf("dog")>=0
        || input.indexOf("cat")>=0
        || input.indexOf("pet")>=0)
        {
            response = "Tell me more about your pet.";
        }
        else if (input.indexOf("mr. ettlin")>=0 || input.indexOf("mr. malloy")>=0){
            response = "He sounds like a good teacher.";
        }
        else if(chars.length()<=0){
            response = "Please type something.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if(whichResponse == 4)
        {
            response = "That sounds cool.";
        }
        else if(whichResponse == 5)
        {
         response = "Wow, that's amazing.";   
        }

        return response;
    }
}
