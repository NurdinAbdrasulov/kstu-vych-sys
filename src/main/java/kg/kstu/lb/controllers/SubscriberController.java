package kg.kstu.lb.controllers;

import jakarta.validation.Valid;
import kg.kstu.lb.dto.CreateSubscriberRequest;
import kg.kstu.lb.dto.SubscriberDto;
import kg.kstu.lb.services.SubscriberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscribers")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SubscriberController {

    SubscriberService subscriberEndpoint;

    @PostMapping
    public ResponseEntity<SubscriberDto> createSubscriber(@RequestBody @Valid CreateSubscriberRequest request) {
        SubscriberDto subscriberDto = null;//subscriberEndpoint.createSubscriber(request);
        return ResponseEntity.ok(subscriberDto);
    }

//    @PostMapping("/block")
//    public ResponseEntity<SubscriberDto> blockSubscriber(@RequestBody @Valid BlockSubscriberRequest request) {
//        SubscriberDto subscriberDto = subscriberEndpoint.blockSubscriber(request);
//        return ResponseEntity.ok(subscriberDto);
//    }
//
//    @PostMapping("/unblock/{taxpayerId}")
//    public ResponseEntity<SubscriberDto> unblockSubscriber(@PathVariable Long taxpayerId) {
//        SubscriberDto subscriberDto = subscriberEndpoint.unblockSubscriber(taxpayerId);
//        return ResponseEntity.ok(subscriberDto);
//    }
}

