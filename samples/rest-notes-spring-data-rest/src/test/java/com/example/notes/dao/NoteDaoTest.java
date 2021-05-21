package com.example.notes.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.notes.entity.Note;

/**
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class NoteDaoTest {
	@Autowired
	private NoteRepository noteRepository;
	
	@Test
	public void addO() {
		Note note=new Note();
		
		note.setBody("主体");
		note.setId(0);
		note.setTitle("标题");
		
		noteRepository.save(note);
	}
	@Test
	public void addMany() {
		for (int kk = 1; kk < 51; kk++) {
			Note note=new Note();
			
			note.setBody("主体"+kk);
			note.setId(kk);
			note.setTitle("标题"+kk);
			
			noteRepository.save(note);
		}
	}
}
