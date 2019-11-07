package jp.co.sample.form;

/**
 * 従業員情報の更新時に使用するフォーム.
 * 
 * @author riho.ikeda
 *
 */
public class UpdateEmployeeForm {

	/** ID */
	private Integer id;
	/** 扶養人数 */
	private Integer dependentsCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(Integer dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + ", getId()=" + getId()
				+ ", getDependentsCount()=" + getDependentsCount() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
