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
@Table(name="HOADON")
public class Bill {
	@Id
	@Column(name="MAHOADON")
	private String 	billID;
	@Column(name="LOAIHOADON")
	private String billType;
	@Column(name="SOTIEN")
	private Double billMoney;
	@Column(name="NOIDUNG")
	private String billReason;
	@Column(name="TINHTRANG")
	private String billStatus;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	@Column(name="NGAYGHI")
	private Date billTimeCreate;
	public String getBillID() {
		return billID;
	}
	public void setBillID(String billID) {
		this.billID = billID;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public Double getBillMoney() {
		return billMoney;
	}
	public void setBillMoney(Double billMoney) {
		this.billMoney = billMoney;
	}
	public String getBillReason() {
		return billReason;
	}
	public void setBillReason(String billReason) {
		this.billReason = billReason;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public Date getBillTimeCreate() {
		return billTimeCreate;
	}
	public void setBillTimeCreate(Date billTimeCreate) {
		this.billTimeCreate = billTimeCreate;
	}
	public Bill(String billID, String billType, Double billMoney, String billReason, String billStatus,
			Date billTimeCreate) {
		super();
		this.billID = billID;
		this.billType = billType;
		this.billMoney = billMoney;
		this.billReason = billReason;
		this.billStatus = billStatus;
		this.billTimeCreate = billTimeCreate;
	}
	public Bill() {
		super();
	}
	
	// khoa ngoai
}
