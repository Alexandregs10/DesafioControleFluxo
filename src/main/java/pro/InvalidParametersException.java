package pro;

public class InvalidParametersException extends Exception {
    public InvalidParametersException() {
        super("O parâmetro Um não pode ser maior que o dois");
    }
}