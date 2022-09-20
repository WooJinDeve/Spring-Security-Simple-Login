## 🍃 스프링 시큐리티 기본 로그인

### 기본 설정 
- **스프링 시작**
    - [https://start.spring.io/](https://start.spring.io/)

- **Spring Package Setting**
    - `Java Version` : 11
    - `Project` : `Gradle Project`
    - `Packaging`
        - `Spring Boot` : `Jar`
    - `Dependencies`
        - `Spring Web`, `Thymeleaf`, `Lombok`, `Validation`, `Spring DATA JPA`, `MySQL Driver`, `Spring Security`

### Issues
> [[#1]](https://github.com/WooJinDeve/Spring-Security-Login/issues/1#issue-1378869597) 스프링 시큐리티 설정 변경 사항 

### error page config
- `resouces` → `templates` → `error` → `xxx.html`
``` html
<div class="container" style="max-width: 600px">
    <div class="py-5 text-center">
        <h2>오류 화면</h2>
    </div>
    <div>
        <p>오류 화면 입니다.</p>
    </div>
    <hr class="my-4">
</div> <!-- /container -->
```

<details>
<summary><h3>디렉토리 구조</h3></summary>

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

