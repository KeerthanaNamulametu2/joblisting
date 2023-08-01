package com.careeco.joblisting.repository;

import com.careeco.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
