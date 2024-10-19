package edu.poly.clubbackend.controllers;

import edu.poly.clubbackend.entity.HoatDong;
import edu.poly.clubbackend.services.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
@CrossOrigin(origins = "http://localhost:4200")
public class HoatDongController {

    @Autowired
    private HoatDongService hoatDongService;

    @GetMapping("/getAll")
    public List<HoatDong> getAllActivities() {
        return hoatDongService.getAllActivities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HoatDong> getActivityById(@PathVariable Long id) {
        HoatDong activity = hoatDongService.getActivityById(id);
        if (activity != null) {
            return ResponseEntity.ok(activity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public HoatDong createActivity(@RequestBody HoatDong hoatDong) {
        return hoatDongService.saveActivity(hoatDong);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HoatDong> updateActivity(@PathVariable Long id, @RequestBody HoatDong hoatDongDetails) {
        HoatDong activity = hoatDongService.getActivityById(id);
        if (activity != null) {
            activity.setTieude(hoatDongDetails.getTieude());
            activity.setMota(hoatDongDetails.getMota());
            activity.setNgaythuchien(hoatDongDetails.getNgaythuchien());
            activity.setDiadiem(hoatDongDetails.getDiadiem());
            activity.setTrangthai(hoatDongDetails.getTrangthai());
            return ResponseEntity.ok(hoatDongService.saveActivity(activity));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id) {
        hoatDongService.deleteActivity(id);
        return ResponseEntity.noContent().build();
    }
}
