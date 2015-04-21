#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal;


import ${package}.dal.entity.Phone;

/**
 * Created by edwardsbean on 2015/4/20 0020.
 */
public interface PhoneDao {
    public void insert(Phone phone);

    public Phone getPhone(long id);
}
