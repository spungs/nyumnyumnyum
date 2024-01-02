package com.esc.nyumnyumnyum.store.service.impl;

import com.esc.nyumnyumnyum.store.dao.StoreListRepository;
import com.esc.nyumnyumnyum.store.entity.StoreList;
import com.esc.nyumnyumnyum.store.service.StoreService;
import com.esc.nyumnyumnyum.store.vo.StoreListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Map;

@Service
@Slf4j
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreListRepository storeListRepository;

    /**
     * 가게 정보 insert
     */
    @Override
    @Transactional
    public String insertStore(StoreListVO vo) {
        StoreList storeList = new StoreList();
        try {
            storeList.setSname(vo.getSname()); //가게 이름
            storeList.setScallnum(vo.getScallnum()); //가게 전화번호
            storeList.setSzipCode(vo.getSzipCode()); //우편번호
            storeList.setSaddressType(vo.getSaddressType()); //사용자가 선택한 주소(R:도로명, J:지번)
            storeList.setSaddressRoad(vo.getSaddressRoad()); //도로명주소
            storeList.setSaddressJibun(vo.getSaddressJibun()); //지번주소
            storeList.setSaddressDetail(vo.getSaddressDetail()); //상세주소
            storeList.setSaddressJibun1(vo.getSaddressJibun1()); //시도명
            storeList.setSaddressJibun2(vo.getSaddressJibun2()); //시군명
            storeList.setSaddressJibun3(vo.getSaddressJibun3()); //구명(없는 경우 null)
            storeList.setSaddressJibun4(vo.getSaddressJibun4()); //동 or 읍
            storeList.setSaddressJibun5(vo.getSaddressJibun5()); //리(없는 경우 null)
            storeList.setSaddressDescription(vo.getSaddressDescription()); //가게 설명
            storeList.setCategory(vo.getCategory()); //음식 종류

            storeListRepository.save(storeList);

            return "success";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "error: " + e.getMessage();
        }
    }
}
