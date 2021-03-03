package com.example.conferencespringboot.repositories;

import com.example.conferencespringboot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
