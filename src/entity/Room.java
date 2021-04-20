package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHONG")
public class Room {
	@Id
	@Column(name="MAPHONG")
	private String roomID;
	@Column(name="LOAIPHONG")
	private String	roomType;
	// khóa ngoại MÃ Dãy
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Room(String roomID, String roomType) {
		super();
		this.roomID = roomID;
		this.roomType = roomType;
	}
	public Room() {
		super();
	}
	
}
