package mk.ukim.finki.emtlab2.service.impl;

import mk.ukim.finki.emtlab2.model.User;
import mk.ukim.finki.emtlab2.model.dto.UserDto;
import mk.ukim.finki.emtlab2.model.dto.UserLoginDto;
import mk.ukim.finki.emtlab2.model.enumerations.Role;
import mk.ukim.finki.emtlab2.model.exceptions.InvalidUsernameOrPasswordException;
import mk.ukim.finki.emtlab2.model.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.emtlab2.model.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.emtlab2.repository.UserRepository;
import mk.ukim.finki.emtlab2.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(UserDto userDto) {
        if (userDto.getUsername() == null || userDto.getUsername().isEmpty() || userDto.getPassword() == null || userDto.getPassword().isEmpty())
            throw new InvalidUsernameOrPasswordException();
        if (!userDto.getPassword().equals(userDto.getRepeatPassword()))
            throw new PasswordsDoNotMatchException();
        if (this.userRepository.findByUsername(userDto.getUsername()).isPresent())
            throw new UsernameAlreadyExistsException(userDto.getUsername());
        User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()), userDto.getName(), userDto.getSurname(), Role.USER);
        return userRepository.save(user);
    }

    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname, Role role) {
        return null;
    }

    @Override
    public User login(UserLoginDto userLoginDto) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
