package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="THIETBI")
public class Device {
	@Id
	@Column(name="MATB")
	private String deviceID;
	@Column(name="TENTB")
	private String deviceName;
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public Device(String deviceID, String deviceName) {
		super();
		this.deviceID = deviceID;
		this.deviceName = deviceName;
	}
	public Device() {
		super();
	}
	
}
