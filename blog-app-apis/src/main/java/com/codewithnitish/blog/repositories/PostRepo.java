package com.codewithnitish.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codewithnitish.blog.entities.Category;
import com.codewithnitish.blog.entities.Post;
import com.codewithnitish.blog.entities.User;
import com.codewithnitish.blog.payloads.PostDto;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	
	List<Post> findByUser(User user);
	
	
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);

}
