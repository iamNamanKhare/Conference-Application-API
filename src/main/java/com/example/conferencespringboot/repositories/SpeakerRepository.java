package com.example.conferencespringboot.repositories;

import com.example.conferencespringboot.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
