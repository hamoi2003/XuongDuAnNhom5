package fplhn.nhom5.xuongDuAn.controllers;

import fplhn.nhom5.xuongDuAn.repositories.QuanLyHangKhachHangRepository;
import fplhn.nhom5.xuongDuAn.request.QuanLyHangKhachHangVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/hang-kh")
public class QuanLyHangKhachHangController {
    @Autowired
    private QuanLyHangKhachHangRepository hkhRepo;

    @Autowired
    private QuanLyHangKhachHangVM hangKhachHangVM;

    
}
