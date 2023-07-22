package org.example.proxy;

public class DBConnectionImpl implements DBConnection {
    private String dbName;

    public DBConnectionImpl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void displayUrl() {
        System.out.print(dbName);
    }
}
