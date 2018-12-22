package com.yvaldm.libs.exceptions;

/**
 * Exception class if not found
 *
 * @author valery.yakovlev
 * @since 22.12.2018
 */
public class NotFoundException extends ServiceException {

    protected NotFoundException(String reason, String message) {
        super(reason, message);
    }
}
