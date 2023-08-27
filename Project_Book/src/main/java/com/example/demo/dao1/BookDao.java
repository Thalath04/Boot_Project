package com.example.demo.dao1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto1.BookDto;
import com.example.demo.repository1.BookRepository;

@Component
public class BookDao {
	@Autowired
	BookRepository br;
	public String createAccount(BookDto dto) {
			br.save(dto);
			return "Data Inserted";
	}
	public Optional<BookDto> fetch(int id) {
			return br.findById(id);
			
	}
	public List<BookDto> fetchAll() {
			return br.findAll();
	}
	public String update(BookDto dto) {
		br.save(dto);
		return "Vallues Updated";
	}
	public List<BookDto> login(BookDto dto) {
			return br.validate(dto.getId(), dto.getTitle());
	}

}
