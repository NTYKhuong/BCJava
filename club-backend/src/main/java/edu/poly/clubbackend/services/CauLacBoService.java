package edu.poly.clubbackend.services;

import edu.poly.clubbackend.entity.CauLacBo;
import edu.poly.clubbackend.repositories.CauLacBoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauLacBoService {

    @Autowired
    private CauLacBoRepository cauLacBoRepository;

    public List<CauLacBo> getAllClubs() {
        return cauLacBoRepository.findAll();
    }

    public CauLacBo getClubById(Long id) {
        return cauLacBoRepository.findById(id).orElse(null);
    }

    public CauLacBo saveClub(CauLacBo cauLacBo) {
        return cauLacBoRepository.save(cauLacBo);
    }

    public void deleteClub(Long id) {
        cauLacBoRepository.deleteById(id);
    }

}
