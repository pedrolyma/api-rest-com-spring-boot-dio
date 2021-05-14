package one.digitalinnovation.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// mapa do banco de dados
@Entity
// inserir getter e setter
@Data
// construir objetos
@Builder
// inserir construtor com argumentos
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//  campo obrigatorio
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
//  cpf unico na tera dois iguais na tabela
    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;
// um para muitos um usuario tem varios telefones
// lazy para performace e cascade liga e desliga os telefones ao usuario
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones = new ArrayList<>();
}
