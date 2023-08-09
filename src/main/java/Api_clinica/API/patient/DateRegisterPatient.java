package Api_clinica.API.patient;

import Api_clinica.API.address.DateAdders;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DateRegisterPatient(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone,
        @NotBlank
        @NotBlank @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\?\\d{2}")
        String cpf,
        @NotBlank
        @Valid
        DateAdders adders
) {


}
