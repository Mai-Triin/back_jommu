package ee.valiit.back_jommu.validation;

import lombok.Getter;

@Getter
public enum BankError {
    INCORRECT_CREDENTIALS("Sellist kasutajanime või parooli ei leitud", "666");

    private String message;
    private String errorCode;

    BankError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
