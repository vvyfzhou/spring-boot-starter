package com.example.springbootstarter;

import java.io.File;
import java.net.URL;

public class JavaConfig {
    public JavaConfig() {
        File file = new File(this.getClass().getResource("/").getFile());
        System.out.println(file.toString());
        URL url = null;
        url = this.getClass().getClassLoader().getResource("com");
        System.out.println("aaa"+url.toString());
        uptest(file);
    }
    public void uptest (File file) {
        File[] files = file.listFiles();
        for(int i = 0; i < files.length; ++i) {
            if (files[i].getName().endsWith(".class")) {
                System.out.println("文件" + files[i].toString());
            }

            if (files[i].isDirectory()) {
                System.out.println("目录" + files[i].toString());
                uptest(files[i]);
            }
        }
    }
}
