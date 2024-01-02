package com.esc.nyumnyumnyum.store.web;

import com.esc.nyumnyumnyum.store.service.StoreService;
import com.esc.nyumnyumnyum.store.vo.StoreListVO;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(value="/view/store")
@Controller
@Slf4j
public class StoreController {

    @Resource
    private StoreService storeService;
    /**
     * 가게 등록 페이지 진입
     */
    @PostMapping(value="/register")
    public String registerStorePage(Model model) {

        model.addAttribute("jusoData", null);
        return "/view/store/storeRegister";
    }

    /**
     * 검색한 주소 데이터 세팅
     */
    @RequestMapping(value="/jusoSet")
    @ResponseBody
    public Map<String, Object> jusoDataSet(@RequestBody Map<String, Object> map, Model model) {

        return map;
    }

    /**
     * 주소 DB 저장
     */
    @RequestMapping(value="/saveStore")
    @ResponseBody
    public String saveStore(@RequestBody Map<String, Object> map, Model model) {
        String returnResult = "error";
        StoreListVO vo = new StoreListVO();

        vo.setSname((String) map.get("storeName")); //가게 이름
        vo.setScallnum((String) map.get("storePhoneNum")); //가게 전화번호
        vo.setSzipCode((String) map.get("zipCode")); //우편번호
        vo.setSaddressType((String) map.get("userSelectedType")); //사용자가 선택한 주소(R:도로명, J:지번)
        vo.setSaddressRoad((String) map.get("roadAddress")); //도로명주소
        vo.setSaddressJibun((String) map.get("jibunAddress")); //지번주소
        vo.setSaddressDetail((String) map.get("addressDetail")); //상세주소
        vo.setSaddressJibun1((String) map.get("sido")); //시도명
        vo.setSaddressJibun2((String) map.get("sigungu1")); //시군명
        vo.setSaddressJibun3((String) map.get("sigungu2")); //구명(없는 경우 null)
        vo.setSaddressJibun4((String) map.get("bname1")); //동 or 읍
        vo.setSaddressJibun5((String) map.get("bname2")); //리(없는 경우 null)
        vo.setSaddressDescription((String) map.get("description")); //가게 설명
        vo.setCategory((String) map.get("category")); //음식 종류

        returnResult = storeService.insertStore(vo);

        return returnResult;
    }
}
