package com.esc.nyumnyumnyum.store.vo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StoreListVO {
    private int sn; //'가게 고유번호'
    private String sname; //'가게 이름'
    private String scallnum; //'가게 전화번호'
    private String saddressDescription; //'가게 소개(설명)'
    private String szipCode; //'우편번호'
    private String saddressType; //'사용자가 선택한 주소(R:도로명, J:지번)'
    private String saddressRoad; //'도로명주소'
    private String saddressJibun; //'지번주소'
    private String saddressDetail; //'상세주소'
    private String saddressJibun1; //'시도명'
    private String saddressJibun2; //'시군명'
    private String saddressJibun3; //'구명(없는 경우 null)'
    private String saddressJibun4; //'동 or 읍'
    private String saddressJibun5; //'리(없는 경우 null)'
    private String category; //'음식 종류(ex.한중일양)'
    private String tmpColumn1; //'임시 컬럼1'
    private String tmpColumn2; //'임시 컬럼2'
}
