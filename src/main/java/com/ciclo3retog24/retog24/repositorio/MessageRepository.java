package com.ciclo3retog24.retog24.repositorio;

import org.aspectj.bridge.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
