package Api_clinica.API.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String public_place;  //logradouro
    private String neighborhood; //bairro
    private String zip_code; //cep
    private String number;  //numero
    private String understanding; //compremento
    private String city;   //cidade
    private String uf;

    public Address(DateAdders date) {
        this.public_place = date.public_place();
        this.neighborhood = date.neighborhood();
        this.zip_code = date.zip_code();
        this.number = date.number();
        this.understanding = date.understanding();
        this.city = date.city();
        this.uf = date.uf();
    }
}
