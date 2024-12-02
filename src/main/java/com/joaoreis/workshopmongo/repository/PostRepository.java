package com.joaoreis.workshopmongo.repository;

import com.joaoreis.workshopmongo.domain.Post;
import com.joaoreis.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
