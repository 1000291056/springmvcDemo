package com.controller;


import com.bean.Product;
import com.bean.ProductForm;
import com.dao.TestService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wufeifei on 2016/12/16.
 */
@Controller
public class ProductController {
    private static final Log logger = LogFactory.getLog(ProductController.class);
    @Autowired
    private TestService testService;

    @RequestMapping("/product_input")
    public String inputProduct() {
        logger.info("inputProduct called");
        testService.Log("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save")
    public String saveProduct(ProductForm productForm, Model model) {
        logger.info("saveProduct called");
        Product product = new Product(productForm.getName(), productForm.getDescription(), productForm.getPrice());
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
