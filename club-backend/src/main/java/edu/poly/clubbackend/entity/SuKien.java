package edu.poly.clubbackend.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "su_kien")
public class SuKien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mask;

    @ManyToOne
    @JoinColumn(name = "maclb", nullable = false)
    private CauLacBo cauLacBo;

    @Column(nullable = false)
    private String tieude;

    @Column
    private LocalDate ngaydienra;

    @Column
    private String mota;

    @Column
    private String anh;

    // Getters and Setters
    public Long getMask() {
        return mask;
    }

    public void setMask(Long mask) {
        this.mask = mask;
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

    public LocalDate getNgaydienra() {
        return ngaydienra;
    }

    public void setNgaydienra(LocalDate ngaydienra) {
        this.ngaydienra = ngaydienra;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
