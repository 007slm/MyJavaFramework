package org.springframework.samples.config.basic.account.repository;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.samples.config.basic.account.domain.Account;

/**
 * 在内存的帐户资源（也就是已经从数据库中获得的站户信息资源库）
 * 
 * 本类有点偏向有DAO和Service的中间层次
 *  缓存层次  拥有dao比较细的数据访问 
 *  没有service大粒度的业务操作方法（比如转账是）
 * @author 007slm
 * @attention 这里所有Account.copy的使用
 */
public class InMemoryAccountRepository implements AccountRepository {
	/**
	 * 帐户Map
	 */
	private final Map<String, Account> accountsById = new HashMap<String, Account>();
	
	/**
	 * 通过帐户查询帐户信息，返回一个和帐户相同信息的不能修改原始数据的copy
	 * @attention 返回的是用户真实帐户的copy，因为这是查询，不是updata，这样可以防止把底层api提供后上层用户随意更改里面的数据
	 */
	public Account findById(String acctId) {
		return Account.copy(accountsById.get(acctId));
	}
	
	/**
	 * 更新已有帐户信息
	 * @attention 同样的也是修改内存池里面的帐户信息，但是不能用用户传过来的帐户直接放到内存池里面，防止有用户先合法更新，然后当通过验证后，再非法更新
	 */
	public void update(Account account) {
		if (!accountsById.containsKey(account.getId()))
			throw new IllegalArgumentException("account [" + account.getId() + "] not found");
		accountsById.put(account.getId(), Account.copy(account));
	}
	
    /**
     * 创建新帐户帐户
     */
 	public void add(Account account) {
		if (accountsById.containsKey(account.getId()))
			throw new IllegalArgumentException("account [" + account.getId() + "] already exists");
		
		accountsById.put(account.getId(), Account.copy(account));
	}

 	/**
 	 * 查询多个帐户	
 	 */
	public Set<Account> findAll() {
		HashSet<Account> allAccounts = new HashSet<Account>();
		for (Account account : accountsById.values())
			allAccounts.add(Account.copy(account));
		return allAccounts;
	}

}
