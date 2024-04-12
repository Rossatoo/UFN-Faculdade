package com.aulas.Controller;

import com.aulas.Exception.ResourceNotFoundException;
import com.aulas.Model.User;
import com.aulas.Services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findUserById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return ResponseEntity.ok(user);
    }

    @GetMapping("/email/{email}")
    public Optional<User> findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @GetMapping("/name/{name}")
    public Optional<User> findByAlgumaCoisaName(@PathVariable String name) { return userService.findByAlgumaCoisaName(name);}

    @GetMapping("/search")
    public ResponseEntity<List<User>> findUsersByName(@RequestParam String name){
        List<User> users = userService.findUsersByName(name);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
        User updateUser = userService.updateUser(id, userDetails);
        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }



}
