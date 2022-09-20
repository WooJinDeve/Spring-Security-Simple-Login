## 개요 
- 🍃 스프링 시큐리티 기본 로그인

## 기본 설정 
- **스프링 시작**
    - [https://start.spring.io/](https://start.spring.io/)

- **Spring Package Setting**
    - `Java Version` : 11
    - `Project` : `Gradle Project`
    - `Packaging`
        - `Spring Boot` : `Jar`
    - `Dependencies`
        - `Spring Web`, `Thymeleaf`, `Lombok`, `Validation`, `Spring DATA JPA`, `MySQL Driver`, `Spring Security`

## Issues
> [[#1]](https://github.com/WooJinDeve/Spring-Security-Login/issues/1#issue-1378869597) 스프링 시큐리티 설정 변경 사항 

<details>
<summary><h2>디렉토리 구조</h2></summary>

```
   src
    └─main
       ├─java
       │  └─login
       │      └─security
       │          │  SecurityApplication.java
       │          │
       │          ├─auth
       │          │      PrincipalDetails.java
       │          │      PrincipalDetailsService.java
       │          │
       │          ├─config
       │          │      SecurityConfig.java
       │          │
       │          ├─controller
       │          │      LoginController.java
       │          │
       │          ├─dto
       │          │      JoinFormDto.java
       │          │      UserInfoDto.java
       │          │
       │          ├─entity
       │          │      BaseEntity.java
       │          │      User.java
       │          │
       │          └─repository
       │                  LoginRepository.java
       │
       └─resources
          │  application.yml
          │
          ├─static
          │  │  index.html
          │  │
          │  └─css
          │          bootstrap.min.css
          │
          └─templates
              │  joinForm.html
              │  loginForm.html
              │  userInfo.html
              │
              └─error
                      403.html
                      4xx.html
                      500.html

```

</details>

