# Wedding Planner

Spring Boot 기반 웨딩 준비 협업 관리 서비스입니다.

## 개발 환경

- Java 17
- Spring Boot 3.4.5
- Maven
- MongoDB
- Thymeleaf
- Spring Security
- Kakao OAuth 준비

## IntelliJ 실행 방법

1. IntelliJ에서 이 폴더를 `Open` 합니다.
2. Maven 프로젝트로 import 합니다.
3. MongoDB를 로컬에서 실행하거나 `MONGODB_URI` 환경변수를 설정합니다.
4. `WeddingPlannerApplication`을 실행합니다.
5. 브라우저에서 `http://localhost:8080`으로 접속합니다.

## Kakao OAuth 사용

기본 실행에서는 OAuth 설정이 꺼져 있습니다. 카카오 로그인을 사용할 때는 아래 환경변수를 설정하고 `oauth` 프로필을 활성화합니다.

- `KAKAO_CLIENT_ID`
- `KAKAO_CLIENT_SECRET`
- `SPRING_PROFILES_ACTIVE=oauth`

## 주요 구조

- `auth`: 로그인, 로그아웃, 비밀번호 찾기
- `member`: 회원가입, 마이페이지, 회원 정보
- `partner`: 짝꿍 요청, 수락, 거절, 해제
- `calendar`: 일정 관리
- `todo`: TODO 관리
- `expense`: 지출 관리
- `commoncode`: 공통 코드 관리
- `config`: Spring Security 등 설정

## 리소스 위치

- Thymeleaf: `src/main/resources/templates`
- CSS: `src/main/resources/static/css`
- JavaScript: `src/main/resources/static/js`
