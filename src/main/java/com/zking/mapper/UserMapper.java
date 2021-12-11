package com.zking.mapper;

import com.zking.model.User;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*
    * 根据用户输入的账号得到用户的具体信息
    * */
    public User selectByUserName(String username);

    /**
     * 根据用户名获取到用户的角色信息
     */
    public Set<String> getRoleByUserName(String username);

    public Set<String> getPermissionByUserName(String username);

    List<User> list();
}