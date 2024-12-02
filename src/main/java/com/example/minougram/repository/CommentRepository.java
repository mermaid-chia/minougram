package com.example.minougram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minougram.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}