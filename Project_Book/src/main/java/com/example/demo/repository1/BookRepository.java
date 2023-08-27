package com.example.demo.repository1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto1.BookDto;
@Repository
public interface BookRepository extends JpaRepository<BookDto, Integer>{

	@Query("select data from BookDto data where id=:fid and title=:ftitle")
	public List<BookDto> validate(int fid,String ftitle);
}
