package com.ms.email.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


public record EmailDto(@NotBlank String ownerRef, @NotBlank @Email String emailFrom, @NotBlank @Email String emailTo, @NotBlank String subject, @NotBlank String text) {

}
