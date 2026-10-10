package cn.edu.campusreservation.common;

public enum ResultCode {
    SUCCESS(200, "success"),
    ERROR(500, "error"),
    UNAUTHORIZED(401, "unauthorized"),
    FORBIDDEN(403, "forbidden"),
    NOT_FOUND(404, "not found"),
    VALIDATION_ERROR(400, "validation error");

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
