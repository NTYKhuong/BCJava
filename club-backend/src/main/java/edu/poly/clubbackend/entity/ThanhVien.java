package edu.poly.clubbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "thanh_vien")
public class ThanhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matv;

    @ManyToOne
    @JoinColumn(name = "maclb", nullable = false)
    private CauLacBo cauLacBo;

    @Column(nullable = false)
    private String tentv;

    @Column(nullable = false)
    private String sdt;

    @Column
    private String anh;

    // Getters and Setters
    public Long getMatv() {
        return matv;
    }

    public void setMatv(Long matv) {
        this.matv = matv;
    }

    public CauLacBo getCauLacBo() {
        return cauLacBo;
    }

    public void setCauLacBo(CauLacBo cauLacBo) {
        this.cauLacBo = cauLacBo;
    }

    public String getTentv() {
        return tentv;
    }

    public void setTentv(String tentv) {
        this.tentv = tentv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
