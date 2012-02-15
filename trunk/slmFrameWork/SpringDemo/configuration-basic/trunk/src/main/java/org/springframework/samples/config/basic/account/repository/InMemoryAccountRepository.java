package org.springframework.samples.config.basic.account.repository;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.samples.config.basic.account.domain.Account;

/**
 * ���ڴ���ʻ���Դ��Ҳ�����Ѿ������ݿ��л�õ�վ����Ϣ��Դ�⣩
 * 
 * �����е�ƫ����DAO��Service���м���
 *  ������  ӵ��dao�Ƚ�ϸ�����ݷ��� 
 *  û��service�����ȵ�ҵ���������������ת���ǣ�
 * @author 007slm
 * @attention ��������Account.copy��ʹ��
 */
public class InMemoryAccountRepository implements AccountRepository {
	/**
	 * �ʻ�Map
	 */
	private final Map<String, Account> accountsById = new HashMap<String, Account>();
	
	/**
	 * ͨ���ʻ���ѯ�ʻ���Ϣ������һ�����ʻ���ͬ��Ϣ�Ĳ����޸�ԭʼ���ݵ�copy
	 * @attention ���ص����û���ʵ�ʻ���copy����Ϊ���ǲ�ѯ������updata���������Է�ֹ�ѵײ�api�ṩ���ϲ��û�����������������
	 */
	public Account findById(String acctId) {
		return Account.copy(accountsById.get(acctId));
	}
	
	/**
	 * ���������ʻ���Ϣ
	 * @attention ͬ����Ҳ���޸��ڴ��������ʻ���Ϣ�����ǲ������û����������ʻ�ֱ�ӷŵ��ڴ�����棬��ֹ���û��ȺϷ����£�Ȼ��ͨ����֤���ٷǷ�����
	 */
	public void update(Account account) {
		if (!accountsById.containsKey(account.getId()))
			throw new IllegalArgumentException("account [" + account.getId() + "] not found");
		accountsById.put(account.getId(), Account.copy(account));
	}
	
    /**
     * �������ʻ��ʻ�
     */
 	public void add(Account account) {
		if (accountsById.containsKey(account.getId()))
			throw new IllegalArgumentException("account [" + account.getId() + "] already exists");
		
		accountsById.put(account.getId(), Account.copy(account));
	}

 	/**
 	 * ��ѯ����ʻ�	
 	 */
	public Set<Account> findAll() {
		HashSet<Account> allAccounts = new HashSet<Account>();
		for (Account account : accountsById.values())
			allAccounts.add(Account.copy(account));
		return allAccounts;
	}

}
