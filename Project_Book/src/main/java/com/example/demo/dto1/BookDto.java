package com.example.demo.dto1;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity(name="my_books")
@Data
@Component
public class BookDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	private String publisher;
//	@Temporal(TemporalType.DATE)
//	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name="published_name")
	private  Date date;
}
