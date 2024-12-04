package com.joaoreis.workshopmongo.resources;

import com.joaoreis.workshopmongo.domain.Post;
import com.joaoreis.workshopmongo.domain.User;
import com.joaoreis.workshopmongo.dto.UserDTO;
import com.joaoreis.workshopmongo.services.PostService;
import com.joaoreis.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}