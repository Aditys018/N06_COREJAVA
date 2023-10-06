package org.tnsif.synchronization;

public class InsufficientBalanceException extends Exception{
	public  InsufficientBalanceException  () {
		super("can't deposit, insufficient Balance");
	}
	public  InsufficientBalanceException (String message)
	{
		super(message);
	}
}
