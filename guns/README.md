# 遇到的问题及解决



## 一、配置问题



### 1. Jar包问题

**2021/01/20：**

遇到报错，com.sun.javaFx包找不到，是JDK的问题，因此我在IDEA下载了JDK11版本，不行，又下载了1.8版本，才找到了该包。



然后运行时出现“IDEA error: java: 无效的发行版本: 11”错误，更改Project Structure的JDK配置，统一改成本项目的JDK1.8版本(才发现在pom文件已注明了Java-version是1.8，所以早该使用1.8版本了)，然后还是不行，发现**重新刷新Maven导入按钮**就成功了。





### 2. MySQL连接问题

无法启动GunsApplication，原因是无法与数据库连接。因为其项目的MySQL版本是5.7，而我本地数据库版本是8，驱动是com.mysql.cj而不是com.mysql。



即使在application.yml中加入驱动也无效，可能跟mybatis有关。