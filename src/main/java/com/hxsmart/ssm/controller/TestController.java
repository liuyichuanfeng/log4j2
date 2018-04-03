package com.hxsmart.ssm.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
@RequestMapping("/test")

public class TestController {

    //上传文件会自动绑定到MultipartFile中
    @RequestMapping(value="/upload",method=RequestMethod.POST)
    public static Object upload(HttpServletRequest request,
                         @RequestParam("description") String description,
                         @RequestParam("file") MultipartFile file) throws Exception {

        System.out.println(description);
        System.out.print(request.getServletContext());
        System.out.print(request.getServletContext().getRealPath("/logs/"));
        //如果文件不为空，写入上传路径
        if(!file.isEmpty()) {
            //上传文件路径
//            String path = request.getServletContext().getRealPath("/images/");
            String path = System.getProperty("user.dir")+"/logs/";

            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + filename));
            return "success";
        } else {
            return "error";
        }

    }

}
