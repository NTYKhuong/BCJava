package edu.poly.clubbackend.controllers;

import edu.poly.clubbackend.entity.CauLacBo;
import edu.poly.clubbackend.services.CauLacBoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
@CrossOrigin(origins = "http://localhost:4200")
public class CauLacBoController {

    @Autowired
    private CauLacBoService cauLacBoService;

    @GetMapping("/getAll")
    public List<CauLacBo> getAllClubs() {
        return cauLacBoService.getAllClubs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CauLacBo> getClubById(@PathVariable Long id) {
        CauLacBo club = cauLacBoService.getClubById(id);
        if (club != null) {
            return ResponseEntity.ok(club);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public CauLacBo createClub(@RequestBody CauLacBo cauLacBo) {
        return cauLacBoService.saveClub(cauLacBo);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CauLacBo> updateClub(@PathVariable Long id, @RequestBody CauLacBo cauLacBoDetails) {
        CauLacBo club = cauLacBoService.getClubById(id);
        if (club != null) {
            club.setTenclb(cauLacBoDetails.getTenclb());
            club.setMota(cauLacBoDetails.getMota());
            club.setNgaylap(cauLacBoDetails.getNgaylap());
            club.setLogo(cauLacBoDetails.getLogo());
            return ResponseEntity.ok(cauLacBoService.saveClub(club));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteClub(@PathVariable Long id) {
        cauLacBoService.deleteClub(id);
        return ResponseEntity.noContent().build();
    }

}
