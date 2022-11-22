package ee.valiit.back_jommu.validation;

import ee.valiit.back_jommu.domain.userrole.user.User;
import ee.valiit.back_jommu.infrastructure.exception.BusinessException;

import java.util.Optional;

public class Validation {

    public static void validateUserCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(JommuError.INCORRECT_CREDENTIALS.getMessage(),
                    JommuError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }
}
