package com.allinone.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

public class MyFastAutoGenerator {
    private static final Logger logger = LoggerFactory.getLogger(MyFastAutoGenerator.class);
    
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:sqlserver://localhost:1433;databaseName=allinone;encrypt=true;trustServerCertificate=true", "sa", "Allinone..AT2")
                .globalConfig(builder -> {
                    builder.author("wangzm") // 设置作者
                            .outputDir("src/main/java") // 设置全局输出目录
                            .disableOpenDir(); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.allinone") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "src/main/resources/mapper"))
                            .entity("domain") // 设置实体类包名
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .controller("controller"); // 设置 Controller 包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("Warehouse") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .execute();
        addGeneratedFilesToGit();
    }
    
    private static void addGeneratedFilesToGit() {
        try {
            // 添加生成的 Java 文件
            ProcessBuilder processBuilder = new ProcessBuilder("git", "add", "src/main/java/com/allinone");
            processBuilder.inheritIO().start().waitFor();
            
            // 添加生成的 Mapper XML 文件
            processBuilder = new ProcessBuilder("git", "add", "src/main/resources/mapper");
            processBuilder.inheritIO().start().waitFor();
            
            logger.info("Generated files added to Git.");
        } catch (Exception e) {
            logger.error("Failed to add generated files to Git.", e);
        }
    }
}
