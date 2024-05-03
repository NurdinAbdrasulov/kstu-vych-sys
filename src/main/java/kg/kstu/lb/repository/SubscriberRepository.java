package kg.kstu.lb.repository;

import kg.kstu.lb.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    Optional<Subscriber> findByTaxpayerId(Long taxpayerId);
}
