package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="NHANVIEN")
public class User {
	@Id
	@Column(name="MANV")
	private Integer userID;
	@Column(name="HO")
	private String firstName;
	@Column(name="TENDEM")
	private String midName;
	@Column(name="TEN")
	private String lastName;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	@Column(name="NGAYSINH")
	private Date dateOfBirth;
	@Column(name="CMND")
	private String CMND;
	@Column(name="SDT")
	private Integer phoneNumber;
	@Column(name="GIOITINH")
	private String gender;
	@Column(name="DIACHI")
	private String address;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(Integer userID, String firstName, String midName, String lastName, Date dateOfBirth, String cMND,
			Integer phoneNumber, String gender, String address) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		CMND = cMND;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.address = address;
	}
	public User() {
		super();
	}
	// khóa ngoại n - 1 mã phân quyền
	
	
}
