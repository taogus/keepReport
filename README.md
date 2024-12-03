![LOGO](/images/logo.png)

## 简介
keepReport一款Web数据分析报表工具，拥有精美直观界面设计，简单易用的操作体验，
提供了丰富的自定义选项，用户可根据实际业务需求自由配置报表样式，制作各式各样的的中国式报表

## 文档

进入在线文档：[点击查看](https://www.keepreport.com/)

## 更新日志
1.0.6更新日志：[点击查看](https://www.keepreport.com/zn/guide/%E5%BC%80%E5%8F%91%E8%AE%A1%E5%88%92/1.0.6.html)

## 安装

### 1、配置远程仓库
```xml
<repository>
    <id>keep-report-releases</id>
    <url>https://maven.keepreport.com/maven/repository</url>
</repository>
```

### 2、配置依赖包
> 安装依赖包需要大概几分钟，中文字体包较大

```xml
<dependency>
    <groupId>com.march.report</groupId>
    <artifactId>keep-report-spring-boot-starter</artifactId>
    <version>1.0.6</version> <!-- 最新版本请到在线文档查看 -->
</dependency>
```

## 项目启动

> 如需授权请联系下方的微信

- 运行Spring Boot `ReportDemoApplication` main 方法
- 启动服务后访问地址：`http://localhost:8888/keepReport/index`

## 项目配置

- 更改授权码文件内容目录：`/resources/static/license/march-license.txt`

- 更改LOGO文件目录：`/resources/static/designer/img/logo.png`

## 演示
地址：[演示地址](http://demo.keepreport.com/keepReport/keepReport)

## 界面
![img.png](/images/img.png)

## 报表示例

### 背景套打
![背景套打](/images/bgImgReport.png)

### 订单明细表
![订单明细表](/images/orderDetails.png)

### 数据钻取
![数据钻取](/images/dataDrilling.png)

### 分页重复表头
![重复表头](/images/repeatHeader.png)

### 分页打印
![分页打印](/images/ledgerPrint.png)


## 交流
| 微信扫码添加交流                  | 付款码                          |
|---------------------------|------------------------------|
| ![输入图片说明](/images/wx.png) | ![输入图片说明](/images/wxpay.png) |
