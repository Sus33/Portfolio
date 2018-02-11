package manager;

import db.DBConnectionProvider;
import model.Book;

import java.sql.*;
import java.util.ArrayList;

public class BookManager {

    private Connection connection;
    private DBConnectionProvider provider;

    public BookManager() {
        provider = DBConnectionProvider.getInstance ();
        connection = provider.getConnection ();
    }

    public void addBook(Book book){
        String query = "INSERT INTO book(name,author,price,description,user_id)" +
                "VALUES ?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement
                    (query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString (1, book.getName ());
            preparedStatement.setString (2, book.getAuthor ());
            preparedStatement.setDouble (3, book.getPrice ());
            preparedStatement.setString (4, book.getDescription ());
            preparedStatement.setLong (5, book.getUserId ());
            preparedStatement.executeUpdate ();
            ResultSet result =  preparedStatement.getGeneratedKeys ();
            if (result.next()) {
                book.setId (result.getInt (1));
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
    public ArrayList<Book> getBooksByUserId(long userId){
        String query = "SELECT * from book where user_id = " + userId;
        Statement statement = null;
        ArrayList<Book> books = new ArrayList<> ();
        try {
            statement = connection.createStatement ();
            ResultSet resultSet = statement.executeQuery (query);
            while (resultSet.next ()){
                   Book book = new Book ();
                   book.setId (resultSet.getInt ("id"));
                   book.setName (resultSet.getString ("name"));
                   book.setAuthor (resultSet.getString ("author"));
                   book.setPrice (resultSet.getDouble ("price"));
                   book.setUserId (resultSet.getInt ("user_id"));
                   books.add (book);
            }
            return books;
        } catch (SQLException e) {
            throw new RuntimeException ("Failed to retrive books by user id from db", e);

        }
    }
}
