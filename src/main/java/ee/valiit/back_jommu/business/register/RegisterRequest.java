package ee.valiit.back_jommu.business.register;

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
    private Integer roleId;
    private String email;
    private Boolean termsAccept = false;
    private String username;
    private String password;
    
}
