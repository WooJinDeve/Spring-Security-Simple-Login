## ๐ ์คํ๋ง ์ํ๋ฆฌํฐ ๊ธฐ๋ณธ ๋ก๊ทธ์ธ

### ๊ธฐ๋ณธ ์ค์  
- **์คํ๋ง ์์**
    - [https://start.spring.io/](https://start.spring.io/)

- **Spring Package Setting**
    - `Java Version` : 11
    - `Project` : `Gradle Project`
    - `Packaging`
        - `Spring Boot` : `Jar`
    - `Dependencies`
        - `Spring Web`, `Thymeleaf`, `Lombok`, `Validation`, `Spring DATA JPA`, `MySQL Driver`, `Spring Security`

### Issues
> [[#1]](https://github.com/WooJinDeve/Spring-Security-Login/issues/1#issue-1378869597) ์คํ๋ง ์ํ๋ฆฌํฐ ์ค์  ๋ณ๊ฒฝ ์ฌํญ 

### error page config
- `resouces` โ `templates` โ `error` โ `xxx.html`
``` html
<div class="container" style="max-width: 600px">
    <div class="py-5 text-center">
        <h2>์ค๋ฅ ํ๋ฉด</h2>
    </div>
    <div>
        <p>์ค๋ฅ ํ๋ฉด ์๋๋ค.</p>
    </div>
    <hr class="my-4">
</div> <!-- /container -->
```

<details>
<summary><h3>๋๋ ํ ๋ฆฌ ๊ตฌ์กฐ</h3></summary>

```
   src
    โโmain
       โโjava
       โ  โโlogin
       โ      โโsecurity
       โ          โ  SecurityApplication.java
       โ          โ
       โ          โโauth
       โ          โ      PrincipalDetails.java
       โ          โ      PrincipalDetailsService.java
       โ          โ
       โ          โโconfig
       โ          โ      SecurityConfig.java
       โ          โ
       โ          โโcontroller
       โ          โ      LoginController.java
       โ          โ
       โ          โโdto
       โ          โ      JoinFormDto.java
       โ          โ      UserInfoDto.java
       โ          โ
       โ          โโentity
       โ          โ      BaseEntity.java
       โ          โ      User.java
       โ          โ
       โ          โโrepository
       โ                  LoginRepository.java
       โ
       โโresources
          โ  application.yml
          โ
          โโstatic
          โ  โ  index.html
          โ  โ
          โ  โโcss
          โ          bootstrap.min.css
          โ
          โโtemplates
              โ  joinForm.html
              โ  loginForm.html
              โ  userInfo.html
              โ
              โโerror
                      403.html
                      4xx.html
                      500.html

```

</details>

