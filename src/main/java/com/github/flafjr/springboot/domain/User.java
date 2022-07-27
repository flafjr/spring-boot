package com.github.flafjr.springboot.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class User {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String userId;
    private String userType;
    private String email;
    private String phoneNumber;

    public User(String userTyoe, String email, String phoneNumber) {
        this.userType = userTyoe;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }

    public String getUserType() {
        return userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(userType, user.userType) && Objects.equals(
                email, user.email) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userType, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userType='" + userType + '\'' +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
