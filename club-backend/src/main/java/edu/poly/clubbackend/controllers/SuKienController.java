package edu.poly.clubbackend.controllers;

import edu.poly.clubbackend.entity.SuKien;
import edu.poly.clubbackend.services.SuKienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class SuKienController {

    @Autowired
    private SuKienService suKienService;

    @GetMapping("/getAll")
    public List<SuKien> getAllEvents() {
        return suKienService.getAllEvents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SuKien> getEventById(@PathVariable Long id) {
        SuKien event = suKienService.getEventById(id);
        if (event != null) {
            return ResponseEntity.ok(event);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public SuKien createEvent(@RequestBody SuKien suKien) {
        return suKienService.saveEvent(suKien);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SuKien> updateEvent(@PathVariable Long id, @RequestBody SuKien suKienDetails) {
        SuKien event = suKienService.getEventById(id);
        if (event != null) {
            event.setTieude(suKienDetails.getTieude());
            event.setNgaydienra(suKienDetails.getNgaydienra());
            event.setMota(suKienDetails.getMota());
            event.setAnh(suKienDetails.getAnh());
            return ResponseEntity.ok(suKienService.saveEvent(event));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        suKienService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}
