# 架构
## 前台不表
## 后台
典型的ＭＶＣ＋三层架构。

###　ＳＳＨ
+ Spring: 系统的所有对象均由ｓｐｒｉｎｇ托管，ｓｐｒｉｎｇ会自动创建对象及依赖注入。
+ Struts: 只做路由，所以的请求会被导到相应的控制器(Ａｃｔｉｏｎ或者Ａｐｉ)
+ Hibernate: ORM

下面以/ａｃｔｉｏｎ/ｎｅｗｓ/ｓｕｂｐａｇｅ/１为例，说明整个流程

### 控制层(Ａｃｔｉｏｎ)
请求被ｓｔｒｕｔｓ导到ＶｉｅｗＳｕｂＰａｇｅＡｃｔｉｏｎ，ｓｔｒｕｔｓ会向ｓｐｒｉｎｇ要求一个ViewSubPageAction对象，ｓｐｒｉｎｇ会创建一个此对象，并注入相关依赖，将路由中最后的１提取取来，做为参数，调用对象的ｓｅｔＰａｇｅＮｕｍ方法注入参数。

Ａction调用相关Ｓｅｒｖｉｃｅ（业务层）完成业务，并准备好一个Ｍodel对象（在ViewSubPageAction中，是mResult）。

确保Ａction执行完毕后，ｇｅｔＸＸＸ方法可以用。则在渲染Ｊｓｐ时，Ｊsp中可以直接使用ＸＸＸ。

另外，作为Ａｊａｘ后端的控制器，我一律命名为ＸＸＸＡｐｉ。参见ViewNewsDetailApi了解如何返回ｊｓｏｎ对象。

### 表现层(Ｊｓｐ)
根据ｓｔｒｕｔｓ-ｎｅｗ.ｘｍｌ的配置，ViewSubPageAction执行完毕后，调用/WEB-INF/view/news/subpage.jsp进行渲染。此时，我们可以直接在ｊｓｐ中调用`${result.XXX}`。

### 业务层(Ｓｅｒｖｉｃｅ)
ｃｏｍ.ｎ２ｃｊ.ｓｅｒｖｉｃｅ.ｉｍｐｌ中的一堆ＸＸＸＳｅｒｖｉｃｅＩｍｐｌ组成了业务层，控制层调用业务层来完成各种任务。

注意！所有Ｓｅｒｖｉｃｅ对象都是单例，所以，请确保这些对象都是线程安全的！默认情况下，如果它们都是无状态，那么，ｍｙｓｑｌ的事务机制可以保证对ｍｙｓｑｌ的操作都是线程安全的。

### 存储层(Ｄａｏ+Ｅｎｔｉｔｙ)
Ｍｙｓｑｌ　ＯＲＭ是在这一层做的。你们按照自己的业务，改成你们的数据库。

目前，我没有帮你们弄缓存相关的东西，如果你们需要，到时再加个ｒｅｄｉｓ缓存层。这些缓存可以通过ｓｐｒｉｎｇ　ａｎｎｏｔａｔｉｏｎ加到Ｓｅｒｖｉｃｅ上面，不对其他代码产生任何影响，比较好用，用到再说吧。

# 配置管理
所有的配置都放在了ｃｏｍｍｏｎ/ａｐｐ.ｐｒｏｐｅｒｉｔｅｓ，在代码中需要时，使用@Ｖａｌｕｅ注入，在ｓｐｒｉｎｇ配置文件中需要时，使用${}语法。注意，在生产环境中，我们可以提供一个新的配置文件，来对它进行覆盖。这个等你们要发布时再说吧。

另外，还在一个ｌｏｇｂａｃｋ.ｘｍｌ，是用来配置ｌｏｇ的，这个你们用默认的就行了，生产环境中同样会覆盖。

# 运行
+ 使用ｍａｖｅｎ运行:
    + 进行目录，运行ｍｖｎ　ｔｏｍｃａｔ７:ｒｕｎ
    + 打开浏览器，访问ｌｏｃａｌｈｏｓｔ:８０８０即可
+ 使用ｅｃｌｉｐｓｅ
    + 配置好ｔｏｍｃａｔ７
    + 在ｔｏｍｃａｔ７中，将项目的ｃｏｎｔｅｘｔＰａｔｈ设置为/(默认是/＋项目名)
    + 右键ｒｕｎＯｎＳｅｒｖｅｒ

# 发布
发布时还有一些注意事项，到时再说吧