package com.example.messaging.repository;
import com.example.messaging.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MessageRepository extends JpaRepository<Message,Long>{}