package edu.poly.clubbackend.services;

import edu.poly.clubbackend.entity.HoatDong;
import edu.poly.clubbackend.repositories.HoatDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoatDongService {

    @Autowired
    private HoatDongRepository hoatDongRepository;

    public List<HoatDong> getAllActivities() {
        return hoatDongRepository.findAll();
    }

    public HoatDong getActivityById(Long id) {
        return hoatDongRepository.findById(id).orElse(null);
    }

    public HoatDong saveActivity(HoatDong hoatDong) {
        return hoatDongRepository.save(hoatDong);
    }

    public void deleteActivity(Long id) {
        hoatDongRepository.deleteById(id);
    }
}
