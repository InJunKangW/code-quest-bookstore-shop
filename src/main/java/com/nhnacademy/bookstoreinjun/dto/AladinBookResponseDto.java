package com.nhnacademy.bookstoreinjun.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AladinBookResponseDto {
    private String title;
    private String cover;
    private String author;
    private String publisher;
    private String priceStandard;
    private String pubdate;
    private String priceSales;
    private String discount;
    private String isbn;
    private String isbn13;
}
