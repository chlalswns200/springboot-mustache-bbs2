package com.example.springbootmustachebbs2.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleDto {

    private Long id;
    private String title;
    private String content;


    public Article toEntity() {
        return new Article(this.id, this.title,this.content);
    }
}
