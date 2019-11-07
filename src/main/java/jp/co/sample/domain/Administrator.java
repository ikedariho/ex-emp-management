package jp.co.sample.domain;

/**
 * 管理者情報を表すドメインクラス.
 * administeratorsのテーブルに対応
 * 
 * @author ricim_9ce8dnp
 */
public class Administrator {

	/** ID */
	private Integer id;
	
	/** 名前 */
	private String name;
	
	/** メールアドレス */
	private String mailAddress;
	
	/** パスワード */
	private String password;
	
	

	public Administrator() {
		super();
	}

	public Administrator(Integer id, String name, String mailAddress, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mailAddress = mailAddress;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Administrator [id=" + id + ", name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getMailAddress()=" + getMailAddress()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}