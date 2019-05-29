package com.example.solartest.base;

public interface BaseInterface {
    /**
     * author:王东慧
     * 2019/5/8
     */

    String Baseurl="http://127.0.0.1:4723/wd/hub";
    String appName="solar.apk";
    String appPackage = "com.example.lx.solarfragment";
    String appActivity = ".LoginActivity";

    String txt_path1="D:\\Android\\Solar\\Solarfragment\\solarTest\\data\\logindata.txt";
    String excel_path1="";
    String sheet_name="";
    String mysql_path="";

    //MailUtil
    String server = "smtp.qq.com";
    String user = "1941294473@qq.com";
    String password = "uijvgyalzszfcgef";

    //WebTestListener
    String enable_email = "true";
    String to_mail = "1941294473@qq.com";
    String mail_title = "\u6D4B\u8BD5";
    String success_to_mail = "1941294473@qq.com";

    //FreemarkerTemplateEngine
    String DEFAULT_TEMPLATE =
            "conf\\reportTemplate.html";
}
