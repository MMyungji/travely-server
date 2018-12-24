package com.travely.travely.dto.store;

import com.travely.travely.domain.StoreJoinLocal;
import lombok.Getter;

@Getter
public class StoreInfoResponseDto {

    private long cnt;
    private String storeName;
    private String localName;

    public StoreInfoResponseDto(final StoreJoinLocal storeJoinLocal) {
        this.storeName=storeJoinLocal.getStoreName();
        this.cnt = storeJoinLocal.getCnt();
        this.localName = storeJoinLocal.getLocalName();
    }
}
