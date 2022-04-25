package mk.ukim.finki.emtlab2.model.dto;

import lombok.Data;
import mk.ukim.finki.emtlab2.model.User;
import mk.ukim.finki.emtlab2.model.enumerations.Role;


@Data
public class UserDetailsDto {
    private String username;

    private Role role;

    public static UserDetailsDto of(User user) {
        UserDetailsDto detailsDto = new UserDetailsDto();
        detailsDto.username =user.getUsername();
        detailsDto.role = user.getRole();

        return detailsDto;
    }
}
