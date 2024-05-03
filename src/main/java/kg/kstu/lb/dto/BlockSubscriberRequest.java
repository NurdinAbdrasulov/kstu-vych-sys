package kg.kstu.lb.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BlockSubscriberRequest {

    @NotNull
    Long taxpayerId;
    String blockingDescription;
}
