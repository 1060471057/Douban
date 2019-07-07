# Douban
<h1>项目进度</h1>
19/7/5 ssm基础环境搭建完成，可正常使用逆向工程创建相关文件

<h1>ssm框架开发相关Bug</h1>
1.	idea无法引用长沙市全局样式且交视频页面获取绝对路径报错

![](https://github.com/1060471057/Douban/blob/master/Photo/20190707235058.png)

![](https://github.com/1060471057/Douban/blob/master/Photo/20190707235125.png)

解决：改jsp的时候不小心删除了head标签导致引入放置的位置不对，获取绝对路径则是换了种方法来解决 ${pageContext.request.contextPath}
