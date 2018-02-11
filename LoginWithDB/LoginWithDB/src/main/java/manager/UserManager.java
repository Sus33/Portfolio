package manager;

import db.DBConnectionProvider;
import model.Gender;
import model.User;

import java.sql.*;

public class UserManager {
    private Connection connection;
    private DBConnectionProvider provider;

    public UserManager() {
        provider = DBConnectionProvider.getInstance ();
        connection = provider.getConnection ();
    }

    public void addUser(User user) {
        String query = "INSERT INTO user(name,surename,email,gender,password)" +
                "VALUES ?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement
                    (query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString (1, user.getName ());
            preparedStatement.setString (2, user.getSurname ());
            preparedStatement.setString (3, user.getEmail ());
            preparedStatement.setString (4, user.getGender ().name ());
            preparedStatement.setString (5, user.getPassword ());
            preparedStatement.executeUpdate ();
            ResultSet result =  preparedStatement.getGeneratedKeys ();
            if (result.next()) {
                user.setId (result.getInt (1));
            }

        } catch (SQLException e) {
            throw new RuntimeException ("Failed to save user to db", e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    public User getUserEmailAndPassword(String email, String password) {
        String query = "SELECT * FROM user WHERE email='"
                + email + "'AND password='" + password + "'";
        Statement stmt = null;
        try {
            stmt = connection.createStatement ();
            ResultSet result = stmt.executeQuery (query);
            if (result.next ()) {
                User user = new User ();
                user.setId (result.getInt ("id"));
                user.setName (result.getString ("name"));
                user.setSurname (result.getString ("surename"));
                user.setGender (Gender.valueOf (result.getString ("gender")));
                user.setEmail (result.getString ("email"));
                user.setPassword (result.getString ("password"));
                return user;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException ("Failed to retrieve user from db", e);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
    public boolean isEmailExsist(String email) {
        String query = "SELECT count(*) FROM user WHERE email='"+ email + "'";
        Statement stmt = null;

        try {
            stmt = connection.createStatement ();
            ResultSet result = stmt.executeQuery (query);
            if (result.next ()){
                int count = result.getInt (1);
                return count > 0;
            }else {
                return false;
            }
        }catch (Exception e){
          throw new  RuntimeException ("Failed to check email on db",e);
        }finally {
            if (stmt != null){
                try {
                    stmt.close ();
                }catch (SQLException e){
                    e.printStackTrace ();
                }
            }
        }
    }
}
