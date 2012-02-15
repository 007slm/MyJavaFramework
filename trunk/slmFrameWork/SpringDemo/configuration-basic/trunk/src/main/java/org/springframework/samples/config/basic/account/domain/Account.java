package org.springframework.samples.config.basic.account.domain;

import static java.lang.String.format;

/**
 * 
 * @author 007slm
 * @account �����ʻ���
 * @id �ʻ�id
 * @balance �ʻ����
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
	 * ȡ��
	 * @param amount
	 */
	public void debit(double amount) {
		balance -= amount;
	}
	
	/**
	 * ���
	 * @param amount
	 */
	public void credit(double amount) {
		balance += amount;
	}
	
	/**
	 * �ʻ�copy�����´����ʻ�
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
