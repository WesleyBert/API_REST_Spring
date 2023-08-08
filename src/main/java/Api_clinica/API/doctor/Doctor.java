package Api_clinica.API.doctor;

import Api_clinica.API.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name= "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DataDoctorRegister data) {

        this.name = data.name();
        this.email = data.email();
        this.crm = data.crm();
        this.specialty = data.specialty();
        this.address = new Address(data.adders());

    }
}
