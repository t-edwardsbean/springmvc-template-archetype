#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.biz;

import ${package}.dal.PhoneDao;
import ${package}.dal.entity.Phone;
import ${package}.dal.m${parentArtifactId}er.auto.PhoneM${parentArtifactId}er;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by edwardsbean on 2015/4/21.
 */
@Repository("phoneService")
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    PhoneDao phoneDao;

    @Autowired
    PhoneM${parentArtifactId}er phoneM${parentArtifactId}er;

    @Override
    public Phone getPhone(long id) {
        return phoneDao.getPhone(id);
    }

    @Override
    public int insertPhone(Phone phone) {
        return phoneM${parentArtifactId}er.insert(phone);
    }


}
