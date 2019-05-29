package com.example.lineartest.utils;

import com.example.lineartest.base.BaseInterface;

import java.io.File;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
/**
 * Created by 王东慧 on 2019/5/29
 * FreeMarker的模板驱动
 */
public class FreemarkerTemplateEngine {
    private static final String DEFAULT_TEMPLATE = BaseInterface.DEFAULT_TEMPLATE;


    public String getTemplatePath() {
        return "";
    }

    public String run(Map context) throws Exception{
        return executeFreemarker(context);
    }

    private String executeFreemarker(Map context)throws Exception{
        String content="";
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(
                new File(getTemplatePath()));
        cfg.setEncoding(Locale.CHINA, "UTF-8");
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        cfg.setCacheStorage(new freemarker.cache.MruCacheStorage(20, 250));
        Template temp = cfg.getTemplate(getTemplate());
        StringWriter out = new StringWriter();
        temp.process(context, out);
        //System.out.print(out.toString());
        return out.toString();
    }


    public String getTemplate() {
        // TODO Auto-generated method stub
        return DEFAULT_TEMPLATE;
    }
}
