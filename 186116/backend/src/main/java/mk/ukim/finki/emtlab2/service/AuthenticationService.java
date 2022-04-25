package mk.ukim.finki.emtlab2.service;

import mk.ukim.finki.emtlab2.model.User;

public interface AuthenticationService {
    User login(String username, String password);
}
