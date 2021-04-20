package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DAYNHA")
public class Block {
	@Id
	@Column(name="MADAYNHA")
	private String BlockID;
	@Column(name="TENDAYNHA")
	private String blockName;
	@Column(name="SOLUONGPHONG")
	private Integer totalRoomOfBlock;
	public String getBlockID() {
		return BlockID;
	}
	public void setBlockID(String blockID) {
		BlockID = blockID;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public Integer getTotalRoomOfBlock() {
		return totalRoomOfBlock;
	}
	public void setTotalRoomOfBlock(Integer totalRoomOfBlock) {
		this.totalRoomOfBlock = totalRoomOfBlock;
	}
	public Block(String blockID, String blockName, Integer totalRoomOfBlock) {
		super();
		BlockID = blockID;
		this.blockName = blockName;
		this.totalRoomOfBlock = totalRoomOfBlock;
	}
	public Block() {
		super();
	}
	
	
}
