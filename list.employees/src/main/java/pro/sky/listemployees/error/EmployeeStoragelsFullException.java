package pro.sky.listemployees.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeStoragelsFullException extends RuntimeException {

    public EmployeeStoragelsFullException() {
        super("Максимальное количество сотрудников превышено");
    }
}
