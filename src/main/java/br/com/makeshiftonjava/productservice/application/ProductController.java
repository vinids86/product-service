package br.com.makeshiftonjava.productservice.application;

import br.com.makeshiftonjava.productservice.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/products"))
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Product> retrieveProduct(@PathVariable Long id) {
        LOG.info("/products called");
        return ResponseEntity.ok(new Product(id, "Teste"));
    }
}
