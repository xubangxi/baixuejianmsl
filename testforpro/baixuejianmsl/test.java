package baixuejianmsl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	private paqiuligo p=null;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		p=new paqiuligo();
		assertEquals("�ȱ�",p.checkiftri(2, 2, 2));
		assertEquals("����",p.checkiftri(2, 3, 3));
		assertEquals("ɶҲ����",p.checkiftri(5, 2, 1));
		
	}

}
