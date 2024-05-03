package kg.kstu.lb.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class ServiceDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer priority;
    private Integer activityPeriod;
    private Boolean isAvailable;
}
