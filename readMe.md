
（1）@Component是spring是使用自动检测和使用类路径扫描配置bean，使得每个类一个bin
  @Bean是声明单个bean，不是让spring自动执行的，可以精准的创建和配置bean。

（2）当想要使用第三方类作为组件却没有源代码时，就可以用@Bean