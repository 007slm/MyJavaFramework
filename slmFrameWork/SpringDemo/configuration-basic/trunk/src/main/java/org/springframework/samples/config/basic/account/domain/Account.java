package org.springframework.samples.config.basic.account.domain;

import static java.lang.String.format;

/**
 * 
 * @author 007slm
 * @account 银行帐户类
 * @id 帐户id
 * @balance 帐户余额
 */
public class Account {

	private final String id;
	
	private double balance;

	public Account(String id, double initialBalance) {
		this.id = id;
		this.balance = initialBalance;
	}

	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	/**
	 * 取款
	 * @param amount
	 */
	public void debit(double amount) {
		balance -= amount;
	}
	
	/**
	 * 存款
	 * @param amount
	 */
	public void credit(double amount) {
		balance += amount;
	}
	
	/**
	 * 帐户copy，重新创建帐户
	 * @param src
	 * @return
	 */
	public static Account copy(Account src) {
		return new Account(src.getId(), src.getBalance());
	}

	@Override
	public String toString() {
		return format("Account: id=%s, balance=%.2f", getId(), getBalance());
	}

}
