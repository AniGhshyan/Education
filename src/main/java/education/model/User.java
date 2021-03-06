package education.model;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Serialization
public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType1 type;

}
