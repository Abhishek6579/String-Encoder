
public abstract class Implementor extends CODE implements SimpleHashing {
    /**
     * Encodes a given String in UNICODE characters and then display 
     * the encoded string.All characters (0-65535) are accepted . Each character is represented in
     * HEXADECIMAL form .
     * Since Hexadecimal Numbers cannot be printed directly ,
     * initiative 
     * has been taken to Convert the given number in HEXADECIMAL form in String format
     * with the Help of {@class Convert}
     * which is a subclass within the 
     * @main class StringEncoderAndDecoder
     * having an OVERLOADED function getHex(int/char) to convert each 
     * individual fundamental
     * digits of HexadecimalNumber. Another method of the {@class Convert} 
     * {@method convertToHex(int)} converts an integer no. to Hexadecimal Number.
     * 
     * @param   String
     */
    public void encodeThis(String st)
    {
        int l = st.length();
        for(int i = 0;i<l;i++)
        {
            char ch = st.charAt(i);
            System.out.print(convertToHex(ch));
        }
    }

    /**
     * Decodes the string provided by {@method toEncode(String)} to normal string
     * 
     * (The most difficult part of the program!!)
     * 
     * {@method toDecode(String)} first tries to break the sentence parts into each character and then 
     * convert it into Decimal Number System from its hexadecimal form by{@method parseIntHex()}.
     * The {@method toDecode(String) } may run for INFINITY in case of string entered in wrongFormat 
     * Special care must be taken not to enter string in wrong format!!!
     * 
     * @param   String
     */
    public void decodeThis(String st)
    {
        int length = st.length();
        int first = 0;
        int last = 0;
        int ignore = 0;
        String numberString = "";
        while(true)
        {            
            first = MoreOnStrings.getPosition(st,'x',ignore);
            last = MoreOnStrings.getPosition(st,'x',ignore+1);
            if(first==0)
                break;
            else
            {
                if(last>1)
                    numberString = MoreOnStrings.getFrom(st,first-1,last-2);
                else if(last==0)
                    numberString = MoreOnStrings.getFrom(st,first-1,length-1);
                ignore++;
                System.out.print((char)parseIntHex(numberString));
            }
        }
    }
}
