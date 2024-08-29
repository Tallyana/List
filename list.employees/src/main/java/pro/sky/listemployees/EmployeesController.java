package pro.sky.listemployees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employees")
@RestController
public class EmployeesController {
    private final EmployeesService EmployeesService;

    public EmployeesController(EmployeesService employeesService) {

        this.employeesService = employeesService;
    }
}
