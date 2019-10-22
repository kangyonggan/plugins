package com.github.ofofs.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author kyg
 * @date 2019-10-22
 */
public class FileHeaderPlugin extends PluginAdapter {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        genJavaDocs(topLevelClass.getJavaDocLines());
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        genJavaDocs(interfaze.getJavaDocLines());
        return true;
    }

    /**
     * 生成Java文档注释
     *
     * @param javaDocLines
     */
    private void genJavaDocs(List<String> javaDocLines) {
        javaDocLines.add("/**");
        javaDocLines.add(" * @author " + properties.getProperty("author", "mbg"));
        javaDocLines.add(" * @date " + DATE_FORMAT.format(new Date()));
        javaDocLines.add(" */");
    }
}
