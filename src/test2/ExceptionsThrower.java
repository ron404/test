package test2;

class ExceptionsThrower {
    void throwRuntimeException(int i) {
        if (i <= 0) {
            throw new RuntimeException("Illegal argument: i must be <= 0");
        }
        throw new RuntimeException("Runtime exception occurred");
    }
}