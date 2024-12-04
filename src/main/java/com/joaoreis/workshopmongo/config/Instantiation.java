package com.joaoreis.workshopmongo.config;

import com.joaoreis.workshopmongo.domain.Post;
import com.joaoreis.workshopmongo.domain.User;
import com.joaoreis.workshopmongo.dto.AuthorDTO;
import com.joaoreis.workshopmongo.repository.PostRepository;
import com.joaoreis.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "partiu viagem", "Vou viajar para são Paulo. Abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("21/03/2018"), "Bom dia", "Acordei feliz hoje! ", new AuthorDTO(maria));


        postRepository.saveAll(Arrays.asList(post1,post2));
    }
}
