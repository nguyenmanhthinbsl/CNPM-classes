package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAIKHOAN")
public class Account {
	@Id
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String pwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Account(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}
	public Account() {
		super();
	}
	// Khóa Ngoại
}
