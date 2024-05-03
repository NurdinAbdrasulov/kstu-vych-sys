package kg.kstu.lb.entities;

import kg.kstu.lb.enums.SubscriberStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subscriber")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscriber extends BaseEntity {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subscriber_seq")
    @SequenceGenerator(name = "subscriber_seq", sequenceName = "subscriber_id_seq", allocationSize = 1)
    Long id;

    @Column(name = "tin", nullable = false)
    String tin;

    @Column(name = "balance", nullable = false)
    BigDecimal balance;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    SubscriberStatus status;

    @Column(name = "activation_date", nullable = false)
    LocalDateTime activationDate;

    @Column(name = "blocking_date")
    LocalDateTime blockingDate;

    @Column(name = "personal_account", nullable = false)
    String personalAccount;//todo позже после переговоров с mbank уточнить как генеировать (инн, номер тел или то что предложит mbank)

    @Column(name = "blocking_description")
    String blockingDescription;

    @Column(name = "taxpayer_id", nullable = false)
    Long taxpayerId;

}
