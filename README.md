# ![0009](https://github.com/bit701team1/teamSOS/assets/124352219/bbc7f6c8-2c4b-417e-9667-c12af8907e4d) All About Auction

<span style="color:gray">
  
> Naver Cloud AlaaS 개발자 과정 4기 TeamSOS  
> 김성학 김동호 김형민 이수연 조경철
</span>

#

### 📃 소개글


##### - 주요기능
<pre>
  
  - 실시간 방송을 통한 경매 물품 소개
  - 채팅을 통한 자유도 높은 경매 진행 
  - 결제 기능
  - SMS 인증 및 알림 기능 제공
  
</pre>

## 🎞️ 프로젝트 시연 영상

[![Video Label](http://img.youtube.com/vi/ZNchPMv6KJE/0.jpg)](https://www.youtube.com/watch?v=ZNchPMv6KJE)


## ♟ 역할 및 담당 업무 

- 팀장 : 기술 표준 선택, 개발 일정 관리, 작업 메뉴얼 작성 및 배포
- Git 관리자 : Git branch 전략 수립, PR 진행 관리
- CI/CD 관리자 : 젠킨스 CI/CD 구성
- Cloud 관리자 : VPC구성, Subnet구성, Cloud DB 설정, 도커 이미지 관리
- 세부 담당 기능 : JWT 인증 인가, 회원정보 관리, SMS 인증

* * *
## ⚙ 세부 담당 기능 

![로그인이미지](https://github.com/bit701team1/teamSOS/assets/124352219/2582ca86-bb00-42b7-a0a7-39200ef4c3c1)


**1.  로그인 / 회원가입**

    - 가입시 이메일 중복 확인
    - DB에 암호화된 비밀번호 저장
    - 로그인시 JWT 활용한 인증, 인가

![0009](https://github.com/bit701team1/teamSOS/assets/124352219/ef47c5fa-f347-4e5c-bb38-bf98b317c3df)

<pre>
  
    - 회원정보를 AccessToken에 담아서 클라이언트에서 운영
    - 토큰 탈취를 막기 위해서 http-only cookie에 저장
    - 토큰 탈취시 리스크를 줄이기 위해서 RefreshToken 활용
    
</pre>     
      
**2. SMS 인증**

    - 가입시 문자 발송, 인증번호 일치여부 확인
    - 비밀번호 찾기 또한 동일하게 진행



![11111](https://github.com/bit701team1/teamSOS/assets/124352219/d6cba92e-c6d8-4273-bc53-d22379321ecc)

  
**3. Naver 계정 연동 로그인**

   - Naver Login API를 활용한 간편 로그인 구현

* * *

## ♾ DevOps

![devops](https://github.com/bit701team1/teamSOS/assets/124352219/dbc4a77d-79f3-47da-8898-4856d85b279d)

* * *


## CI / CD

![0010](https://github.com/bit701team1/teamSOS/assets/124352219/d2bbcc76-63c3-4916-bcec-5e8431dd00aa)

1.  IDE에서 작업한 내용을 Github에 Push
2.  Jenkins 서버에서 Gradle을 활용한 빌드, Jar 파일 생성
3.  Docker 이미지 생성 이후 Dockerhub에 이미지 Push
4.  Spring boot 서버에서 docker 이미지 pull
5.  받아온 이미지 기반으로 서버 실행

* * *

## Git Branch 전략

![0011](https://github.com/bit701team1/teamSOS/assets/124352219/f9380082-4ffb-4d74-9a40-eb1766a855d8)

1. 기능별로 각 구성원들이 코드 작성 및 push
2. dev branch로 pull 이후 검증, 이후 dev 기반으로 작업 진행
3. 확실한 검증 이후 안정화된 버전만을 release branch로 배포에 활용함
  - 안정화된 버전만을 배포할 수 있고 버전 관리가 용이하게 하였음


