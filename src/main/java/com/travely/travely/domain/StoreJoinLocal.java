package com.travely.travely.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StoreJoinLocal {

    private long localIdx;
    private long storeIdx;
    private long userIdx;
    private String storeName;
    private String storeCall;
    private String storeUrl;
    private String duringTime;
    private String address;
    private String localName;
    private long cnt;

    @Builder
    public StoreJoinLocal(long localIdx, long storeIdx, long userIdx, String storeName, String storeCall, String storeUrl,
                          String duringTime, String address, String localName, long cnt) {
        this.localIdx = localIdx;
        this.storeIdx = storeIdx;
        this.userIdx = userIdx;
        this.storeName = storeName;
        this.storeCall = storeCall;
        this.storeUrl = storeUrl;
        this.duringTime = duringTime;
        this.address = address;
        this.localName = localName;
        this.cnt = cnt;
    }
}