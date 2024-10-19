package edu.poly.clubbackend.services;

import edu.poly.clubbackend.entity.ThanhVien;
import edu.poly.clubbackend.repositories.ThanhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanhVienService {

    @Autowired
    private ThanhVienRepository thanhVienRepository;

    // Sử dụng phương thức findAllWithClub để lấy tất cả thành viên kèm thông tin câu lạc bộ
    public List<ThanhVien> getAllMembers() {
        return thanhVienRepository.findAllWithClub(); // Cập nhật ở đây
    }

    // Lấy thông tin thành viên theo ID
    public ThanhVien getMemberById(Long id) {
        return thanhVienRepository.findById(id).orElse(null);
    }

    // Lưu thông tin thành viên mới hoặc cập nhật
    public ThanhVien saveMember(ThanhVien thanhVien) {
        return thanhVienRepository.save(thanhVien);
    }

    // Xóa thành viên theo ID
    public void deleteMember(Long id) {
        thanhVienRepository.deleteById(id);
    }

    public List<ThanhVien> getAllMembersWithClub() {
        return thanhVienRepository.findAllWithClub();
    }
}