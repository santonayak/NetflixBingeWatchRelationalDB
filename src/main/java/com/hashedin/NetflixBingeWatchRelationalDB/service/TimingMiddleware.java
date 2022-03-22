package com.hashedin.NetflixBingeWatchRelationalDB.service;

public class TimingMiddleware {

    long start;

    public long start() {
        start = System.currentTimeMillis();
        return start;
    }

    public long end() {
        return System.currentTimeMillis() - start;
    }
}
