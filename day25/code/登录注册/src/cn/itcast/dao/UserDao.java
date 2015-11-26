/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 *
 * @author fqy
 */
public interface UserDao {
    public abstract  boolean isLogin(String username,String password);
    public abstract  void regist(User user);
}
