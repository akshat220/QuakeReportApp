package com.example.android.quakereport;

import java.lang.String;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private  String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl() {
        return mUrl;
    }
}
