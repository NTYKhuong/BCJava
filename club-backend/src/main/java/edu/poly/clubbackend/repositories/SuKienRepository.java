package edu.poly.clubbackend.repositories;

import edu.poly.clubbackend.entity.SuKien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuKienRepository extends JpaRepository<SuKien, Long> {
}
