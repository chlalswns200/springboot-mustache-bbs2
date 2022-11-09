package com.example.springbootmustachebbs2.repository;

import com.example.springbootmustachebbs2.domain.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
