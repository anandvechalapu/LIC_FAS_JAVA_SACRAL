package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.customer.customercheckercontroller.model.Customer;

public interface CustomerCheckerControllerRepository extends JpaRepository<Customer, Long> {
	
    Customer findByCustomerId(Long customerId);

    Customer findByCustomerIdAndTrustCode(Long customerId, String trustCode);

    Customer findByCustomerIdAndTrustCodeAndTrustName(Long customerId, String trustCode, String trustName);

}

package com.lic.epgs.customer.customercheckercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.model.Customer;
import com.lic.epgs.customer.customercheckercontroller.service.CustomerCheckerControllerService;

@RestController
@RequestMapping("/customer")
public class CustomerCheckerController {

    @Autowired
    private CustomerCheckerControllerService customerCheckerControllerService;

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable Long customerId) {
        return customerCheckerControllerService.getCustomer(customerId);
    }

    @GetMapping("/{customerId}/{trustCode}")
    public Customer getCustomer(@PathVariable Long customerId, @PathVariable String trustCode) {
        return customerCheckerControllerService.getCustomer(customerId, trustCode);
    }

    @GetMapping("/{customerId}/{trustCode}/{trustName}")
    public Customer getCustomer(@PathVariable Long customerId, @PathVariable String trustCode, @PathVariable String trustName) {
        return customerCheckerControllerService.getCustomer(customerId, trustCode, trustName);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerCheckerControllerService.getAllCustomers();
    }
}