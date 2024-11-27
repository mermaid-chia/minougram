package com.example.minougram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minougram.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

	List<Topic> findAllByOrderByUpdatedAtDesc();
}
