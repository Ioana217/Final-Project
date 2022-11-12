package LibraryShop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {
    private String name;
    private int id;
    private int salary;
    private int age;
}
