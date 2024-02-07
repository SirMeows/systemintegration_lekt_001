import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private ArrayList hobbies;
}
