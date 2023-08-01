package com.careeco.joblisting.repository;

import com.careeco.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {


}
