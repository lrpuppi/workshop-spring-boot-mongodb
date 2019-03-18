package com.lrp.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrp.workshopmongo.domain.Post;
import com.lrp.workshopmongo.repository.PostRepository;
import com.lrp.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Post post = repository.findOne(id);
		if(post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return post;
	}
}
