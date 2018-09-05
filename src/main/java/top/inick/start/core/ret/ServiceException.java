package top.inick.start.core.ret;

import java.io.Serializable;

public class ServiceException extends RuntimeException implements Serializable {
    private static final long seriaVersionUID = 1L;

    public ServiceException() {

    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
