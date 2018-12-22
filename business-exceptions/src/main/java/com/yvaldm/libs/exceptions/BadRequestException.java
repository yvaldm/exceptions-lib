package com.yvaldm.libs.exceptions;

public class BadRequestException extends ServiceException {
    protected BadRequestException(String reason, String message) {
        super(400, reason, message);
    }

    public BadRequestException(String message) {
        this("BAD_REQUEST", message);
    }
}
