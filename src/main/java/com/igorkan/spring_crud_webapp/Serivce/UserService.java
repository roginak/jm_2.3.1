package com.igorkan.spring_crud_webapp.Serivce;

import com.igorkan.spring_crud_webapp.Model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void editUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
