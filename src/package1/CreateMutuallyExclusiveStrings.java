package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateMutuallyExclusiveStrings {

	private String mutuallyExclusive(String s1, String s2) {
		String op1 = "";
		String op2 = "";
		for(int i=0;i<s1.length();i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i))))
			{
				op1 = op1 + s1.charAt(i);
			}
		}
		for(int j=0;j<s2.length();j++)
		{
			if(!s1.contains(String.valueOf(s2.charAt(j))))
			{
				op2 = op2 + s2.charAt(j);
			}
		}
		String result = op1+","+op2;
		return result;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(mutuallyExclusive("abc", "bc"), "a,");
	}

	@Test
	public void testCase2()
	{
		Assert.assertEquals(mutuallyExclusive("bangalore", "bc"), "angalore,c");
	}

}
