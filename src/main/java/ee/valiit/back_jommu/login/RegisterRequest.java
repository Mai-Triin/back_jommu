package ee.valiit.back_jommu.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Character gender;
    private String email;
    private Boolean termsAccept;
    private String username;
    private String password;
    
}
