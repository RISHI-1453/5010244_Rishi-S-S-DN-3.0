package com.bookstoreapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDTO {
    private Long id;

    @NotNull
    @Size
