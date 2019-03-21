package drejinx.springframework.demo.controllers;

import drejinx.springframework.demo.services.jms.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FriendController {

    private ProductService productService;

    @Autowired // intention
    FriendController(ProductService productService){
        this.productService = productService;
    }

    public String getProductById(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProduct(id));
        return "product";
    }

}
