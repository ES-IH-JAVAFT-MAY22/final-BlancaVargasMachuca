package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.controller.dto.RoleDTO;
import com.ironhack.edgeservice.controller.dto.UserDTO;
import com.ironhack.edgeservice.controller.interfaces.EdgeUserController;
import com.ironhack.edgeservice.model.Role;
import com.ironhack.edgeservice.model.User;
import com.ironhack.edgeservice.service.interfaces.EdgeUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@RestController
@Slf4j
@CrossOrigin("*") //
public class EdgeUserControllerImpl implements EdgeUserController {

    @Autowired
    private EdgeUserService edgeUserService;

    /*
    @GetMapping("/users/{account}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserByAccount(@PathVariable int account) {
        return edgeUserService.getUserByAccount(account);
    }

     */

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO newUser(@RequestBody UserDTO userDTO) {
        return edgeUserService.newUser(userDTO);
   }


    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        EdgeUserService.delete(id);
    }

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO login(@AuthenticationPrincipal User user) {
        log.info("Login successful");
      //user.setPassword(null); // NEVER RETURN PASSWORD
        user.setPassword(user.getPassword());
        return userToDTO(user);
    }

    private UserDTO userToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(user.getRoles().stream().map(this::roleToDTO).collect(Collectors.toSet()));
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelephoneNumber(user.getTelephoneNumber());
        userDTO.setAddress(user.getAddress());


        return userDTO;
    }

    private RoleDTO roleToDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(role.getName());

        return roleDTO;
    }


}


