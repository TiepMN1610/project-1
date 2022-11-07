/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Ban;

/**
 *
 * @author admin
 */
public class BanReposition {

    public List<Ban> getAll() {
        String query = "select b.Id, b.Ma, b.Ten, b.NgaySinh,b.SoThich, b.GioiTinh\n"
                + "from Ban b";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<Ban> listBan = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ban b = new Ban(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                listBan.add(b);
            }
            return listBan;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Ban b) {
        String query = "INSERT INTO [dbo].[Ban]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[SoThich]\n"
                + "           ,[GioiTinh])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, b.getMa());
            ps.setObject(2, b.getTen());
            ps.setObject(3, b.getNgaySinh());
            ps.setObject(4, b.getSoThich());
            ps.setObject(5, b.getGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(Ban b, String id) {
        String query = "UPDATE [dbo].[Ban]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] =?"
                + "      ,[NgaySinh] = ?"
                + "      ,[SoThich] =?"
                + "      ,[GioiTinh] =?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, b.getMa());
            ps.setObject(2, b.getTen());
            ps.setObject(3, b.getNgaySinh());
            ps.setObject(4, b.getSoThich());
            ps.setObject(5, b.getGioiTinh());
            ps.setObject(6, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[Ban]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<Ban> listNam(int gioiTinh) {
        String query = "select b.Id, b.Ma, b.Ten, b.NgaySinh,b.SoThich, b.GioiTinh\n"
                + "  from Ban b where b.GioiTinh like ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<Ban> listBan = new ArrayList<>();
            ps.setObject(1, gioiTinh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ban b = new Ban(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                listBan.add(b);
            }
            return listBan;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
