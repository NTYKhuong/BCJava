package edu.poly.clubbackend.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "hoat_dong")
public class HoatDong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "maclb", nullable = false)
    private CauLacBo cauLacBo;

    @Column(nullable = false)
    private String tieude;
    @Column
    private String mota;

    @Column
    private LocalDate ngaythuchien;

    @Column
    private String diadiem;

    @Column
    private String trangthai;

    @Column
    private String anh;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CauLacBo getCauLacBo() {
        return cauLacBo;
    }

    public void setCauLacBo(CauLacBo cauLacBo) {
        this.cauLacBo = cauLacBo;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public LocalDate getNgaythuchien() {
        return ngaythuchien;
    }

    public void setNgaythuchien(LocalDate ngaythuchien) {
        this.ngaythuchien = ngaythuchien;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
