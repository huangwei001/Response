package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by huangwei on 2017/6/26.
 */
public class TestResponse2 extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request,response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String data = "测试Response";

        //设置字符以“UTF-8”编码输出到客户端浏览器
        response.setCharacterEncoding("UTF-8");
        /**
         * PrintWriter out = response.getWriter();这句代码必须放在response.setCharacterEncoding("UTF-8");之后
         * 否则response.setCharacterEncoding("UTF-8")这行代码的设置将无效，浏览器显示的时候还是乱码
         */
        PrintWriter printWriter = response.getWriter();
        //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
        response.setHeader("content-type","text/html;charset=UTF-8");

        //response.getWriter().print("<meta http-equiv = 'content-type' content='text/html;charset=UTF-8'/>");

        printWriter.write(data);
    }
}
