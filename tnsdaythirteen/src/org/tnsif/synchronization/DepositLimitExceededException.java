package org.tnsif.synchronization;

public class DepositLimitExceededException extends Exception{
	
	public DepositLimitExceededException() 
        { 
                super("Can't Deposit..Limit is exceeded"); 
        } 
        public DepositLimitExceededException(String message) 
        { 
                super(message); 
        } 
}
