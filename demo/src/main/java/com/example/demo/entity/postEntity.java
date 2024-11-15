package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class postEntity {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "postID")
	private Integer id;

    @Column(name = "author")
	private String author;

    @Column(name = "title")
	private String title;

    @Column(name = "body")
	private String body;

	public Integer getID(){
		return this.id;
	}

	public String getAuthor(){
		return this.author;
	}

	public String geTitle(){
		return this.title;
	}

	public String getBody(){
		return this.body;
	}

}

