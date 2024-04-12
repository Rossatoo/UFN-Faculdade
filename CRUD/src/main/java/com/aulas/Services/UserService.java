package com.aulas.Services;

import com.aulas.Model.User;
import com.aulas.Exception.ResourceNotFoundException;
import com.aulas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //create a new User
    public User createUser(User user){
        return userRepository.save(user);
    }

    //find all users
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(userRepository.findByEmail(email));
    }

    public List<User> findUsersByName(String name){
        return userRepository.findByNameContainingIgnoreCase(name);
    }


    //MEXENDO AQUI AGORA
    public Optional<User> findByAlgumaCoisaName(String name){return Optional.ofNullable(userRepository.findByAlgumaCoisaName(name));
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }
    public User updateUser(Long id, User userDetails){
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhones(userDetails.getPhones());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: "+ id));
        userRepository.delete(user);
    }

}
