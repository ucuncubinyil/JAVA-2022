package com.company.dao;

import com.company.db.ConnectionFactory;
import com.company.entity.UserEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Vertabanındaki asıl işleri yapan sınıftır.
 */
public class UserDao {

    // Bağlantı oluşturmak için gerekli nesnedir
    private Connection connection;

    // Bu sınıf çağırıldığında veritabanına bağlantıyı sağlar
    public UserDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // Vertabanına UserEntity yapısına göre veri ekler
    public UserEntity insertUser(UserEntity userEntity) {

        //Veri eklemek için gerekli SQL komutlarını barındırır
        String sqlString = " INSERT INTO users (id,username, password) " +
                " VALUES(?,?,?)";

        // Parametrik olarak veri girilmesine olanak sağşar
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setLong(1, userEntity.getId());
            stmt.setString(2, userEntity.getUsername());
            stmt.setString(3, userEntity.getPassword());

            // SQL imizi sunucuya gönderir
            stmt.execute();

            // Veritabanı bağlantımızı kapatır
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return  userEntity;
    }

    // Kullanıcı siler
    public void deleteUser(Long userId) {

        String sql = "DELETE FROM users where id = ?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, userId);
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException exception) {
            exception.getMessage();
        }
    }


    //Tüm kullanıcıları listeler
    public List<UserEntity> getAllUsers() {

        List<UserEntity> userEntityList =new ArrayList<>();
        try {
            String sql = "SELECT * FROM users";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                UserEntity userEntity = new UserEntity();
                userEntity.setId(rs.getLong("id"));
                userEntity.setUsername(rs.getString("username"));
                userEntity.setPassword(rs.getString("password"));
                userEntityList.add(userEntity);
            }

        } catch (SQLException exception) {
            exception.getMessage();
        }

        return  userEntityList;
    }

    // Kullanıcı bilgilerini günceller
    public void updateUser(UserEntity userEntity) {

        String sql = "UPDATE users SET  username=?, password=? where id = ?";
        try {

            PreparedStatement pt = connection.prepareStatement(sql);
            pt.setString(1, userEntity.getUsername());
            pt.setString(2, userEntity.getPassword());
            pt.setLong(3, userEntity.getId());

            pt.execute();
            pt.close();

        } catch (SQLException e) {
            e.getMessage();
        }

    }

    // Toplam kullanıcı sayısını getirir
    public Long getTotalUserCount() {
        String sql = "SELECT * FROM users";
        Long totalCount = null;
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                resultSet.last();
                totalCount = Long.valueOf(resultSet.getRow());
            } catch (SQLException e) {
                throw e;
            }

        } catch (SQLException exception) {
            exception.getMessage();
        }

        return totalCount;

    }
}
