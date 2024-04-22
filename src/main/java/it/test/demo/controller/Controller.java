package it.test.demo.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import it.test.demo.model.*;


@RestController
public class Controller {

    @GetMapping(value = "/api/messages", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Message>> getMessages() {
        
        List<Message> messages = new ArrayList<Message>() {
            {
                add(new Message(1, "Prova Uno"));
                add(new Message(2, "Prova Due"));
            }
        };
        // Return messages and status code 200
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
}