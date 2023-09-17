package com.balldance.baller.model;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

@Entity
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mId;
    @Column(unique = true)
    private String mUuid;
    private int m2PointCnt;
    private int m3PointCnt;

    public void setUuid(String mUuid) {
        this.mUuid = mUuid;
    }

    public void setTwoPointCount(int twoPointCount) {
        m2PointCnt = twoPointCount;
    }

    public void setThreePointCount(int threePointCount) {
        m3PointCnt = threePointCount;
    }
}
