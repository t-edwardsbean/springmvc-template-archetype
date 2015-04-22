#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import ${package}.dal.PhoneDao;
import ${package}.dal.entity.Phone;
import ${package}.dal.m${parentArtifactId}er.auto.PhoneM${parentArtifactId}er;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/${rootArtifactId}-base.xml","classpath*:META-INF/spring/${rootArtifactId}-dal-db.xml","classpath*:META-INF/spring/${rootArtifactId}-dal.xml"})
public class PhoneDaoTest {
    @Autowired
    PhoneDao phoneDao;

    @Autowired
    PhoneM${parentArtifactId}er m${parentArtifactId}er;

    @Test
    public void testInsert() throws Exception {
        Phone phone = new Phone();
        phone.setContent("this is a content");
        phoneDao.insert(phone);
    }

    @Test
    public void testMapperInsert() throws Exception {
        Phone phone = new Phone();
        phone.setContent("this i2s a content");
        m${parentArtifactId}er.insert(phone);
    }
	
	@Test
    public void testM${parentArtifactId}erSelect() throws Exception {
        System.out.println(m${parentArtifactId}er.selectByPrimaryKey(1L));
    }
}