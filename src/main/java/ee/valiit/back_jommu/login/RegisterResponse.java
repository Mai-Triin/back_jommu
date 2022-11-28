package ee.valiit.back_jommu.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse implements Serializable {

    private Integer userId;
    private Integer roleId;
    private String roleType;
}
