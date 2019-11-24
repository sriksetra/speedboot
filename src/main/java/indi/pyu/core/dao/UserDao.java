package indi.pyu.core.dao;


import indi.pyu.core.model.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

	@Select("select * from sys_user t where t.username = #{username}")
	SysUser getUser(String username);


}
