package edu.poly.clubbackend.repositories;

import edu.poly.clubbackend.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThanhVienRepository extends CrudRepository<ThanhVien, Long> {
    @Query("SELECT tv FROM ThanhVien tv JOIN FETCH tv.cauLacBo")
    List<ThanhVien> findAllWithClub();
}