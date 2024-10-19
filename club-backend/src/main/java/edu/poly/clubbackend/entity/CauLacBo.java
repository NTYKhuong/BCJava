package edu.poly.clubbackend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cau_lac_bo")
public class CauLacBo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maclb;

    @Column(nullable = false)
    private String tenclb;

    @Column
    private String mota;

    @Column
    private LocalDate ngaylap;

    @Column
    private String logo;

    // Getters and Setters
    public Long getMaclb() {
        return maclb;
    }

    public void setMaclb(Long maclb) {
        this.maclb = maclb;
    }

    public String getTenclb() {
        return tenclb;
    }

    public void setTenclb(String tenclb) {
        this.tenclb = tenclb;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public LocalDate getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(LocalDate ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
