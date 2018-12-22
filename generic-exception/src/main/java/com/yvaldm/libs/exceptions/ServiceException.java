package com.yvaldm.libs.exceptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties({"suppressed", "stack_trace", "localized_message", "cause", "stackTrace", "localizedMessage"})
public class ServiceException extends RuntimeException {

    private int code;
    private final String reason;

    @JsonCreator
    protected ServiceException(String reason, String message) {
        this(-1, reason, message);
    }

    public ServiceException(int statusCode, String reason, String message) {
        super(Objects.requireNonNull(message));
        this.reason = Objects.requireNonNull(reason);
        this.code = statusCode;
    }

    public String getReason() {
        return reason;
    }

    public int getCode() {
        return code;
    }
}