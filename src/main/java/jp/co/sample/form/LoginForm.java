package jp.co.sample.form;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author riho.ikeda
 *
 */
public class LoginForm {
	/** メールアドレス */
	private String mailAddress;

	/** パスワード */
	private String password;

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
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + ", getMailAddress()="
				+ getMailAddress() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}