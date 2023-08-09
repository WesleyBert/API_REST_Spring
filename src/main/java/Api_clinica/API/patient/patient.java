package Api_clinica.API.patient;


import Api_clinica.API.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Patient")
@Table(name = "patients")
public class patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String phone;

    @Embedded
    private Address address;

    public patient(DateRegisterPatient data){
        this.name = data.name();
        this.cpf = data.cpf();
        this.email = data.email();
        this.phone = data.phone();
        this.address = new Address(data.adders());
    }
}
