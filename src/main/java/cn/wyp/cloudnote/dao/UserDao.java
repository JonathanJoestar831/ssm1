package cn.wyp.cloudnote.dao;

import java.util.Map;

public interface UserDao {
	Map<String,Object> findUserById(String userId);
	//remote
}
