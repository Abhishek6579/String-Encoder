/**
 * The class contains different useful string methods used in the package.
 * @author Abhishek Yadav 10C
 * @since 26th September 2021.
 */
public class MoreOnStrings {
    /**
     * The getFrom(String,int ,int)
     *    The method returns the part of string from position 1 to Position 2 as specified
     *    by the user both inclusive.
     *    
     *    @param    st To receive the string of which the part has to be returned.
     *    @param    first To receive the index value from which the part of the string has to be returned.
     *    @param    last To receive the index till which the part of the string has to be returned.
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

    /**
     * The getFrom(String,int ,int)
     *    The method returns the position of character of string ignoring certain number of 
     *    the same characters present in the String starting from it's first Index(0) as specified
     *    by the user.
     *    
     *    @param    st To receive the string in which the character the has to be searched.
     *    @param    ch To receive the character to be searched in the given string.
     *    @param    noOfToIgnore To receive the no. of the same characters to be ignored in the string.
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
