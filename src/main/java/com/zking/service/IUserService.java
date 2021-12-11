package com.zking.service;

import com.zking.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface IUserService {
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

    public Set<String> getRoleByUserName(String username);

    public Set<String> getPermissionByUserName(String username);

    List<User> list();
}