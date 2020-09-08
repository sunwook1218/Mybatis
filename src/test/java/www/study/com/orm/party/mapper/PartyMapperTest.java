package www.study.com.orm.party.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.study.com.orm.party.mapper.PartyMapper;
import www.study.com.orm.party.model.ContactPointVO;
import www.study.com.orm.party.model.HashTagVO;
import www.study.com.orm.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PartyMapperTest {
	@Autowired
	private PartyMapper mapper;

	@Test
	public void testGetAll() {
		try {
			System.out.println("testGetAll()");
			List<PartyVO> listSimple = mapper.getAll();
			for (PartyVO simple : listSimple) {
				System.out.println(simple);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllWithContactPoint() {
		try {
			System.out.println("testGetAllWithContactPoint()");
			List<PartyVO> listSimple = mapper.getAllWithContactPoint();
			for (PartyVO simple : listSimple) {
				System.out.println(simple);
				for (ContactPointVO cp : simple.getListContactPoint()) {
					System.out.println(cp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllWithContactPointWithoutLoss() {
		try {
			System.out.println("testGetAllWithContactPointWithoutLoss()");
			List<PartyVO> listSimple = mapper.getAllWithContactPointWithoutLoss();
			for (PartyVO simple : listSimple) {
				System.out.println(simple);
				for (ContactPointVO cp : simple.getListContactPoint()) {
					System.out.println(cp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllWithContactPointWithoutLossAndPersonalService() {
		try {
			System.out.println("testGetAllWithContactPointWithoutLossAndPersonalService()");
			List<PartyVO> listSimple = mapper.getAllWithContactPointWithoutLossAndPersonalService();
			for (PartyVO simple : listSimple) {
				System.out.println(simple);
				for (HashTagVO tag : simple.getListHashTag()) {
					System.out.println(tag);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
