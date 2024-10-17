package org.example.controller;

import org.example.repository.UserRepository;
package org.project.homework.controllers;

import org.project.homework.repository.UserRepository;
import org.project.homework.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
public class UserController {
    public class UserController {

        private final UserRepository userRepository;

        public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @GetMapping("/users")
        public String listUsers(Model model) {
            List<User> users = userRepository.getAllUsers();
            model.addAttribute("users", users);
            return "user-list";
        }
    }
