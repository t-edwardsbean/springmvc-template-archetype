#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal;

import ${package}.dal.entity.Phone;
import ${package}.dal.m${parentArtifactId}er.auto.PhoneM${parentArtifactId}er;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by edwardsbean on 2015/4/20 0020.
 */
@Repository("phoneDao")
public class PhoneDaoImpl implements PhoneDao {
    @Autowired
    PhoneM${parentArtifactId}er phoneM${parentArtifactId}er;

    @Override
    public void insert(Phone phone) {
        phoneM${parentArtifactId}er.insert(phone);
    }

	@Cacheable(value = "phone", key = "T(java.lang.Long).toString(#id)")
    @Override
    public Phone getPhone(long id) {
        return phoneM${parentArtifactId}er.selectByPrimaryKey(id);
    }
}
