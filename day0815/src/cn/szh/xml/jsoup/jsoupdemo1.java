package cn.szh.xml.jsoup; /**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: jsoupdemo1
 * Author:   sky
 * Date:     2019/8/15 19:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.File;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author sky
 * @create 2019/8/15
 * @since 1.0.0
 */
public class jsoupdemo1 {
    public static void main(String[] args) throws IOException {
        //获取路径
        String path=jsoupdemo1.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文件 获取DOM树——document
        Document document=Jsoup.parse(new File(path),"utf-8");
       Elements elements=document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println(elements.get(0));
        System.out.println(elements.get(0).text());


    }
}
