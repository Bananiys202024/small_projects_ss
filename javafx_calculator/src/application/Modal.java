package application;

public class Modal {

	public float calculate(long number1, long number2, String operator)
	{
		if(operator.equals("+"))
		{
			return number1+number2;
		}
		
		if(operator.equals("-"))
		{
			return number1-number2;
		}
		
		if(operator.equals("*"))
		{
			return number1*number2;
		}
		
		if(operator.equals("/"))
		{
			if(number1==0 || number2==0)
			return 0;
			
			return (float) number1/number2;
		}
		
		return 0;
	}
}
