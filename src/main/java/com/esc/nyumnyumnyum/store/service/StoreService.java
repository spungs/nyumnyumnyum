package com.esc.nyumnyumnyum.store.service;

import com.esc.nyumnyumnyum.store.entity.StoreList;
import com.esc.nyumnyumnyum.store.vo.StoreListVO;

import java.util.Map;

public interface StoreService {

    /**
     * 가게 정보 insert
     */
    public String insertStore(StoreListVO vo);
}
