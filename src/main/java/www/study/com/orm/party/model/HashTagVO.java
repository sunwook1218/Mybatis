package www.study.com.orm.party.model;

import lombok.Data;

@Data
public class HashTagVO {
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "HashTagVO [id=" + id + ", name=" + name + "]";
	}
	
	
}
