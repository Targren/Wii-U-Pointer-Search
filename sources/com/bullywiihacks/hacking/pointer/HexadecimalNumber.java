package com.bullywiihacks.hacking.pointer;

/**
 * An utility class for representing numbers as hexadecimal and easy sign checking
 */
public class HexadecimalNumber
{
	private String value;
	private boolean sign;

	public HexadecimalNumber(int number)
	{
		if(number >= 0)
		{
			value = toHexadecimal(number);
		}
		else
		{
			value = toHexadecimal(Math.abs(number));
			sign = true;
		}
	}

	private String toHexadecimal(int number)
	{
		return Integer.toHexString(number).toUpperCase();
	}

	public boolean isNegative()
	{
		return sign;
	}

	@Override
	public String toString()
	{
		if(sign)
		{
			return "- " + value;
		}
		else
		{
			return value;
		}
	}
}