package com.pys.controller;

import com.google.gson.Gson;
import com.pys.bean.Homework;
import com.pys.bean.User;
import com.pys.dao.HomeworkMapper;
import com.pys.service.HomeworkService;
import com.pys.util.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;
import java.util.UUID;

@Controller
public class HomeworkController {
    @Autowired
    private HomeworkService homeworkService;


    @RequestMapping("/submitHomework")
    @ResponseBody
    public void submitHomework(MultipartFile homework, HttpSession session, String id, String hid, String cid) throws IOException {
        String fileName = homework.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        homeworkService.submitHomework(new Homework(id, uuid, hid, cid, Time.getTime()));
        fileName = uuid + suffixName;
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("homework");
        File file = new File(photoPath);
        if (!file.exists()) {
            file.mkdir();
        }
        String finalPath = photoPath + File.separator + fileName;
        homework.transferTo(new File(finalPath));


    }

    @RequestMapping("/getScore")
    @ResponseBody
    public void getScore(String uid, String score) {
        homeworkService.getScore(uid, score);
    }

    @RequestMapping("/getSelfHomework")
    @ResponseBody
    public String getSelfHomework(String cid) {
        return new Gson().toJson(homeworkService.queryHomeworkById(cid));
    }

    @RequestMapping("/getSubmitHomework")
    @ResponseBody
    public String getSubmitHomework(String hid) {
        return new Gson().toJson(homeworkService.getSubmitHomework(hid));
    }

    @RequestMapping(value = "/queryNameById", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String queryNameById(String id) {
        return new Gson().toJson(homeworkService.queryNameById(id));
    }

    @RequestMapping("/word")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session, String uid) throws ServletException, IOException {
        File file = new File("E:\\workspace\\ktp\\out\\artifacts\\ktp_war_exploded\\homework\\" + uid + ".docx");
        ServletContext servletContext = session.getServletContext();
        System.out.println(file.getAbsolutePath());
        InputStream is = new FileInputStream(file);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename="+file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        is.close();
        return responseEntity;
    }

}
