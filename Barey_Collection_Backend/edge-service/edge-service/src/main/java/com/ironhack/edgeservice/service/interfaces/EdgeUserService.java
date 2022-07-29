package com.ironhack.edgeservice.service.interfaces;

import com.ironhack.edgeservice.controller.dto.UserDTO;
import com.ironhack.edgeservice.model.User;



public interface EdgeUserService {
    static void delete(Long id) {
    }

    UserDTO newUser(UserDTO userDTO);
}


