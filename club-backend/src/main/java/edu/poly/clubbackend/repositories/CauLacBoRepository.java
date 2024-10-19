package edu.poly.clubbackend.repositories;

import edu.poly.clubbackend.entity.CauLacBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CauLacBoRepository extends JpaRepository<CauLacBo, Long> {
    List<CauLacBo> findByTenclbContainingIgnoreCase(String name);
}

