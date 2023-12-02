-- tb_userinfo (유저 테이블)
create table tb_userinfo(
	 uid varchar(50) PRIMARY KEY COMMENT '아이디 pk'
	,pw varchar(150) NOT NULL COMMENT '비밀번호'
	,nickname varchar(40) NOT NULL COMMENT '닉네임'
	,reg_date TIMESTAMP NOT NULL COMMENT '회원가입 일자'
	,pw_update_date TIMESTAMP COMMENT '패스워드 수정일자'
	,tmp_column1 varchar(120) COMMENT '임시 컬럼1'
	,tmp_column2 varchar(120) COMMENT '임시 컬럼2'
	,tmp_column3 varchar(120) COMMENT '임시 컬럼3'
	,tmp_column4 varchar(120) COMMENT '임시 컬럼4'
	,tmp_column5 varchar(120) COMMENT '임시 컬럼5'
) COMMENT = '유저 테이블';

-- tb_userinfo_detail (유저 개인정보 테이블)
create table tb_userinfo_detail(
	 uid varchar(50) NOT NULL COMMENT '아이디 fk'
	,uname varchar(40) NOT NULL COMMENT '이름'
	,visit_cnt integer DEFAULT 0 COMMENT '방문횟수'
	,phone varchar(20) COMMENT '전화번호'
	,gender varchar(10) NOT NULL COMMENT '성별'
	,birth varchar(20) NOT NULL COMMENT '생일'
	,email varchar(255) NOT NULL COMMENT '이메일'
	,info_update_date TIMESTAMP COMMENT '개인정보 수정일자'
	,tmp_column1 varchar(120) COMMENT '임시 컬럼1'
	,tmp_column2 varchar(120) COMMENT '임시 컬럼2'
	,tmp_column3 varchar(120) COMMENT '임시 컬럼3'
	,tmp_column4 varchar(120) COMMENT '임시 컬럼4'
	,tmp_column5 varchar(120) COMMENT '임시 컬럼5'
) COMMENT = '유저 개인정보 테이블';

-- tb_store_List (맛집 리스트)
create table tb_store_List(
	 sn number NOT NULL auto_increment COMMENT '가게 고유번호'
	 ,sname varchar(60) NOT NULL COMMENT '가게 이름'
	 ,snumber varchar(20) COMMENT '가게 전화번호'
	 ,szip_code varchar(10) COMMENT '우편주소'
	 ,saddress varchar(150) COMMENT '도로명주소'
	 ,saddress_detail varchar(150) COMMENT '도로명 상세주소'
	 ,saddress_jibun1 varchar(25) COMMENT '시도명'
	 ,saddress_jibun2 varchar(25) COMMENT '시군명'
	 ,saddress_jibun3 varchar(25) COMMENT '구명'
	 ,saddress_jibun4 varchar(25) COMMENT '읍면동명'
	 ,saddress_jibun5 varchar(150) COMMENT '지번 상세주소'
	 ,category varchar(30) COMMENT '음식 종류(ex.한중일양)'
	 ,tmp_column1 varchar(120) COMMENT '임시 컬럼1'
	 ,tmp_column2 varchar(120) COMMENT '임시 컬럼2'
) COMMENT = '맛집 리스트';

-- tb_store_detail (가게 추천정보)
create table tb_store_detail(
	 sn number NOT NULL COMMENT '가게 고유번호'
	 ,uid varchar(50) PRIMARY KEY COMMENT '추천 아이디 fk'
	 ,write_date TIMESTAMP COMMENT '작성일자'
	 ,star_point number COMMENT '별점(0~5)'
	 ,star_comment varchar(300) COMMENT '추천이유'
	 ,tmp_column1 varchar(120) COMMENT '임시 컬럼1'
	 ,tmp_column2 varchar(120) COMMENT '임시 컬럼2'
	 ,tmp_column3 varchar(120) COMMENT '임시 컬럼3'
) COMMENT = '가게 추천정보';

--커뮤니티 테이블~ing