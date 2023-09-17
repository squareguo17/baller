package com.balldance.baller.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mId;
    private String mUuid;
    private String mUserName;
    private String mPasswd;
    private String mSex;
    private int mAge;
    private float mHeight;
    private int mPosition;

    public User() {
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public void setUuid(String uuid) {
        mUuid = uuid;
    }

    public void setSex(String sex) {
        mSex = sex;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public void setPasswd(String passwd) {
        mPasswd = passwd;
    }

    public void setHeight(float height) {
        mHeight = height;
    }

    public void setPosition(int position) {
        mPosition = position;
    }

    public String getUuid() {
        return mUuid;
    }

    public String getUsrName() {
        return mUserName;
    }

    public String getPwd() {
        return mPasswd;
    }
}
