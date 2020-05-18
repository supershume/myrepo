/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: xpathdemo01
 * Author:   sky
 * Date:     2019/8/17 19:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.szh.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import sun.nio.cs.ext.GBK;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author sky
 * @create 2019/8/17
 * @since 1.0.0
 */
public class xpathdemo01 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = xpathdemo01.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//name");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("============");
        List<JXNode> jxNodes2 = jxDocument.selN("/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
        System.out.println("=============");
        List<JXNode> jxNodes3 = jxDocument.selN("//xing |//ming");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
        List<JXNode> jxNodes4=jxDocument.selN("//@id");
        System.out.println("?????"+jxNodes3+"?????????");
        for (JXNode jxNode:jxNodes4){
            System.out.println("===========id=============");
            System.out.println(jxNode);
        }
        List<Object> jxNodeobj=jxDocument.sel("//name");

        for (Object jxNodes1:jxNodeobj){
            System.out.println("===========object=============");
            System.out.println(jxNodes1);
        }
        System.out.println("1..."+jxNodeobj+"00>>");
        for (Object jxNodes1:jxNodeobj){
            System.out.println("===========tostring=============");
            System.out.println(jxNodes1);
            System.out.println("我是dev分支");
        }
    }
}
