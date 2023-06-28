package fplhn.nhom5.xuongDuAn.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Component
@ToString
public class QuanLyHangKhachHangVM {
    @NotBlank(message = "Mã không được để trống")
    private String maHang;

    @NotBlank(message = "Tên Hạng không được để trống")
    private String tenHang;

    @NotBlank(message = "Mô tả không được để trống")
    private String moTa;

    @NotBlank(message = "Điểm tích lũy không được để trống")
    private String diemTichuy;

    @NotNull(message = "Điểm tích lũy không được để trống")
    private int trangThai;
}
