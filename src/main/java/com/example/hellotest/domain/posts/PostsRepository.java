package com.example.hellotest.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//Dao
public interface PostsRepository  extends JpaRepository<Posts, Long> {
}
