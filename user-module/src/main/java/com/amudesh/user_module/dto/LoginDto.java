package com.amudesh.user_module.dto;

import com.amudesh.user_module.enums.Role;

public class LoginDto {
    
    private String email;
    private String password;
    private Role role;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

}
