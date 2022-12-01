package ee.valiit.back_jommu.domain.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Profile} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequest implements Serializable {
    private Integer profileId;
    @Size(max = 255)
    @NotNull
    private String firstName;
    @Size(max = 255)
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate dateOfBirth;
    @Size(max = 1)
    @NotNull
    private String gender;
    private Integer roleId;
    @Size(max = 255)
    @NotNull
    private String email;
    @NotNull
    private Boolean termsAccept = false;
    @Size(max = 255)
    @NotNull
    private String username;
    @Size(max = 255)
    @NotNull
    private String password;
}