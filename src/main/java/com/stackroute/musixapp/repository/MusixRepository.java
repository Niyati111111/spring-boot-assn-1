package com.stackroute.musixapp.repository;

import com.stackroute.musixapp.domain.Musix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusixRepository extends JpaRepository<Musix, Integer> {
}
