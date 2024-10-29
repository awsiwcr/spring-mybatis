package com.test.domain; // 或者 com.test.model，根据您的项目结构选择

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {

    // 用户的唯一标识符
    private int id;

    // 用户名
    private String username;

    // 密码（在实际应用中，密码通常不会以明文形式存储或传输）
    private String password;

    // 用户的电子邮件地址
    private String email;

    // 无参构造函数（通常用于框架在反序列化或创建对象时调用）
    public User() {
    }

    // 带参构造函数（用于创建具有特定属性的User对象）
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getter和Setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 重写toString方法，便于打印User对象的信息
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}'; // 注意：出于安全考虑，密码通常不会包含在toString输出中
    }

    // 可以根据需要重写equals和hashCode方法，用于比较User对象
    // ...

    // 如果需要，还可以添加其他业务逻辑方法
    // ...
}