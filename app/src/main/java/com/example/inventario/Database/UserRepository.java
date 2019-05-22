package com.example.inventario.Database;

import com.example.inventario.Model.User;
import io.reactivex.Flowable;

import java.util.List;

public class UserRepository implements IUserDataSource {

    private IUserDataSource mLocalDataSource;

    private static UserRepository mInstance;

    public UserRepository(IUserDataSource mLocalDataSource) {
        this.mLocalDataSource = mLocalDataSource;
    }

    public static UserRepository getInstance(IUserDataSource mLocalDataSource)
    {
        if(mInstance == null)
        {
            mInstance = new UserRepository(mLocalDataSource);
        }

        return mInstance;
    }


    @Override
    public Flowable<User> getUserById(int userId) {
        return mLocalDataSource.getUserById(userId);
    }

    @Override
    public Flowable<List<User>> getAllUsers() {
        return mLocalDataSource.getAllUsers();
    }

    @Override
    public void insertUser(User... users) {
        mLocalDataSource.insertUser(users);

    }

    @Override
    public void updateUser(User... users) {
        mLocalDataSource.updateUser(users);

    }

    @Override
    public void deleteUser(User user) {
        mLocalDataSource.deleteUser(user);
    }

    @Override
    public void deleteAllUsers() {
        mLocalDataSource.deleteAllUsers();

    }
}
