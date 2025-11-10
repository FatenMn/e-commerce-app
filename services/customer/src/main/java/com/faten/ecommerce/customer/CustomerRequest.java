package com.faten.ecommerce.customer;

import jakarta.validation.constraints.NotNull;

public record  CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstName,
        @NotNull(message = "Customer lastname is required")
        String lastName,
        @NotNull(message = "Customer email is required")
        String email,
        Adress adress) {

}
