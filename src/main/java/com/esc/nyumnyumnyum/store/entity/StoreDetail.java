package com.esc.nyumnyumnyum.store.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_store_List")
@ToString(exclude = "storeList")
public class StoreDetail {

    @Id
    @Column(name = "sn")
    private int sn; //'가게 고유번호'

    @Column(name = "sn", length = 50)
    private String uid; //'추천 아이디 fk'

    @CreatedDate
    @Column(name = "write_date")
    private LocalDateTime writeDate; //'작성일자'

    @Column(name = "star_point")
    private int starPoint; //'별점(0~5)'

    @Column(name = "star_comment", length = 300)
    private String starComment; //'추천이유'

    @Column(name = "tmp_column1", length = 120)
    private String tmpColumn1; //'임시 컬럼1'

    @Column(name = "tmp_column2", length = 120)
    private String tmpColumn2; //'임시 컬럼2'

    @Column(name = "tmp_column3", length = 120)
    private String tmpColumn3; //'임시 컬럼3'

    @OneToOne
    @MapsId
    private StoreList storeList; //동일한 기본 키를 공유하기 위해 @MapsId 어노테이션 사용.
}
