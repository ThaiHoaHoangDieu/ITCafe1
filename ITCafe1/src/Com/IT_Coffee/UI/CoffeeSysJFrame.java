/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.IT_Coffee.UI;

import Com.IT_Coffee.utils.Auth;
import Com.IT_Coffee.utils.MsgBox;
import Com.IT_Coffee.utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

/**
 *
 * @author HMD
 */
public class CoffeeSysJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CoffeeSysJFrame
     */
    public CoffeeSysJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jPanel = new javax.swing.JPanel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        btnLichsu = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnSanPham = new javax.swing.JButton();
        btnThanhVien = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGioiThieu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniSanPham = new javax.swing.JMenuItem();
        mniThanhVien = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniLSBH = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlTrangThai.setBackground(new java.awt.Color(255, 204, 255));

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(153, 0, 51));
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/coffeesys32.png"))); // NOI18N
        lblTrangThai.setText("Hệ quản lý IT Coffee");

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(153, 0, 51));
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDongHo.setText("00:00:00 AM");
        lblDongHo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(51, 0, 102));
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaiTro.setText("Vai Trò - (Chưa đăng nhập)");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/dongho32.png"))); // NOI18N
        jLabel1.setText(" ");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai)
                .addGap(320, 320, 320)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDongHo)
                    .addComponent(lblVaiTro)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(13, 13, 88));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/dangxuat32.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKetThuc.setForeground(new java.awt.Color(255, 255, 255));
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/ketthuc32.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/banhang32.png"))); // NOI18N
        jButton1.setText("Bán hàng");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(5, 10, 5, 10));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnLichsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLichsu.setForeground(new java.awt.Color(255, 255, 255));
        btnLichsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/lichsu32.png"))); // NOI18N
        btnLichsu.setText("Lịch sử");
        btnLichsu.setFocusable(false);
        btnLichsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLichsu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnLichsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichsuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLichsu);

        btnDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/doanhthu32.png"))); // NOI18N
        btnDoanhThu.setText("Doanh thu");
        btnDoanhThu.setFocusable(false);
        btnDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoanhThu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnDoanhThu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDoanhThu);
        jToolBar1.add(jSeparator8);

        btnSanPham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/sanpham32.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);

        btnThanhVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/thanhvien32.png"))); // NOI18N
        btnThanhVien.setText("Thành viên");
        btnThanhVien.setFocusable(false);
        btnThanhVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThanhVien.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnThanhVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThanhVien);

        btnNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/nhanvien32.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);
        jToolBar1.add(jSeparator2);

        btnGioiThieu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGioiThieu.setForeground(new java.awt.Color(255, 255, 255));
        btnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/gioithieu32.png"))); // NOI18N
        btnGioiThieu.setText("Giới thiệu");
        btnGioiThieu.setFocusable(false);
        btnGioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioiThieu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnGioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioiThieuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGioiThieu);

        jPanel2.add(jToolBar1);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setBackground(new java.awt.Color(18, 32, 4));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/coffeee.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mnuHeThong.setText("Hệ thống");
        mnuHeThong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuHeThong.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/dangnhap24.png"))); // NOI18N
        mniDangNhap.setText("    Đăng nhập");
        mniDangNhap.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/dangxuat24.png"))); // NOI18N
        mniDangXuat.setText("    Đăng xuất");
        mniDangXuat.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator3);

        mniDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/doimatkhau24.png"))); // NOI18N
        mniDoiMatKhau.setText("    Đổi mật khẩu");
        mniDoiMatKhau.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator4);

        mniKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/ketthuc24.png"))); // NOI18N
        mniKetThuc.setText("    Kết thúc");
        mniKetThuc.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuQuanLy.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/sanpham24.png"))); // NOI18N
        mniSanPham.setText("    Sản phẩm     ");
        mniSanPham.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniSanPham);

        mniThanhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/thanhvien24.png"))); // NOI18N
        mniThanhVien.setText("    Thành viên");
        mniThanhVien.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThanhVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniThanhVien);
        mnuQuanLy.add(jSeparator6);

        mniNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/nhanvien24.png"))); // NOI18N
        mniNhanVien.setText("    Nhân viên");
        mniNhanVien.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");
        mnuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuThongKe.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniLSBH.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mniLSBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/LichSu24.png"))); // NOI18N
        mniLSBH.setText("Lịch sử bán hàng");
        mniLSBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLSBHActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLSBH);
        mnuThongKe.add(jSeparator9);

        mniDoanhThu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/doanhthu24.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");
        mnuTroGiup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuTroGiup.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniHuongDan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/huongdan24.png"))); // NOI18N
        mniHuongDan.setText("    Hướng dẫn    ");
        mniHuongDan.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);
        mnuTroGiup.add(jSeparator5);

        mniGioiThieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/icon/gioithieu24.png"))); // NOI18N
        mniGioiThieu.setText("    Giới thiệu");
        mniGioiThieu.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.ketThuc();
    }//GEN-LAST:event_formWindowClosing

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        this.sanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhVienActionPerformed
        // TODO add your handling code here:
        this.thanhVien();
    }//GEN-LAST:event_btnThanhVienActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        this.nhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioiThieuActionPerformed
        // TODO add your handling code here:
        this.gioiThieu();
    }//GEN-LAST:event_btnGioiThieuActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.doiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        this.ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        this.banHang();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.banHang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
        // TODO add your handling code here:
        this.sanPham();
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThanhVienActionPerformed
        // TODO add your handling code here:
        this.thanhVien();
    }//GEN-LAST:event_mniThanhVienActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        // TODO add your handling code here:
        this.nhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniLSBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLSBHActionPerformed
        // TODO add your handling code here:
        this.lichSuBanHang();
    }//GEN-LAST:event_mniLSBHActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        // TODO add your handling code here:
        this.doanhThu();
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        this.gioiThieu();
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void btnLichsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichsuActionPerformed
        // TODO add your handling code here:
        this.lichSuBanHang();
    }//GEN-LAST:event_btnLichsuActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
        this.doanhThu();
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
        this.openHuongDan();
    }//GEN-LAST:event_mniHuongDanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoffeeSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeSysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnLichsu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThanhVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniLSBH;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenuItem mniThanhVien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlTrangThai;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setIconImage(XImage.getAppIcon());
        this.setTitle("HỆ THỐNG QUẢN LÝ IT COFFEE");
        this.setLocationRelativeTo(null);

        new ChaoJDialog(this, true).setVisible(true);
        new DangNhapDiaLog(this, true).setVisible(true);

        this.startDongHo();
        this.startVaiTro();

        btnDangXuat.setEnabled(Auth.isLogin());

        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                lblVaiTro.setText("Quản lý - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
            } else {
                lblVaiTro.setText("Nhân viên - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
            }
        } else {
            lblVaiTro.setText("Vai trò - (Chưa đăng nhập)");
        }
    }

    void startDongHo() {
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String timeStamp = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss").format(Calendar.getInstance().getTime());
                lblDongHo.setText(timeStamp);
            }
        }).start();
    }

    void startVaiTro() {
        new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Auth.isLogin()) {
                    if (Auth.isManager()) {
                        lblVaiTro.setText("Quản lý - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
                    } else {
                        lblVaiTro.setText("Nhân viên - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
                    }
                } else {
                    lblVaiTro.setText("Vai trò - (Chưa đăng nhập)");
                }
            }
        }).start();
    }

    void dangXuat() {
        Auth.clear();
        new DangNhapDiaLog(this, true).setVisible(true);
        btnDangXuat.setEnabled(Auth.isLogin());
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }

    void lichSuBanHang() {
        if (Auth.isLogin()) {
            new LichSuBanHangDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void doanhThu() {
        if (Auth.isLogin()) {
            new ThongKeJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void nhanVien() {
        if (Auth.isLogin()) {
            new NhanVienDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void thanhVien() {
        if (Auth.isLogin()) {
            new ThanhVienDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void doiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void sanPham() {
        if (Auth.isLogin()) {
            new SanPhamDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void banHang() {
        if (Auth.isLogin()) {
            new BanHangJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void gioiThieu() {
        if (Auth.isLogin()) {
            new GioiThieuDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/huongDanSuDungPhanMem.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "không tìm thấy file hướng dẫn!");
        }
    }

}
