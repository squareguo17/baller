package com.balldance.baller.model;

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

    private String mAge;

    private float mAveragePoints;

    public User() {
        mUuid = "1";
        mUserName = "2";
        mPasswd = "3";
        mSex = "4";
        mAge = "5";
        mAveragePoints = 3.3f;
    }

    public long getId() {
        return mId;
    }
}
