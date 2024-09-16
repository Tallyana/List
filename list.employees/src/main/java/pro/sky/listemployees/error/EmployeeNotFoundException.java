package pro.sky.listemployees.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException( String firstName,String lastName){
        super("Сотрудник  %s %s с такими данными не найден.".formatted(firstName,lastName) );
    }
}


