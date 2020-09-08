package www.study.com.orm.party.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public abstract class PartyVO {
	private int id;
	private String name;
	private Date birthDate;
	
	/** 연락처 목록(1:N - 나에게 여러 개가 있습니다.) */
	private List<ContactPointVO> listContactPoint;
	
	/** 개인화 서비스 처리 용도 목록(N:M - 나에게 여러 개가 있습니다. 그런데 너에게도 여러개가 있습니다. 따라서 중간 매개 테블도 있어요) */
	private List<HashTagVO> listHashTag;
	
	public List<ContactPointVO> getListContactPoint() {
		return listContactPoint;
	}

	public List<HashTagVO> getListHashTag() {
		return listHashTag;
	}
	
	@Override
	public String toString() {
		return "PartyVO [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
