package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHANQUYEN")
public class Role {
	@Id
	@Column(name="MAPQ")
	private String roleID;
	@Column(name="TENPQ")
	private String roleName;
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role(String roleID, String roleName) {
		super();
		this.roleID = roleID;
		this.roleName = roleName;
	}
	public Role() {
		super();
	}
	
}
