/**
 * The class is responsible for encoding and decoding text.
 * @author   Abhishek Yadav 10C
 * @since    24th September 2021
 */
public abstract class Implementor extends CODE implements SimpleHashing {
    /**
     * Encodes a given String in UNICODE characters and then display 
     * the encoded string.All characters (0-65535) are accepted . Each character is represented in
     * HEXADECIMAL form .
     * Since Hexadecimal Numbers cannot be printed directly ,
     * initiative 
     * has been taken to Convert the given number in HEXADECIMAL form in String format
     * with the Help of {@code Convert}
     * which is a subclass within the {@code StringEncoderAndDecoder} {@see StringEncoderAndDecoder}
     * having an OVERLOADED function getHex(int/char) to convert each 
     * individual fundamental
     * digits of HexadecimalNumber. Another method of the {@code Convert}
     * {@code convertToHex(int)} converts an integer no. to Hexadecimal Number.
     * 
     * @param st To receive the string to be encoded.
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
     * Decodes the string provided by {@code toEncode(String)} to normal string
     * 
     * (The most difficult part of the program!!)
     * 
     * {@code toDecode(String)} first tries to break the sentence parts into each character and then
     * convert it into Decimal Number System from its hexadecimal form by{@code parseIntHex()}.
     * The {@code toDecode(String) } may run for INFINITY in case of string entered in wrongFormat
     * Special care must be taken not to enter string in wrong format!!!
     * 
     * @param   st To receive the string to be decoded.
     */
    public void decodeThis(String st)
    {
        int length = st.length();
        int first;
        int last;
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
