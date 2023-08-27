package com.example.demo.controller1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto1.BookDto;
import com.example.demo.service1.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired 
	BookService bs;
	
	@PostMapping("/insert")
	public String createAccount(@RequestBody BookDto dto) {
		return bs.createAccount(dto);
	}
	@GetMapping("/fetch")
	public BookDto fetch(@RequestBody BookDto dto) {
		return bs.fetch(dto.getId());
	}
	@GetMapping("/fetchall")
	public List<BookDto> fetchAll() {
		return bs.fetchAll();
	}
	@PutMapping("/update")
	public String update(@RequestBody BookDto dto) {
		return bs.update(dto);
	}
	@PostMapping("/login")
	public List<BookDto> login(@RequestBody BookDto dto) {
		return bs.login(dto);
	}
}
