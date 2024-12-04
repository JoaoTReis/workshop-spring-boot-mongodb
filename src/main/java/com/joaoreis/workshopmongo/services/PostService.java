package com.joaoreis.workshopmongo.services;

import com.joaoreis.workshopmongo.domain.Post;
import com.joaoreis.workshopmongo.domain.User;
import com.joaoreis.workshopmongo.dto.UserDTO;
import com.joaoreis.workshopmongo.repository.PostRepository;
import com.joaoreis.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}