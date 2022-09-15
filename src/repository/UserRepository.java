package repository;

import com.mysql.jdbc.Connection;
import model.User;
import util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepository implements Repository<User>{

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(User user, User tr) {
        return false;
    }

    @Override
    public User read(String username, String password) {
        try (Connection conn = ConnectionManager.open()) {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO users (id, username, usersecondname, birthday, login, password, accessLevel) VALUES (?,?,?,?,?,?,?)");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public List<User> readAll() {
        List<User> users = new ArrayList<>();
        try (Connection conn = ConnectionManager.open()) {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users");
            String name;

            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                int idUser = resultSet.getInt("id");
                String userName = resultSet.getString("userName");
                String userSecondName = resultSet.getString("userSecondName");
                Date birthday = resultSet.getDate("birthday");
                String password = resultSet.getString("password");
                String login = resultSet.getString("login");
                String accessLevel = resultSet.getString("accessLevel");

                User user = new User(idUser, userName, userSecondName, birthday, login, password, accessLevel);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
