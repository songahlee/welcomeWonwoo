환경설정:

  - IntelliJ IDEA 2017.2.7 Enterprise 다운로드 : https://www.jetbrains.com/idea/download/previous.html (참고사항: http://idea.imsxm.com )

  (backend)
  - oracle java 1.8 버전 설치
 

프로젝트 처음오픈시
  -  IDEA->Import project -> settings.gradle 선택. 
  
  -  IntelliJ에 Lombok plugin설치 (Lombok은 java class의 setter/getter를 자동으로 생성해주는 plugin)
  
    -   (Preference세팅메뉴) 의 plugins 서브메뉴에서 Lombok plugin 검색설치
    -   (Preference세팅메뉴) compiler->annotation processor에서 Enable Annotation Processor선택
 

실행방법
 - WelcomeApplication.java파일의 우측마우스 클릭 후 Run 'WelcomeApplication' 선택하면 실행됨. 
 - http://localhost:8000/  주소로 접속하면 index.html 내용 보임.

 
참고페이지

- 스프링부트 : https://goddaehee.tistory.com/238
