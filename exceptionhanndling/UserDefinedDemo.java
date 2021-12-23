package com.exceptionhanndling;
import java.util.*;

class LowbalanceException extends Exception
{
	public LowbalanceException()
	{
		super("Insufficient balance");
	}
}
class Exceptiontest
{
	public void atm(int m)
	{
		int money=m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw Amount: ");
		int withdraw = sc.nextInt();
		if(money<withdraw)
		{
			try {
				throw new LowbalanceException();
			}
			catch(LowbalanceException e)
			{
				System.out.println("Insufficient balance");
			}
		}
		else
		{
			int remain = money - withdraw;
			System.out.println("Remain Balance: " +remain);
		}
	}
}
public class UserDefinedDemo {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Exceptiontest obj = new Exceptiontest();
		obj.atm(10000);
	}
}
