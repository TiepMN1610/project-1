/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Ban;

/**
 *
 * @author admin
 */
public interface BanService {

    List<Ban> getAll();

    String add(Ban b);

    String update(Ban b, String id);

    String delete(String id);
    
    List<Ban> listNam(int gioiTinh);
}
