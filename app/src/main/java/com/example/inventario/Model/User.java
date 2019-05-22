package com.example.inventario.Model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import io.reactivex.annotations.NonNull;

public class User {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="email")
    private String email;

    public User() {

    }

    @Ignore
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return new StringBuilder(name).append("\n").append(email).toString();
    }
}
