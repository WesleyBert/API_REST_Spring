package Api_clinica.API.doctor;

import Api_clinica.API.adders.DateAdders;

public record DataDoctorResgister(String nome, String email, String crm, Specifity specifity, DateAdders adders) {
}
