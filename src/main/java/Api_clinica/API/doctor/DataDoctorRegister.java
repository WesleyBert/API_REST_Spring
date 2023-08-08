package Api_clinica.API.doctor;

import Api_clinica.API.address.DateAdders;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;

public record DataDoctorRegister(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
                @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Specialty specialty,
        @Valid
        @NotNull
        DateAdders adders) {
}
