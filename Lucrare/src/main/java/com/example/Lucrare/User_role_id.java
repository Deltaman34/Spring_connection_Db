package com.example.Lucrare;

import java.io.Serializable;
import java.util.Objects;

public class User_role_id implements Serializable {

    private Long userId;
    private Short roleId;

    public User_role_id() {}

    public User_role_id(Long userId, Short roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User_role_id that)) return false;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}