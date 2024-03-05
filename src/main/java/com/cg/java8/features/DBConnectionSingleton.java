package com.cg.java8.features;

import java.io.Serializable;

public class DBConnectionSingleton implements Cloneable, Serializable {
    private static DBConnectionSingleton dbConnection = null;
    public String name;
    public String url;

    private DBConnectionSingleton(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public static DBConnectionSingleton getDBConnection() {
        if (null == dbConnection) {
            synchronized (DBConnectionSingleton.class) {
                dbConnection = new DBConnectionSingleton("clientDB", "jdbc:mysql://myhost:3306/db_name");
            }
        }
        return dbConnection;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return dbConnection;
    }
}
