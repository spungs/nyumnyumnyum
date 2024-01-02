package com.esc.nyumnyumnyum.store.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StoreDetailVO {
    private int sn; //'가게 고유번호'
    private String uid; //'추천 아이디 fk'
    private LocalDateTime writeDate; //'작성일자'
    private int starPoint; //'별점(0~5)'
    private String starCommnet; //'추천이유'
    private String tmpColumn1; //'임시 컬럼1'
    private String tmpColumn2; //'임시 컬럼2'
    private String tmpColumn3; //'임시 컬럼3'
}
