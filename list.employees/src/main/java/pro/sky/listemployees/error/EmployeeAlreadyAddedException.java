package pro.sky.listemployees.error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException( String firstName,String lastName){
        super("Сотрудник  %s %s с такими данными уже добавлен.".formatted(firstName,lastName) );
        }
}
