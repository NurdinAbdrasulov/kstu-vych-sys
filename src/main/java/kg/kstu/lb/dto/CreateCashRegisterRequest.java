package kg.kstu.lb.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCashRegisterRequest {
    @NotEmpty
    String rnm;

    @NotNull
    Long subscriberId;

    @NotNull
    LocalDateTime registrationDate;
}
