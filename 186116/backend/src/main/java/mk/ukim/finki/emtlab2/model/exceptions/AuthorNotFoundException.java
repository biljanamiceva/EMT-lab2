package mk.ukim.finki.emtlab2.model.exceptions;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException() {
        super(String.format("Author was not found."));

    }
}
