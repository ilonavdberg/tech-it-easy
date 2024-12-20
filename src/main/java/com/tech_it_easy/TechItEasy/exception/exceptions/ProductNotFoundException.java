package com.tech_it_easy.TechItEasy.exception.exceptions;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(Long productId) {
    super("The product you requested with ID " + productId + " does not exist.");
  }
}
