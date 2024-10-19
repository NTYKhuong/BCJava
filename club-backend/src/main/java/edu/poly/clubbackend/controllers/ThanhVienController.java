package edu.poly.clubbackend.controllers;

import edu.poly.clubbackend.entity.ThanhVien;
import edu.poly.clubbackend.services.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:4200")
public class ThanhVienController {

    @Autowired
    private ThanhVienService thanhVienService;

    // Lấy danh sách tất cả thành viên, kèm thông tin câu lạc bộ
    @GetMapping("/getAll")
    public List<ThanhVien> getAllMembers() {
        return thanhVienService.getAllMembers();
    }

    @GetMapping("/getAllWithClub")
    public List<ThanhVien> getAllMembersWithClub() {
        return thanhVienService.getAllMembersWithClub();
    }

    // Lấy thông tin thành viên theo ID
    @GetMapping("/{id}")
    public ResponseEntity<ThanhVien> getMemberById(@PathVariable Long id) {
        ThanhVien member = thanhVienService.getMemberById(id);
        if (member != null) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Tạo thành viên mới
    @PostMapping("/create")
    public ThanhVien createMember(@RequestBody ThanhVien thanhVien) {
        return thanhVienService.saveMember(thanhVien);
    }

    // Cập nhật thông tin thành viên
    @PutMapping("/update/{id}")
    public ResponseEntity<ThanhVien> updateMember(@PathVariable Long id, @RequestBody ThanhVien thanhVienDetails) {
        ThanhVien member = thanhVienService.getMemberById(id);
        if (member != null) {
            member.setTentv(thanhVienDetails.getTentv());
            member.setSdt(thanhVienDetails.getSdt());
            member.setAnh(thanhVienDetails.getAnh());
            // Cập nhật câu lạc bộ nếu cần
            if (thanhVienDetails.getCauLacBo() != null) {
                member.setCauLacBo(thanhVienDetails.getCauLacBo());
            }
            return ResponseEntity.ok(thanhVienService.saveMember(member));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Xóa thành viên theo ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
        thanhVienService.deleteMember(id);
        return ResponseEntity.noContent().build();
    }
}
