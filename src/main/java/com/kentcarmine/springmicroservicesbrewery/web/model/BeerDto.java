package com.kentcarmine.springmicroservicesbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null // prevent client from setting this value
    private UUID id;

    @Null // prevent client from setting this value
    private Integer version;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private Long upc;

    @NotNull
    @Positive
    private BigDecimal price;
    private Integer quantityOnHand;

    @Null // prevent client from setting this value
    private OffsetDateTime createdDate;

    @Null // prevent client from setting this value
    private OffsetDateTime lastModifiedDate;



}
