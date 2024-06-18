

package com.education.portal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.education.portal.model.Signup;
import com.education.portal.repository.SignupRepository;
import com.education.portal.service.SignupService;

import java.util.Optional;

@Service
public class SignupServiceImpl implements SignupService {

    @Autowired
    private SignupRepository signupRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Signup saveUser(Signup signup) {
        Optional<Signup> existingUserByUsername = signupRepository.findByUsername(signup.getUsername());
        if (existingUserByUsername.isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        Optional<Signup> existingUserByEmail = signupRepository.findByEmail(signup.getEmail());
        if (existingUserByEmail.isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        signup.setPassword(passwordEncoder.encode(signup.getPassword()));
        return signupRepository.save(signup);
    }

    @Override
    public boolean authenticate(String username, String password) {
        Optional<Signup> user = signupRepository.findByUsername(username);
        return user.isPresent() && passwordEncoder.matches(password, user.get().getPassword());
    }

    @Override
    public void changePassword(String email, String currentPassword, String newPassword) {
        Optional<Signup> user = signupRepository.findByEmail(email);
        if (!user.isPresent()) {
            throw new RuntimeException("User with this email does not exist");
        }

        if (!passwordEncoder.matches(currentPassword, user.get().getPassword())) {
            throw new RuntimeException("Current password is incorrect");
        }

        Signup existingUser = user.get();
        existingUser.setPassword(passwordEncoder.encode(newPassword));
        signupRepository.save(existingUser);
    }

    @Override
    public Signup getUserByUsername(String username) {
        return signupRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
