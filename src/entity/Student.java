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
@Table(name="SINHVIEN")
public class Student {
	@Id
	@Column(name="MASV")
	private String studentID;
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
	@Column(name="SDT")
	private Integer phoneNumber;
	@Column(name="GIOITINH")
	private String gender;
	@Column(name="QUEQUAN")
	private String homeAddress;
	@Column(name="LOP")
	private String className;
	@Column(name="NGANH")
	private String major;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
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
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Student(String studentID, String firstName, String midName, String lastName, Date dateOfBirth,
			Integer phoneNumber, String gender, String homeAddress, String className, String major) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.homeAddress = homeAddress;
		this.className = className;
		this.major = major;
	}
	public Student() {
		super();
	}
	
	
}
