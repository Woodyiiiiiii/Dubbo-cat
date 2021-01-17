此项目是用SpringBoot使用dubbo直连的方式，没有使用注册中心，相关配置可从阿里巴巴官方文档[https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md](https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md) 中查看相关配置，并且可以配合教程视频观看。

可以学习的点有：
1. 此项目不同于官方dubbo-demo项目，没有公共接口子项目，需要在提供者和消费者都命名相同的接口类。
2. 学会SpringBoot纯注解的使用，比如要把提供者的接口实现类注册为Bean的@Component，消费者的使用接口的@Component，提供者的@Service将实现类实现相应的接口，消费者的@Reference注解，消费者和提供者的@EnableDubboConfiguration注解。
3. 删除文件的恢复手段可以对项目右键的Local History的Revert功能。