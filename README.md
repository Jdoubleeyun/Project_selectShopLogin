# Project_selectShopLogin (complex NaverAPI, Login)
# 개인 프로젝트 '내 상품만 모아서 보고싶다'
웹사이트 주소: http://jdoubleeyun.shop (서버 내림)   
### 네이버 쇼핑을 하다가 생긴 관심상품을 한꺼번에 모아서 보고 싶으시다면 이용해보세요!

## 기술스택 및 프레임워크
👨‍💻안지윤

💻프론트엔드
- html
- css
- javascript(jquery) 
  
💻백엔드
- java(Spring boot)


## 주요 API 리스트
![image](https://user-images.githubusercontent.com/82137367/142862750-074f9a73-8c4a-467f-b835-50097f27f6f0.png)

![image](https://user-images.githubusercontent.com/82137367/142863264-ad7e22c7-67cb-4369-8d94-5bb920e76b13.png)

## 요구사항  

![image](https://user-images.githubusercontent.com/82137367/142863179-7e1d99c8-7219-488b-b979-d426b7e994b2.png)

## API 구현

![image](https://user-images.githubusercontent.com/82137367/142863499-f045dbcf-cf22-4bac-a3ee-c8cff08897a3.png)

![image](https://user-images.githubusercontent.com/82137367/142862943-b291780c-14b8-4da4-96c3-f817b72371d3.png)


## 주요 페이지별 기능

1. 회원가입 페이지
   1. SpringSecurity Authenticaiton filter(username, password) 로 토큰 생성 후  DB에 저장
   2. SecurityContext에 회원가입 사용자 토큰 저장
2. 로그인 페이지
   1. SpringSecurity Authentucation filter로 SecurityContext에 사용자 SessionID 존재 확인
   2. 유효성 검증시, 메인페이지로 이동 유효성 검증실패시, 로그인페이지 redirect
   3. 카카오 소셜 로그인 기능 추가
3. 메인 페이지
   1. 네이버 Api controller 구현으로 네이버 상품으로 검색, 조회, Redirect 가능
   2. 해당 상품 클릭시 사용자별 상품 모아보기 가능
   3. 사용자별 해당 상품 마다 개인 옵션 추가 가능
