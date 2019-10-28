package com.allen198411.test;

import com.allen198411.supercore.SuperJavaDoc;
import com.allen198411.superspring.format.HtmlForamt;
import com.allen198411.superspring.format.MarkdownFormat;
import com.allen198411.superspring.framework.SpringWebFramework;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author allen
 * @version JavaDocTest.java, v 0.1 2019-10-26 下午 6:41
 */
public class JavaDocTest {

    @Test
    public void buildMarkdown() {
        //生成离线的Markdown格式的接口文档
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String rootDir = System.getProperty("user.dir");
        SuperJavaDoc xDoc = new SuperJavaDoc(rootDir + "/src/main/java/com/allen198411", new SpringWebFramework());
        xDoc.build(out, new MarkdownFormat());

        System.out.println(out.toString());
    }

    @Test
    public void buildHtml() throws Exception {
        //生成离线的HTML格式的接口文档
        String userDir = System.getProperty("user.dir");
        FileOutputStream out = new FileOutputStream(new File(userDir, "api.html"));
        SuperJavaDoc xDoc = new SuperJavaDoc(userDir + "/src/main/java/com/allen198411", new SpringWebFramework());
        xDoc.build(out, new HtmlForamt());
    }

}