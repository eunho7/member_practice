# 스프링부트 회원 프로젝트

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
3. 회원목록(/member/)
4. 회원상세조회(/member/{id})
5. 회원업데이트(/member/update/{id})
    - session을 이용해 Eamil 확인
    - 상세화면에서 수정 버튼 클릭 
    - 서버에서 해당 사용자의 Email를 가지고 수정 화면 출력 
    - 비밀번호, 이름 수정 입력 받아서 서버로 요청 
    - 수정 처리 
6. 회원삭제(/board/delete)

## (3) 추가 기능
⭐. ajax를 활용한 이메일(아이디) 중복체크 하기

## 회원 결과  
0. 메인 페이지<br>    
<img width="300" src="https://github.com/user-attachments/assets/8832d462-454e-4db3-9128-90cae7e6d749"><br><br>  
1. 회원가입(/member/save)<br>  
<img width="529" alt="K-002" src="https://github.com/user-attachments/assets/a675616b-2a29-4f2c-b116-2302c2b1879a"><br><br>  
2. 로그인(/member/login)<br>  
<img width="602" alt="K-005" src="https://github.com/user-attachments/assets/0a792864-0ecc-468f-b47f-fc29a1ff03d9"><br><br>  
3. 회원목록(/member/)<br>    
<img width="400" src="https://github.com/user-attachments/assets/9acb8f3c-6cb4-49d4-8def-1723720fadae"><br><br>
4. 회원상세조회(/member/{id})<br>  
<img width="400" src="https://github.com/user-attachments/assets/5c89b42e-3730-4203-b7c4-3a7e3c5c0152"><br><br> 
5. 회원업데이트(/member/update/{id})<br>
<img width="650" alt="K-009" src="https://github.com/user-attachments/assets/be950aef-d657-459c-9bd6-fdb9476d67c6"><br><br>
6. 회원삭제(/board/delete)<br>
<img width="500" alt="K-012" src="https://github.com/user-attachments/assets/ef1a9d8e-5b1c-44f3-9e61-b81a8bdfedb7"><br><br>  
⭐. ajax를 활용한 이메일(아이디) 중복체크 하기<br>  
<img width="700" alt="K-003" src="https://github.com/user-attachments/assets/20148d7e-9c07-405f-9904-7cd48c45de24"><br><br>
