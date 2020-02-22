import java.util.*;


public class LongestWord
{
    //longestString method to return the longest string in the sentence
    //Input parameters @input

    /*Return values of type Hashmap<Integer,String>
    where Integer represents the type for length of string
    and String represents the type for longest string*/

    public static HashMap<Integer,String> longestString(String input)
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        String result = new String();
        StringTokenizer t = new StringTokenizer(input);
        int maxLength =0; // a variable to keep track of length
        while(t.hasMoreTokens())
        { 
            String getToken=t.nextToken(); 
            int len =getToken.length();
            if(len>maxLength) 
            {
                /* setting the maximum length to len if length 
                 of currect token is greater than maxLength*/
                 maxLength=len; 
                 result=getToken; //setting result string to current string
            }
        }
        
        //adding maxLength as key and result as value to hash map
        map.put(maxLength, result);
        return map;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Taking input string from user
        System.out.println("Enter string:"); 
        String inputString= sc.nextLine();   
        
        HashMap<Integer,String> res = longestString(inputString);
        System.out.println(res);

        sc.close(); //closing scanner object
    }

    
}

