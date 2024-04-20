![LOGO](/images/logo.png)

## 简介
keepReport一款Web数据分析报表工具，拥有精美直观界面设计，简单易用的操作体验，
提供了丰富的自定义选项，用户可根据实际业务需求自由配置报表样式，制作各式各样的的中国式报表

## 文档

进入在线文档：[点击查看](https://wiki.tt-u.cn/)

## 安装

### 1、配置远程仓库
```xml
<repository>
    <id>keep-report-releases</id>
    <url>https://maven.tt-u.cn/maven/repository</url>
</repository>
```

### 2、配置依赖包
```xml
<dependency>
    <groupId>com.march.report</groupId>
    <artifactId>keep-report-spring-boot-starter</artifactId>
    <version>1.0</version>
</dependency>
```

## 项目启动

> 如需授权请联系下方的微信

- 运行Spring Boot `ReportDemoApplication` main 方法
- 启动服务后访问地址：`http://localhost:8888/keepReport/index`

## 项目配置

- 更改授权码文件内容目录：`/resources/static/license/march-license.txt`
- 更改LOGO文件目录：`/resources/static/designer/img/noBg.png`

## 演示
地址：[演示地址](http://demo.tt-u.cn/keepReport/keepReport)

## 界面
![img.png](/images/img.png)

## 交流
| 微信扫码添加交流                  | 付款码                          |
|---------------------------|------------------------------|
| ![输入图片说明](/images/wx.png) | ![输入图片说明](/images/wxpay.png) |