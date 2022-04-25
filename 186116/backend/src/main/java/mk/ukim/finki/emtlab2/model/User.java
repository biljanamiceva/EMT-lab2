package mk.ukim.finki.emtlab2.model;


import lombok.Data;
import mk.ukim.finki.emtlab2.model.enumerations.Role;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
public class User {

    @Id
    private String username;

    @Version
    private Long version;

    private String password;

    private String name;

    private String surname;

    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;
    private boolean isCredentialsNonExpired = true;
    private boolean isEnabled = true;

    @Enumerated(value = EnumType.STRING)
    private Role role;


    public User() {
    }

    public User(String username, String password, String name, String surname, Role role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(role);
    }

    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
