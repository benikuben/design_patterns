package org.example.proxy;

public class DBConnectionProxy implements DBConnection {
    private DBConnectionImpl dbConnection;
    private String dbName;

    public DBConnectionProxy(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void displayUrl() {
        if (dbConnection == null)
            dbConnection = new DBConnectionImpl(dbName);
        System.out.print("localhost:port/");
        dbConnection.displayUrl();
    }
}
