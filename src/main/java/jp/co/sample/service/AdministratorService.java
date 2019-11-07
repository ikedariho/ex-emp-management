package jp.co.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Administrator;
import jp.co.sample.repository.AdministratorRepository;

/**
 * 管理者関連機能の業務処理を行うサービス.
 * 
 * @author ricim_9ce8dnp
 *
 */
@Service
@Transactional
public class AdministratorService {
	@Autowired
	private AdministratorRepository administratorRepository;

	/**
	 * 管理者情報を挿入.
	 * 
	 * @param administrator 管理者情報
	 */
	public void insert(Administrator administrator) {
		administratorRepository.insert(administrator);

	}
	
	/**
	 * ログイン処理をする.
	 * 
	 * @param mailAddress メールアドレス
	 * @param password　パスワード
	 * @return　管理者情報
	 */
	public Administrator login(String mailAddress,String password) {
		return	administratorRepository.findByMailAdressAndPassword(mailAddress, password);
		 
		
	}

}
