
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Product;

public class CatalogDAO {

    private static final String SELECT = "select * from catalog";
    private static final String SELECTDETAIL ="select * from catalog where id=?";

    private DataSource source;

    public CatalogDAO() {
        source = DaoUtil.getSource();
    }

    public Product getProduct(int id) throws SQLException{
        Connection con = source.getConnection();

        PreparedStatement pStmt = con.prepareStatement(SELECTDETAIL);
        ResultSet rs = null;
        
        try{
            pStmt.setInt(1,id);
            rs = pStmt.executeQuery();
        
            if(rs.next()){
                return getProduct(rs);
            }

        }catch(SQLException ex){
            throw ex;
        }finally{
            if(rs != null){
                rs.close();
            }
            pStmt.close();
            con.close();
        }
        
        return null;
    }

    public List<Product> getProductList() throws SQLException {
        List<Product> list = new ArrayList<Product>();
        Connection con = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;

        try {

            con = source.getConnection();

            pStmt = con.prepareStatement(SELECT);
            rs = pStmt.executeQuery();

            while (rs.next()) {
                list.add(getProduct(rs));
            }

        } catch (SQLException ex) {
            throw ex;
        } finally {
            rs.close();
            pStmt.close();
            con.close();
        }

        return list;
    }


   private Product getProduct(ResultSet rs) throws SQLException {

        //1) ResultSetからProductクラスへの変換
        Product pro = new Product();
        
        pro.setId(rs.getInt("id"));
        pro.setName(rs.getString("name"));
        pro.setPrice(rs.getInt("price"));
        pro.setDetail(rs.getString("detail"));
        pro.setPictureUrl(rs.getString("pictureurl"));
        
        return pro;
   }
}
