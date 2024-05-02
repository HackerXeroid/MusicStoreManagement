package com.zaid.musicstoremanagement.controllers;

import com.zaid.musicstoremanagement.dtos.ProductDto;
import com.zaid.musicstoremanagement.exceptions.CategoryNotFoundException;
import com.zaid.musicstoremanagement.exceptions.ProductNotFoundException;
import com.zaid.musicstoremanagement.exceptions.SupplierNotFoundException;
import com.zaid.musicstoremanagement.models.Category;
import com.zaid.musicstoremanagement.models.Product;
import com.zaid.musicstoremanagement.repositories.CategoryRepository;
import com.zaid.musicstoremanagement.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) throws ProductNotFoundException {
        Product product = productService.getProductById(id);
        return productToDto(product);
    }
    @GetMapping
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productService.getAllProducts();
        return productListToProductDtoList(productList);
    }
    @GetMapping("/category/{id}")
    public List<ProductDto> getCategoryById(@PathVariable Long id) throws CategoryNotFoundException {
        List<Product> productList = productService.getProductsByCategory(id);
        return productListToProductDtoList(productList);
    }
    @GetMapping("/sortByPrice")
    public List<ProductDto> sortProductByPrice() throws ProductNotFoundException {
        List<Product> productList = productService.sortProductsByPrice();
        return productListToProductDtoList(productList);
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) throws ProductNotFoundException {
        productService.deleteProduct(id);
        return;
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) throws CategoryNotFoundException, SupplierNotFoundException {
        return productService.addProduct(product);
    }
    @PutMapping
    public Product updateProduct( @RequestBody Product product) throws ProductNotFoundException {
        return productService.updateProduct(product);
    }
    public List<ProductDto> productListToProductDtoList(List<Product> productList) {
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList) {
            productDtoList.add(productToDto(product));
        }
        return productDtoList;
    }
    public ProductDto productToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setDescription(product.getDescription());
        productDto.setCategory(product.getCategory().getCategoryName());
        productDto.setSupplier(product.getSupplier().getSupplierName());
        productDto.setStockLevel(product.getStockLevel());
        return productDto;
    }
}
