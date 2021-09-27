
/**
 * Security reasons.
 * @author   Abhishek Yadav 10C
 * @since    24th September 2021
 */
public interface SimpleHashing {
	/**
	 * For more information see Implementor.
	 * @see Implementor
	 * @param st receives the string to encode.
	 */
	void encodeThis(String st);

	/**
	 * For more information see Implementor
	 * @see Implementor
	 * @param st receives the string to decode.
	 */
	void decodeThis(String st);

}
