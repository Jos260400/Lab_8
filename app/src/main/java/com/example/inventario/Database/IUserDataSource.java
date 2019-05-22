package com.example.inventario.Database;

import com.example.inventario.Model.User;
import io.reactivex.Flowable;

import java.util.List;

public interface IUserDataSource {
    Flowable<User> getUserById(int userId);
    Flowable<List<User>> getAllUsers();
    void insertUser(User... users);
    void updateUser(User... users);
    void deleteUser(User user);
    void deleteAllUsers();



}
