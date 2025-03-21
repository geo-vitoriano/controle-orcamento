package com.projeto.orcamento.domain.pagamentos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "pagamento")
@Entity(name = "Pagamento")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")


public class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String codigo;
    private BigDecimal valor;
    private Boolean ativo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
   // @Enumerated(EnumType.STRING)
   // private Classes classe;


}
