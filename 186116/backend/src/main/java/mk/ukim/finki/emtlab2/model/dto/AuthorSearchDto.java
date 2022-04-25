package mk.ukim.finki.emtlab2.model.dto;

import lombok.Data;

@Data
public class AuthorSearchDto {
    private String name;

    private String surname;


    public AuthorSearchDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
