package com.example.demo.service1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao1.BookDao;
import com.example.demo.dto1.BookDto;

@Component
@Service
public class BookService {
	@Autowired
	BookDao dao;

	public String createAccount(BookDto dto) {
			return dao.createAccount(dto);
	}
	public BookDto fetch(int id) {
			Optional<BookDto> ob=dao.fetch(id);
			if (ob.isPresent()) {
				BookDto dto=ob.get();
				return dto;
			}else {
				return null;
			}
	}
	public List<BookDto> fetchAll() {
		return	dao.fetchAll();
	}
	public String update(BookDto dto) {
			return dao.update(dto);
	}
	public List<BookDto> login(BookDto dto) {
		List<BookDto> list=dao.login(dto);
		if (list.isEmpty()) {
			return null;
		}else {
			return list;
		}
	}
}
