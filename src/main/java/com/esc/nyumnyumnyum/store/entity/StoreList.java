package com.esc.nyumnyumnyum.store.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_store_List")
public class StoreList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sn")
    private int sn; //'가게 고유번호'

    @Column(name = "sname", length = 60, nullable = true)
    private String sname; //'가게 이름'

    @Column(name = "scallnum", length = 20)
    private String scallnum; //'가게 전화번호'

    @Column(name = "saddress_description", length = 300)
    private String saddressDescription; //'가게 소개(설명)'

    @Column(name = "szip_code", length = 10)
    private String szipCode; //'우편번호'

    @Column(name = "saddress_type", length = 2)
    private String saddressType; //'사용자가 선택한 주소(R:도로명, J:지번)'

    @Column(name = "saddress_road", length = 150)
    private String saddressRoad; //'도로명주소'

    @Column(name = "saddress_jibun", length = 150)
    private String saddressJibun; //'지번주소'

    @Column(name = "saddress_detail", length = 25)
    private String saddressDetail; //'상세주소'

    @Column(name = "saddress_jibun1", length = 25)
    private String saddressJibun1; //'시도명'

    @Column(name = "saddress_jibun2", length = 25)
    private String saddressJibun2; //'시군명'

    @Column(name = "saddress_jibun3", length = 25)
    private String saddressJibun3; //'구명(없는 경우 null)'

    @Column(name = "saddress_jibun4", length = 25)
    private String saddressJibun4; //'동 or 읍'

    @Column(name = "saddress_jibun5", length = 150)
    private String saddressJibun5; //'리(없는 경우 null)'

    @Column(name = "category", length = 30)
    private String category; //'음식 종류(ex.한중일양)'

    @Column(name = "tmp_column1", length = 120)
    private String tmpColumn1; //'임시 컬럼1'

    @Column(name = "tmp_column2", length = 120)
    private String tmpColumn2; //'임시 컬럼2'
}
