package edu.poly.clubbackend.services;

import edu.poly.clubbackend.entity.SuKien;
import edu.poly.clubbackend.repositories.SuKienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuKienService {

    @Autowired
    private SuKienRepository suKienRepository;

    public List<SuKien> getAllEvents() {
        return suKienRepository.findAll();
    }

    public SuKien getEventById(Long id) {
        return suKienRepository.findById(id).orElse(null);
    }

    public SuKien saveEvent(SuKien suKien) {
        return suKienRepository.save(suKien);
    }

    public void deleteEvent(Long id) {
        suKienRepository.deleteById(id);
    }
}
