# Book Management App

이 앱은 Spring Boot를 사용한 간단한 도서 관리 웹 애플리케이션입니다. MyBatis와 Thymeleaf를 활용해 백엔드 API와 화면을 연결하며, MariaDB를 데이터베이스로 사용합니다. CRUD(생성, 읽기, 업데이트, 삭제)와 검색 기능을 구현했습니다.

## 주요 기능
- **목록 보기**: 모든 도서 목록 표시 (페이징 가능).
- **추가**: 새 도서 등록 (유효성 검사 포함).
- **수정**: 기존 도서 편집.
- **삭제**: 도서 제거 (확인 팝업).
- **검색**: 제목이나 저자 키워드로 필터링.

## 기술 스택
- **백엔드**: Java 21, Spring Boot 3.x, MyBatis (XML 매퍼)
- **프론트엔드**: Thymeleaf, Bootstrap 5 (UI 개선)
- **데이터베이스**: MariaDB
- **빌드**: Maven
- **IDE**: IntelliJ IDEA

## 설치 및 실행 방법
1. MariaDB 설치 및 `bookdb` 데이터베이스 생성 (테이블: `books`).
2. `application.yml`에서 DB 연결 정보 수정 (url, username, password).
3. `mvn clean install` 실행.
4. `mvn spring-boot:run` 또는 IDE에서 실행.
5. 브라우저: http://localhost:8080/books 접속.

## 데모

도서 목록 화면
<img width="983" height="287" alt="list" src="https://github.com/user-attachments/assets/26340698-dd01-413c-9c22-55a6d577ccbd" />

도서 추가 폼
<img width="197" height="187" alt="form" src="https://github.com/user-attachments/assets/f41e7792-70b7-478f-9dc8-a3e378b54d2e" />

검색 결과
<img width="987" height="222" alt="search" src="https://github.com/user-attachments/assets/617074fe-4513-4373-b709-2d8594cfe15b" />

## 프로젝트 구조
src/main/java/com/example/book_management/
├── controller/     # 엔드포인트
├── service/        # 비즈니스 로직
├── mapper/         # MyBatis 인터페이스
├── model/          # Book 엔티티
└── BookManagementApplication.java

## Text
`src/main/resources/`
├── mapper/BookMapper.xml  # SQL 쿼리
└── templates/books/       # Thymeleaf HTML

## 추가 개발 아이디어
- 인증/인가 (Spring Security).
- 파일 업로드 (도서 표지 이미지).
- REST API 버전 (JSON 응답으로 프론트 분리).

이 프로젝트는 개인 학습 목적으로 개발되었습니다. 피드백 환영합니다! (이메일: myec1234@gmail.com)

---
Built with ❤️ using Spring Boot
