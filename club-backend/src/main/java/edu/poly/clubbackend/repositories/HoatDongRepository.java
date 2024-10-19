package edu.poly.clubbackend.repositories;

import edu.poly.clubbackend.entity.HoatDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoatDongRepository extends JpaRepository<HoatDong, Long> {
}
