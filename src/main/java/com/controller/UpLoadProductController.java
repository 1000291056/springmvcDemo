package com.controller;

import com.bean.UpLoadProduct;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wufeifei on 2016/12/22.
 */
@Controller
public class UpLoadProductController {
    private static final Log logger = LogFactory.getLog(UpLoadProductController.class);

    @RequestMapping("/uploadProduct_input")
    public String inputProduct(Model model) {
        model.addAttribute("product", new UpLoadProduct());
        return "UpLoadProductForm";
    }

    @RequestMapping("uploadproduct_save")
    public String saveProduct(HttpServletRequest servletRequest, @ModelAttribute UpLoadProduct product, BindingResult bindingResult, Model model) {
        List<String> fileNames = new ArrayList<String>();
        List<MultipartFile> files = product.getImages();
        if (null != files && files.size() > 0) {
            for (MultipartFile f : files
                    ) {
                String fileName = f.getOriginalFilename();
                fileNames.add(fileName);
                File file = new File(servletRequest.getServletContext().getRealPath("/WEB-INF/image"), fileName);
                try {
                    f.transferTo(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        model.addAttribute("product", product);
        return "UpLoadProductDetail";
    }
}
