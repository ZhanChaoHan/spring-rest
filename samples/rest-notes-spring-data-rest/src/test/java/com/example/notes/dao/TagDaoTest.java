package com.example.notes.dao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.notes.entity.Tag;


/**
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class TagDaoTest {
	@Autowired
	private TagRepository tagRepository;
	
	@Test
	public void addO() {
		Tag tag=new Tag();
		
		tag.setId(0);
		tag.setName("标签一");
		
		tagRepository.save(tag);
	}
	@Test
	public void addMany() {
		for (int kk = 1; kk < 51; kk++) {
			Tag tag=new Tag();
			
			tag.setId(kk);
			tag.setName("标签一"+kk);
			
			tagRepository.save(tag);
		}
	}
}
