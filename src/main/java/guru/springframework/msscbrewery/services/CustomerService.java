package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

/**
 * Created by ledio on 4/29/20
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
