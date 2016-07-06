/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_web_app.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author eguseynov
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    
    // этот метод занимается шифрованием пароля и возвращает строку, хэш которой будет сравниваться
    public static String generatePassword(String password, String salt){
        return DigestUtils.sha256Hex(salt + DigestUtils.sha256Hex(salt + password));
    }
    
    private Integer id;
    
    private String email;
    
    private String password;
    
    //специальная случайная строка для шифрования, значение которой будет задаваться далее
    private String salt;
    
    public User () {
    
    }

    public User(Integer id, String email, String password, String salt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.salt = salt;
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = generatePassword(password, salt);
        this.password = password;
    }

    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    

    
    
    // этот метод возвращает одно из начений сравнивая пароль
    public boolean checkPassword(String password){
        return this.password.equals(generatePassword(password, salt));
    }
    
    @Override
    public String toString(){
        return "User {" + " id=" + id
                + ", email=" + email
                + ", password=" + password + "}";
    }
    
    
}
