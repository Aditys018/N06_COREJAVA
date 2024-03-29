
package org.tnsif.synchronization;

public interface Bank {
	int DEPOSIT_LIMIT = 25000;
	static final int MINIMUM_BALANCE = 1000;

	void deposit(int amount) throws DepositLimitExceededException;

	public abstract void withdraw(int amount) throws InsufficientBalanceException;
}