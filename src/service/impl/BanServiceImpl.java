/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Ban;
import reposition.BanReposition;
import service.BanService;

/**
 *
 * @author admin
 */
public class BanServiceImpl implements BanService {

    private BanReposition br = new BanReposition();

    @Override
    public List<Ban> getAll() {
        return br.getAll();
    }

    @Override
    public String add(Ban b) {
        if (b.getMa().isEmpty()) {
            return "Trong Ma";
        }
        if (b.getTen().isEmpty()) {
            return "Trong Ten";
        }
        if (b.getSoThich().isEmpty()) {
            return "Trong So Thich";
        }

        boolean add = br.add(b);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Ban b, String id) {
        boolean update = br.update(b, id);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = br.delete(id);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public List<Ban> listNam(int gioiTinh) {
        return br.listNam(gioiTinh);
    }

}
