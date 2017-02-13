package by.htp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface DaoInterface {
public ResultSet  dbconnection(String query) throws SQLException;
}