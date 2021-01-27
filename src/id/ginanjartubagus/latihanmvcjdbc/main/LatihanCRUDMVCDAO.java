
package id.ginanjartubagus.latihanmvcjdbc.main;

import id.ginanjartubagus.latihanmvcjdbc.database.KingBarbershopDatabase;
import id.ginanjartubagus.latihanmvcjdbc.entity.Pelanggan;
import id.ginanjartubagus.latihanmvcjdbc.error.PelangganException;
import id.ginanjartubagus.latihanmvcjdbc.service.PelangganDao;
import id.ginanjartubagus.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar  Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program  : 
 */
public class LatihanCRUDMVCDAO {

    public static void main(String[] args) throws SQLException, PelangganException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
}
