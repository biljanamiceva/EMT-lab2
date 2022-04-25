package mk.ukim.finki.emtlab2.model.enumerations;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, LIBRARIAN;

    @Override
    public String getAuthority() {
        return name();
    }
}
