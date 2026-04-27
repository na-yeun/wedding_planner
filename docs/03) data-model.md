# 💍 Wedding Planner

## 📄 테이블정의서

### MEMBER(회원)
   - _id
   - MEM_ID				| 아이디						|    NOT NULL   | 
   - PW					| 비밀번호					|    NOT NULL   | 
   - NAME				| 이름						|    NOT NULL   | 
   - SEX            	| 성별						|    NOT NULL   | 
   - PHONE          	| 핸드폰번호					|    NOT NULL   | 
   - PARTNER_ID			| 짝꿍ID						|	 NULLABLE   | 
   - PW_FAIL_CNT		| 비밀번호 실패회수			|    NOT NULL   |  DEFAULT : 0
   - ACCOUNT_LOCK		| 계정 잠김 여부				|    NOT NULL   | DEFAULT : 'N'
   - CREATED_AT			| 생성일시					|    NOT NULL   | 
   - UPDATED_AT 		| 수정일시					| 	 NULLABLE   | 

   #### MEMBER 예시
      {
         'MEM_ID' : 'my_id',
         'PW' : 'sdkjfdsf',
         'NAME' : '김나연',
         'SEX' : 'F',
         'PHONE' : '010-1234-5678',
         'PARTNER_ID' : 'your_id', // 확정된 경우에만
         'PW_FAIL_CNT' : 0
         'ACCOUNT_LOCK' : 'N',
         'CREATED_AT' : ISODate("2026-04-27T10:00:00"),
         'UPDATED_AT' : ISODate("2026-04-27T10:00:00")
      }


### PARTNER_REQUEST(짝꿍)
   - _id
   - REQUESTER_ID    	| 요청자ID         			|    NOT NULL   | 
   - RECEIVER_ID       	| 받는사람ID         		|    NOT NULL   | 
   - STATUS         	| 요청상태         			|    NOT NULL   | 
   - CREATED_AT      	| 생성일시         			|    NOT NULL   | 
   - UPDATED_AT      	| 수정일시         			|    NULLABLE   | 
   
   #### PARTNER_REQUEST 예시
   {
      'REQUESTER_ID': 'my_id',
      'RECEIVER_ID': 'your_id',
      'STATUS': {
         (COMMON_CODE 컬렉션 생성 예정)
      }
      'CREATED_AT' : ISODate("2026-04-27T10:00:00"),
      'UPDATED_AT' : ISODate("2026-04-27T10:00:00")
   }

### COMMON_CODE(공통코드)
   - _id
   - GROUP_CODE      	| 그룹            			|    NOT NULL   | 
   - GROUP_CODE_NAME   	| 그룹명            			|    NOT NULL   | 
   - CODE            	| 코드            			|    NOT NULL   | 
   - CODE_NAME        	| 코드명            			|    NOT NULL   | 
   - REMARK         	| 메모            			|    NOT NULL   | 
   - CREATED_AT      	| 생성일시         			|    NOT NULL   | 
   - UPDATED_AT      	| 수정일시         			|    NOT NULL   | 
   
   #### COMMON_CODE 예시
   {
      'GROUP_CODE': 'PARTNER_REQUEST',
      'GROUP_CODE_NAME': '짝꿍상태',
      'CODE': 'PENDING',
      'CODE_NAME' : '요청대기',
      'REMARK' : '',
      'CREATED_AT' : ISODate("2026-04-27T10:00:00"),
      'UPDATED_AT' : ISODate("2026-04-27T10:00:00")
   }
   
### CALENDER
   - _id
   - OWNER_ID (DBRef)   | 
   - PARTNER_ID (DBRef)	| 
   - TITLE            	| 
   - DATE            	| 
   - ALRAM_YN         	| 
   - CATEGORY         	| 
   - CREATED_AT      	| 
