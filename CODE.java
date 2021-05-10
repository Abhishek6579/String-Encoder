
public abstract class CODE {
    protected final int getHex(char ch) {
        final char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) 
                return i;
        }
        return 0;
    }

    protected final char getHex(int num) {
        final char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < arr.length; i++) {
            if (num == i) 
                return arr[i];
        }
        return '\u0000';
    }

    protected final String convertToHex(int num)
    {
        int digit = 0;
        String st = "";
        while(num>0)
        {
            digit = num%16;
            num = num/16;

            st = getHex(digit)+st;

        }
        if(st.length()==1)
            return "0x000"+st;
        if(st.length()==2)
            return "0x00"+st;
        if(st.length()==3)
            return "0x0"+st;
        return "0x"+st;
    }

    protected int parseIntHex(String st) 
    {
        int num = 0;
        int power = 0;
        int digit = 0;
        int l = st.length() - 1;
        char ch;
        while (true) {
            if (st.charAt(l) == 'x') 
                break;
            ch = st.charAt(l);
            digit = getHex(ch);
            num = num + (int) Math.pow(16, power) * digit;
            l--;
            power++;
        }
        return num;
    }

}
