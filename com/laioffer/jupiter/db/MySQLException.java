package com.laioffer.jupiter.db;

public class MySQLException extends RuntimeException {
    public MySQLException(String errorMessage) {
        // super call parent class
        super(errorMessage);
    }
}
