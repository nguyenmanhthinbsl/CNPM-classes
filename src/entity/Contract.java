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
@Table(name="HOPDONG")
public class Contract {
	@Id
	@Column(name="MAHOPDONG")
	private String contractID;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	@Column(name="NGAYBATDAU")
	private Date firstDay;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	@Column(name="NGAYKETTHUC")
	private Date lastDay;
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public Date getFirstDay() {
		return firstDay;
	}
	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}
	public Date getLastDay() {
		return lastDay;
	}
	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}
	public Contract(String contractID, Date firstDay, Date lastDay) {
		super();
		this.contractID = contractID;
		this.firstDay = firstDay;
		this.lastDay = lastDay;
	}
	public Contract() {
		super();
	}
	// Khoa ngoai ...
	
}
