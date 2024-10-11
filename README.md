# 스프링부트 회원 프로젝트
코딩 레시피 : https://github.com/codingrecipe1/member_new

## (1) 개발 환경
1. IDE: IntelliJ IDEA Community
2. Spring Boot 3.3.4
3. JDK 17
4. mysql
5. Spring Data JPA
6. Thymeleaf  


## (2) 회원 주요 기능
0. 메인 페이지
1. 회원가입(/member/save)
2. 로그인(/member/login)
    - session을 이용해 Eamil 전달
4. 회원목록(/member/)
5. 회원상세조회(/member/{id})
6. 회원업데이트(/member/update/{id})
    - session을 이용해 Eamil 확
    - 상세화면에서 수정 버튼 클릭 
    - 서버에서 해당 사용자의 Email를 가지고 수정 화면 출력 
    - 비밀번호, 이름 수정 입력 받아서 서버로 요청 
    - 수정 처리 
7. 회원삭제(/board/delete)

## (3) 추가 기능
1. ajax를 활용한 이메일(아이디) 중복체크 하기

## 게시판 결과
