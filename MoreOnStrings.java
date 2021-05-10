
public class MoreOnStrings {
    /**The {@method getFrom(String,int ,int) 
     *    The method returns the part of string from position 1 to Position 2 as specified
     *    by the user.
     *    
     *    @param    String,int,int 
     *    @return   part of the String from @first to @last 
     */    
    public static String getFrom(String st,int first,int last)
    {
        String newSt = "";
        for(int i = first;i<=last;i++)
        {
            newSt = newSt+st.charAt(i);
        }
        return newSt;
    }

    /**The {@method getFrom(String,int ,int) 
     *    The method returns the position of character of string ignoring certain number of 
     *    the same characters present in the String starting from it's first Index(0) as specified
     *    by the user.
     *    
     *    @param    String,char,int 
     *    @return   position of character-->ch in a String ignoring certin no. of same characters starting from inex 0
     */ 

    public static int getPosition(String st,char ch,int noOfToIgnore)
    {
        int noOfPresent = 0;
        for(int i =0;i<st.length();i++)
        {
            if(st.charAt(i)==ch)
                noOfPresent++;  
            if(noOfPresent>noOfToIgnore)
                return i;
        }
        return 0;
    }
}
