package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Employee;
import jp.co.sample.repository.EmployeeRepository;

/**
 * 従業員関連機能の業務処理を行うサービス.
 * 
 * @author riho.ikeda
 *
 */
@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * 従業員一覧情報を入社日順で取得する.
	 * 
	 * @return 全従業員一覧情報
	 */
	public List<Employee> showList() {

		return employeeRepository.findAll();
	}

	/**
	 * 従業員情報を取得.
	 * 
	 * @param id ID
	 * @return 従業員詳細
	 */
	public Employee showDetail(Integer id) {
		return employeeRepository.lode(id);

	}

	/**
	 * 従業員情報を更新.
	 * 
	 * @param employee 従業員情報
	 */
	public void update(Employee employee) {
		employeeRepository.update(employee);

	}

}
