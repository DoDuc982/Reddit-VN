package com.programming.reddit.repository;

import com.programming.reddit.model.Post;
import com.programming.reddit.model.Subreddit;
import com.programming.reddit.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit, Sort sort);

    List<Post> findByUser(User user);
}
