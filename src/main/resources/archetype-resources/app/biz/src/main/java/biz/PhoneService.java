#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.biz;


import ${package}.dal.entity.Phone;

/**
 * Created by edwardsbean on 2015/4/21.
 */
public interface PhoneService {
    public Phone getPhone(long id);

    public int insertPhone(Phone phone);
}
