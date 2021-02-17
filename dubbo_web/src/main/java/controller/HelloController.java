package controller;

import com.dubbo_demo.api.HelloApi;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloController {

    @Autowired
    private HelloApi helloApi ;

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse resp){


        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{

            String str=helloApi.sayHello() ;
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(str);
            resp.setHeader("Access-Control-Allow-Origin","*");
        }catch (Exception e){
            e.printStackTrace();
        }

    }




    @RequestMapping("/file/zx.xsd")
    public void download(HttpServletRequest request, HttpServletResponse response){


        try{
            System.out.println("下载请求来了");
            //1.获取文件名
            String filename=request.getParameter("filename");
            //2.告诉客户端将要下载的文件的类型
            response.setContentType("application/xml");//最重要
            //3.告诉客户端该文件不是直接解析而是以附件的形式打开（即下载）
            response.setHeader("Content-Disposition","attachment;filename="+"zx.xsd");//最重要
            //4.获取文件的绝对路径
            String path="M:\\project\\xsd\\zx.xsd";
            //5.获取输出流
            ServletOutputStream output = response.getOutputStream();
            //6.获取输入流
            InputStream in=new FileInputStream(path);
            //7.开始输出文件
            int len=0;
            byte[] buffer=new byte[1024];
            while((len=in.read(buffer))>0) {
                output.write(buffer,0, len);
            }
            in.close();
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response){

        try{
            response.setContentType("text/plain");//最重要
            ServletOutputStream output = response.getOutputStream();
            String str="hello zhangxinak" ;
            byte[] cb=str.getBytes();
            output.write(cb);
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
