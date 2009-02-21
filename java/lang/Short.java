package java.lang;

/**
 * Wrapper class for shorts.
 * @author Sven Köhler
 */
public final class Short extends Number
{
	public static final short MAX_VALUE = 32767;
	public static final short MIN_VALUE = -32768;
	public static final int SIZE = 16;
	
	//MISSING public static final Class TYPE
	//MISSING public static Short decode(String)
	
	private final short value;
	
	public Short(short value)
	{
		this.value = value;
	}
	
	public Short(String s)
	{
		this.value = Short.parseShort(s);
	}

	public byte byteValue()
	{
		return (byte)this.value;
	}
	
	public int compareTo(Object o)
	{
		Short ob = (Short)o;
		if (this.value == ob.value)
			return 0;
		
		return (this.value > ob.value) ? 1 : -1;
	}

	public double doubleValue()
	{
		return this.value;
	}
	
	public boolean equals(Object o)
	{
		//instanceof returns false for o==null
		return (o instanceof Short)
			&& (this.value == ((Short)o).value);
	}

	public float floatValue()
	{
		return this.value;
	}
	
	public int hashCode()
	{
		return this.value;
	}

	public int intValue()
	{
		return this.value;
	}

	public long longValue()
	{
		return this.value;
	}
	
	public static short parseShort(String s) throws NumberFormatException
	{
		return Short.parseShort(s, 10);
	}
	
	public static short parseShort(String s, int radix) throws NumberFormatException
	{
		int tmp = Integer.parseInt(s, radix);
		if (tmp < Short.MIN_VALUE || tmp > Short.MAX_VALUE)
			throw new NumberFormatException("number is too big");
		
		return (short)tmp;
	}
	
	public static short reverseBytes(short s)
	{
		int i = s & 0xFFFF;
		return (short)((i >>> 8) | (i << 8));
	}

	public short shortValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return Short.toString(this.value);
	}
	
	public static String toString(short b)
	{
		return Integer.toString(b);
	}
	
	public static Short valueOf(short b)
	{
		return new Short(b);
	}
	
	public static Short valueOf(String s)
	{
		return Short.valueOf(s, 10);
	}
	
	public static Short valueOf(String s, int radix)
	{
		return Short.valueOf(Short.parseShort(s, radix));
	}
}
